package com.main.services;

import java.util.Optional;

import com.main.entity.MarriageSeeker;

public interface IMarriageSeekerService 
{
    public String registerMarriageSeeker(MarriageSeeker seeker);
    public Optional<MarriageSeeker> getMarriageSeekerById(Integer id);
}
