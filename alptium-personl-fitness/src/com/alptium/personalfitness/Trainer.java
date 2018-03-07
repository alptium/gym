package com.alptium.personalfitness;

public class Trainer {
	
	private String name;
	private String surname;
	private int yearsOfExperience;
	private boolean isAvailable;
	
	public Trainer(String name, String surname, int yearsOfExperience, boolean isAvailable) {
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
	
	public int getBirthYear() {
		return yearsOfExperience;
	}
	
	public boolean isAvailable() {
		return isAvailable;
	}
	
}
