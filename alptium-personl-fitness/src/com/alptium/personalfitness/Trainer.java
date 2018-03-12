package com.alptium.personalfitness;

public class Trainer {
	
	private String name;
	private String surname;
	private boolean yearsOfExperience;
	private boolean isAvailable;
	
	public Trainer(String name, String surname, boolean yearsOfExperience, boolean isAvailable) {
		this.name = name;
		this.surname = surname;
		this.yearsOfExperience = yearsOfExperience;
		this.isAvailable = isAvailable;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
		
	public boolean isAvailable() {
		return isAvailable;
	}

	public boolean yearsOfExperience() {
		return yearsOfExperience;
	}
	
}
