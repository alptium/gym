package com.alptium.personalfitness;

public class Member {

	// Members info
	
	private String firstName;
	private String lastName;
	private int birthYear;
	private int memberId;
	private char gender;
	private String address;
	private boolean hasInjuries;
	
	public Member(String firstName, String lastName, int birthYear, int memberId, char gender, String address, boolean hasInjuries) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
		this.memberId = memberId;
		this.gender = gender;
		this.address = address;
		this.hasInjuries = hasInjuries;
		
		}
			public String getFirstName() {
			return firstName;
			
			} public String getLastName() {
			return lastName;
		
			} public int getBirthYear() {
			return birthYear;
			
			} public int getMemberId() {
			return memberId;
			
			} public char getGender() {
			return gender;
		
			} public String getAddress() {
			return address;
		
			} public boolean getHasInjuries() {
			return hasInjuries;
		
	}
}
