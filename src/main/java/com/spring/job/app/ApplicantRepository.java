package com.spring.job.app;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.job.app.entity.JobApplicant;

@Repository
public interface ApplicantRepository extends CrudRepository<JobApplicant, Long>{
	
	List<JobApplicant> findByPhone(String phone); 
	
	JobApplicant findById(String id);  
	
	@Modifying
	@Query("update JobApplicant a set a.first_name =?1, a.last_name =?2 where a.id =?3")
	void updateByPhone(String firstname, String lastname, String id);  
}
