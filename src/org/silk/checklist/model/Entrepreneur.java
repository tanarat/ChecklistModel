package org.silk.checklist.model;

public class Entrepreneur {
	private long id;
	private String companyName;
	private String address;
	
	public Entrepreneur() {
		super();
	}
	public Entrepreneur(long id, String companyName, String address) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.address = address;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
