package com.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.entity.MarriageSeeker;

public interface IMarriageSeekerRepository extends JpaRepository<MarriageSeeker, Integer>
{

}
