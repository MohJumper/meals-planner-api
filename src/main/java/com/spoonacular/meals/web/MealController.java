package com.spoonacular.meals.web;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.spoonacular.meals.dto.DayResponse;
import com.spoonacular.meals.dto.WeekResponse;

@RestController
public class MealController {
	
	
	@GetMapping("/mealplanner/week")
	public ResponseEntity<WeekResponse> getWeekMeals(String numCalories, String diet, String exclusions) {
		RestTemplate rt =  new RestTemplate();
		
		URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
									  .queryParam("timeFrame", "week")
									  .queryParam("targetCalories", "2000")
									  .queryParam("diet", "vegetarian")
									  .queryParam("apiKey", "1eba4585bb874f9b9361f38b71b21f43")
									  .build()
									  .toUri();
		// string.class will return long string of data not well formated just for testing.
		ResponseEntity<WeekResponse> response = rt.getForEntity(uri, WeekResponse.class); // this return more data 
//		String response = rt.getForObject(uri, String.class);
//		System.out.println(response.getBody());	
		return response;
		
	}

	@GetMapping("/mealplanner/day")
	public ResponseEntity<DayResponse> getDayMeals(String numCalories, String diet, String exclusions){
		RestTemplate rt =  new RestTemplate();
		
		URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
									  .queryParam("timeFrame", "day")
									  .queryParam("targetCalories", "2000")
									  .queryParam("diet", "vegetarian")
									  .queryParam("apiKey", "1eba4585bb874f9b9361f38b71b21f43")
									  .build()
									  .toUri();
		// string.class will return long string of data not well formated just for testing.
		ResponseEntity<DayResponse> response = rt.getForEntity(uri, DayResponse.class); // this return more data 
//		String response = rt.getForObject(uri, String.class);
//		System.out.println(response.getBody());	
		return response;
	}

}
