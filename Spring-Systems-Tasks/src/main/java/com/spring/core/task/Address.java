/**
 * 
 */
package com.spring.core.task;

/**
 * @author kirshan.lal
 *
 */
public class Address {

	private Integer id;
	private String name;
	private String gender;
	private String emplCode;
	private String address;

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", name=" + name + ", gender=" + gender + ", emplCode=" + emplCode + ", address="
				+ address + "]";
	}

	
	
	
}
