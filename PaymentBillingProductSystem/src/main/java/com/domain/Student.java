package com.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	private long id;
	private String name;
	private String fathersname;
	private String address;
	private float fee;
	private int mobileno;
	

	protected Student() {
	}

	protected Student(long id, String name, String fathersname, String address, float fee,int mobileno) {
		super();
		this.id = id;
		this.name = name;
		this.fathersname = fathersname;
		this.address = address;
		this.fee = fee;
		this.mobileno=mobileno;
	}
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFathersname() {
		return fathersname;
	}

	public void setFathersname(String fathersname) {
		this.fathersname = fathersname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public float getFee() {
		return fee;
	}

	public void setFee(float fee) {
		this.fee = fee;
	}

	public int getMobileno() {
		return mobileno;
	}

	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}

	
	
}
