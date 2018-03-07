package com.alptium.personalfitness;

public class Workout {
		
		private String name;
		private String surname;
		private String gender;
		private String injuries;
		
		public Workout (String name, String surname, String gender, String injuries) {
			this.name = name;
			this.surname = surname;
			this.gender = gender;
			this.injuries = injuries; 
			}
			
			public String getName() {
				return name;
			}
			public String getSurname() {
				return surname;
			}
			public String getGendre() {
				return gender;
			}
			public String getInjuries() {
				return injuries;
			}
		}
		
