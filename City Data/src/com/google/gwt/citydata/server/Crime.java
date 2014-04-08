package com.google.gwt.citydata.server;

import java.io.Serializable;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Crime implements Serializable {
	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long cid;
	@Persistent
	private String type;
	@Persistent
	private String year;
	@Persistent
	private String month;
	@Persistent
	private String address;
	@Persistent
	private double latitude;
	@Persistent
	private double longitude;
	@Persistent
	private int occurances;
	
	public Crime(){
		
	}
	
	public Long getCID() {
		return this.cid;
	}
	
	public String getType() {
		return this.type;
	}
	
	public String getYear() {
		return this.year;
	}
	
	public String getMonth() {
		return this.month;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public double getLatitude() {
		return this.latitude;
	}
	
	public double getLongitude() {
		return this.longitude;
	}
	
	public int getOccurances() {
		return this.occurances;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setYear(String year) {
		this.year = year;
	}
	
	public void setMonth(String month) {
		this.month = month;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	public void setOccurances(int occurances) {
		this.occurances = occurances;
	}

}
