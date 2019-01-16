package com.spring.job.app;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.job.app.entity.JobApplicant;

@RestController()
@RequestMapping("/applicant") 
public class ApplicantController {

	@Autowired
	ApplicantRepository repo;
	//TODO validation plus throws

	/**
	 * 
	 * @param phone
	 * @return
	 */
	@RequestMapping(path="/getall", method=RequestMethod.GET)
	public Object getApplicants() {
		System.out.println("***********");
		try {
			//TODO validation plus throw
			return ResponseEntity.ok(repo.findAll());  
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}

	}
	
	/**
	 * 
	 * @param phone
	 * @return
	 */
	@RequestMapping(path="/get", method=RequestMethod.GET)
	public Object getApplicant(@RequestParam(value="phone", defaultValue="0718953974") String phone) {
		System.out.println("***********->" + phone);
		try {
			//TODO validation plus throw
			return ResponseEntity.ok(repo.findByPhone(phone)); 
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}

	}
	/**
	 * 
	 * @param jobApplicant
	 * @return
	 */
	@RequestMapping(path="/new", method=RequestMethod.POST)
	public Object newApplicant(JobApplicant newApplicant) {
		try {
			//TODO validation plus throw
			repo.save(newApplicant);
			return ResponseEntity.created(new URI("/"+newApplicant.getPhone())).build();     
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.CONFLICT).build();
		}

	}
	/**
	 * 
	 * @param jobApplicant
	 * @param phone
	 * @return
	 */
	@RequestMapping(path="/update", method=RequestMethod.PUT)
	public Object updateApplicant(JobApplicant applicant, @RequestParam(value="id") String id) {
		//TODO validation plus throw
		try {
			JobApplicant currentApplicant = repo.findById(id);
			currentApplicant = applicant;
			//TODO implement update 
			repo.updateByPhone(currentApplicant.getFirst_name(), currentApplicant.getLast_name(), id); 
			return ResponseEntity.noContent().build();    
		}catch (Exception e) {
			return ResponseEntity.notFound().build();
		}


	}
	/**
	 * 
	 * @param phone
	 * @return
	 */
	@RequestMapping(path="/delete", method=RequestMethod.DELETE)
	public Object deleteApplicant(@RequestParam(value="id") String id) {
		//TODO validation plus throw
		try {
			JobApplicant jobApp = repo.findById(id);
			repo.delete(jobApp);
			return ResponseEntity.noContent().build(); 
		}catch (Exception e) {
			return ResponseEntity.notFound().build();
		}
	
	}

}
