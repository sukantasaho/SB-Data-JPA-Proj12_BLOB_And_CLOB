package com.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.main.entity.MarriageSeeker;
import com.main.services.IMarriageSeekerService;

@SpringBootApplication
public class SbDataJpaProj12BlobAndClobApplication 
{

	public static void main(String[] args) throws IOException 
	{
		  ApplicationContext ctx =  SpringApplication.run(SbDataJpaProj12BlobAndClobApplication.class, args);
		  IMarriageSeekerService service = ctx.getBean("mService", IMarriageSeekerService.class);
		  
		  
		  Scanner scn = new Scanner(System.in);
		  System.out.print("Enter your name:");
		  String name = scn.next();
		  System.out.print("Enter your address:");
		  String address = scn.next();
		  System.out.print("Enter photo address:");
		  String photo_path = scn.next();
		  System.out.print("Enter biodata address:");
		  String biodata_path = scn.next();
		  System.out.print("Are you indian?:");
		  boolean flag = scn.nextBoolean();
		  
		  //convert the photo file content to byte[]
		  FileInputStream fis = new FileInputStream(photo_path);
		   byte[] photoData = fis.readAllBytes();
		   //convert the resume file content to char[]
		   File file = new File(biodata_path);
		   FileReader reader = new FileReader(file);
		   char[] biodata = new char[(int)file.length()];
		   reader.read(biodata);
		   //create entity class object
		   MarriageSeeker ms = new MarriageSeeker(name,address,LocalDate.now(),photoData,biodata,flag);
		   String msg = service.registerMarriageSeeker(ms);
		   System.out.println(msg);
		   
		   
		   
		   ((ConfigurableApplicationContext) ctx).close();
		  
	}

}
