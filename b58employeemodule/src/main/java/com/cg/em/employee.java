package com.cg.em;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class employee {

	private int id;
	private String name;
	private Date dob;
	
	private float salary;
	private String address;
	private String designation;
	
	
	public employee() {
		super();
	}

	public employee(int id, String name, Date dob, float salary, String address, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.salary = salary;
		this.address = address;
		this.designation = designation;
	}

	
	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", dob=" + dob + ", salary=" + salary + ", address=" + address
				+ ", designation=" + designation + ", getId()=" + getId() + ", getName()=" + getName() + ", getDob()="
				+ getDob() + ", getSalary()=" + getSalary() + ", getAddress()=" + getAddress() + ", getDesignation()="
				+ getDesignation() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	
}
