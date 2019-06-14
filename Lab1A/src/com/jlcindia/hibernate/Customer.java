package com.jlcindia.hibernate;

public class Customer {

	private int cid;     //PK
	private String cname;
	private String email;   //we can use samename or diff name variable as a table.
	private long phone;
	private  String city;
	private double bal;
//	public Customer() {}   //while reading of an object from db internally hibernate creates and
	//obj of persistance class by calling default constructor.
	//if there is no default const in a class then its obj cannt loaded from db.
	public Customer(String cname, String email, long phone,String city, double bal) {
		// TODO Auto-generated constructor stub
		this.cname=cname;
		this.email=email;
		this.phone=phone;
		this.city=city;
		this.bal=bal;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

}
