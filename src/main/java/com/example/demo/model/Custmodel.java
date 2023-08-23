package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Customer")
public class Custmodel {
	@Id
	private int custid;
	private String custname;
	private String address;
	private int pincode;
	private long phoneno;
	private String emailid;
	public Custmodel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Custmodel(int custid, String custname, String address, int pincode, long phoneno, String emailid) {
		super();
		this.custid = custid;
		this.custname = custname;
		this.address = address;
		this.pincode = pincode;
		this.phoneno = phoneno;
		this.emailid = emailid;
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	

}
