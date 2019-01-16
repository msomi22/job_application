/**
 * 
 */
package com.spring.job.app;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.job.app.entity.Job;

/**
 * @author peter
 *
 */
@Repository
public interface JobRepository extends CrudRepository<Job, Long>{

}
