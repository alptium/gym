package com.alptium.personalfitness;

public class Workout {
		
		private String gender;
		private boolean injuries;
		
		public Workout (String gender, boolean injuries) {
			
			this.gender = gender;
			this.injuries = injuries; 
			}
			public String getGendre() {
				return gender;
			}
			public boolean getInjuries() {
				return injuries;
			}
		}
		
