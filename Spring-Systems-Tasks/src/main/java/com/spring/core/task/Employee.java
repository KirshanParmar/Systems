package com.spring.core.task;

public class Employee {
	private Integer id;
	private String name;
	private String gender;
	private String emplCode;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmplCode() {
		return emplCode;
	}
	public void setEmplCode(String emplCode) {
		this.emplCode = emplCode;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", emplCode=" + emplCode + "]";
	}
	
	
}
