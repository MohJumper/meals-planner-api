package com.spoonacular.meals.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DayResponse {
	
	
	// map the name of the key
	@JsonProperty("meals")
	private List<Meal> meals;
	
	@JsonProperty("nutrients")
	private Nutrients nutrients;

	
	public Nutrients getNutrients() {
		return nutrients;
	}

	public void setNutrients(Nutrients nutrients) {
		this.nutrients = nutrients;
	}
	
	

}
