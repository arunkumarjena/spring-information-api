package com.arun.test.info;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Information {
	@Id
	private String id;
	private String name;
	private String course;
	private String branch;
	public Information() {
		
	}
	public Information(String id, String name, String course, String branch) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.branch = branch;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
}