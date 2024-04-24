package com.main.entity;

import java.io.Serializable;
import java.time.LocalDate;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="JPA_MARRIAGE_SEEKER_TAB")
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class MarriageSeeker implements Serializable
{
	 @Id
	 @SequenceGenerator(name = "gen1", sequenceName = "JPA_MARRIAGE_ID_SEQ", initialValue = 10000, allocationSize = 1)
	 @GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
     private Integer id;
	 
	 @NonNull
     private String name;
	 
	 @NonNull
     private String addrs;
	 
	 @NonNull
     private LocalDate dob;
     
     @Lob
     @NonNull
     private byte[] photo;
     
     @Lob
     @NonNull
     private char[] biodata;
     
     @NonNull
     private boolean indian;
     
}
