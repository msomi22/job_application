/**
 * 
 */
package com.hackerthon.safaricom.entity;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.ZonedDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author peter
 *
 */
@Entity
public class Job {
	
	@Id
	private String id;
	
	@Column(name="date_created")
	private ZonedDateTime date_created;
	
	private String name;
	private String description;
	private String type;
	private String years_of_experience;
	private String education_level;
	private String status;
	private Date interview_date;
	private Timestamp interview_start_time;
	private Timestamp interview_end_time;
	
	/**
	 * 
	 */
	public Job() {
		id = UUID.randomUUID().toString().toUpperCase();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ZonedDateTime getDate_created() {
		return date_created;
	}

	public void setDate_created(ZonedDateTime date_created) {
		this.date_created = date_created;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getYears_of_experience() {
		return years_of_experience;
	}

	public void setYears_of_experience(String years_of_experience) {
		this.years_of_experience = years_of_experience;
	}

	public String getEducation_level() {
		return education_level;
	}

	public void setEducation_level(String education_level) {
		this.education_level = education_level;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getInterview_date() {
		return interview_date;
	}

	public void setInterview_date(Date interview_date) {
		this.interview_date = interview_date;
	}

	public Timestamp getInterview_start_time() {
		return interview_start_time;
	}

	public void setInterview_start_time(Timestamp interview_start_time) {
		this.interview_start_time = interview_start_time;
	}

	public Timestamp getInterview_end_time() {
		return interview_end_time;
	}

	public void setInterview_end_time(Timestamp interview_end_time) {
		this.interview_end_time = interview_end_time;
	}

	@Override
	public String toString() {
		return "Job [id=" + id + ", date_created=" + date_created + ", name=" + name + ", description=" + description
				+ ", type=" + type + ", years_of_experience=" + years_of_experience + ", education_level="
				+ education_level + ", status=" + status + ", interview_date=" + interview_date
				+ ", interview_start_time=" + interview_start_time + ", interview_end_time=" + interview_end_time + "]";
	}

}
