package com.spoonacular.meals.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeekResponse {
	
//	@JsonProperty("week")
	private Day dayOfWeek;

	public Day getWeek() {
		return dayOfWeek;
	}

	public void setWeek(Day week) {
		this.dayOfWeek = week;
	}
	
	
//	private Week week;
//
//	public Week getWeek() {
//		return week;
//	}
//
//	public void setWeek(Week week) {
//		this.week = week;
//	}
	
//	@JsonProperty("day")
//	private List<Day> day;
//
////	@JsonProperty("week")
////	private List<Week> week;
////
////	public List<Week> getWeek() {
////		return week;
////	}
////
////	public void setWeek(List<Week> week) {
////		this.week = week;
////	}
//
//	
//	public List<Day> getDay() {
//		return day;
//	}
//
//	public void setDay(List<Day> day) {
//		this.day = day;
//	}
	
//	@JsonProperty("meals")
//	private List<Meal> meals;
//	
//	@JsonProperty("nutrients")
//	private Nutrients nutrients;

	
	
//	public List<Meal> getMeals() {
//		return meals;
//	}
//
//	public void setMeals(List<Meal> meals) {
//		this.meals = meals;
//	}
//
//	public Nutrients getNutrients() {
//		return nutrients;
//	}
//
//	public void setNutrients(Nutrients nutrients) {
//		this.nutrients = nutrients;
//	}
	
	
	
//	@JsonProperty("")
//	private String numCalories;
//	@JsonProperty("")
//	private String diet;
//	@JsonProperty("")
//	private String exclusions;
//	
//	
//	public String getNumCalories() {
//		return numCalories;
//	}
//	public void setNumCalories(String numCalories) {
//		this.numCalories = numCalories;
//	}
//	public String getDiet() {
//		return diet;
//	}
//	public void setDiet(String diet) {
//		this.diet = diet;
//	}
//	public String getExclusions() {
//		return exclusions;
//	}
//	public void setExclusions(String exclusions) {
//		this.exclusions = exclusions;
//	}
	
	

}

