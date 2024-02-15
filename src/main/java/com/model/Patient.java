package com.model;

public class Patient {
	private String name;
	private String gender;
	private int phone;
	private String DOB;
	private boolean isMarried;
	private String presentAddress;
	private String communicationtAddress;
	private String pastMedication;
	private String otherDetails;
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
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public boolean isMarried() {
		return isMarried;
	}
	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	public String getPresentAddress() {
		return presentAddress;
	}
	public void setPresentAddress(String presentAddress) {
		this.presentAddress = presentAddress;
	}
	public String getCommunicationtAddress() {
		return communicationtAddress;
	}
	public void setCommunicationtAddress(String communicationtAddress) {
		this.communicationtAddress = communicationtAddress;
	}
	public String getPastMedication() {
		return pastMedication;
	}
	public void setPastMedication(String pastMedication) {
		this.pastMedication = pastMedication;
	}
	public String getOtherDetails() {
		return otherDetails;
	}
	public void setOtherDetails(String otherDetails) {
		this.otherDetails = otherDetails;
	}
	
}
