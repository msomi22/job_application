/**
 * 
 */
package com.spring.job.app.entity;

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
public class JobApplicant {
	
	@Id
	private String id;
	
	@Column(name="date_created")
	private ZonedDateTime date_created;
	
	private String first_name;
	private String last_name;
	private String email;
	private String phone;
	private String education_level;
	private String years_of_experience;

	public JobApplicant() {
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

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEducation_level() {
		return education_level;
	}

	public void setEducation_level(String education_level) {
		this.education_level = education_level;
	}

	public String getYears_of_experience() {
		return years_of_experience;
	}

	public void setYears_of_experience(String years_of_experience) {
		this.years_of_experience = years_of_experience;
	}

	@Override
	public String toString() {
		return "JobApplicant [id=" + id + ", date_created=" + date_created + ", first_name=" + first_name
				+ ", last_name=" + last_name + ", email=" + email + ", phone=" + phone + ", education_level="
				+ education_level + ", years_of_experience=" + years_of_experience + "]";
	}

}
