package com.alptium.personalfitness;

public class Workout {
		
		private char gender;
		private boolean injuries;
		private String workoutM;
		private String workoutF;
		
		public Workout (char gender, boolean injuries, String workoutM, String workoutF) {
			
			this.gender = gender;
			this.injuries = injuries;
			this.workoutM = workoutM;
			this.workoutF = workoutF;
			}
			public char getGendre() {
					return gender;
			}
			public boolean getInjuries() {
					return injuries;
			}
			public String getWorkoutM() {
					return workoutM;
			}
			public String getWorkoutF() {
					return workoutF;
			}
		}
		
