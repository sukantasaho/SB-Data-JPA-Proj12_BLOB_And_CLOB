package com.main.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.entity.MarriageSeeker;
import com.main.repository.IMarriageSeekerRepository;

@Service("mService")
public class MarriageSeekerServiceImp implements IMarriageSeekerService 
{
	
	@Autowired
	private IMarriageSeekerRepository repo;

	@Override
	public String registerMarriageSeeker(MarriageSeeker seeker)
	{
		 
		return "MarriageSeeker details is saved with id-"+repo.save(seeker).getId();
	}

	@Override
	public Optional<MarriageSeeker> getMarriageSeekerById(Integer id)
	{
		 
		return repo.findById(id);
	}

}
