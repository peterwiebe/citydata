package com.google.gwt.citydata.shared;

import java.io.Serializable;

public class CrimeDTO implements Serializable {
	
	  private String type;
	  private String year;
	  private String month;
	  private String address;
	  private double latitude;
	  private double longitude;
	  private int occurrences;
	  
	  public CrimeDTO(){  
	  }
	  
	  public String getType()
	  {
		  return this.type;
	  }

	  public String getYear()
	  {
		  return this.year;
	  }

	  public String getMonth()
	  {
		  return this.month;
	  }

	  public String getAddress()
	  {
		  return this.address;
	  }
	  
	  public double getLatitude()
	  {
		  return this.latitude;
	  }
	  
	  public double getLongitude()
	  {
		  return this.longitude;
	  }
	  
	  public double getOccurrences()
	  {
		  return this.occurrences;
	  }
	  
	  public void setAddress(String address) {
		  this.address = address;
	  }

	  public void setType(String type) {
		  this.type = type;
	  }

	  public void setMonth(String month) {
		  this.month = month;
	  }

	  public void setYear(String year) {
		  this.year = year;
	  }
	  
	  public void setLatitude(double latitude) {
		  this.latitude = latitude;
	  }
	  
	  public void setLongitude(double longitude) {
		  this.longitude = longitude;
	  }
	  
	  public void setOccurrences(int occurrences) {
		  this.occurrences = occurrences;
	  }

}
