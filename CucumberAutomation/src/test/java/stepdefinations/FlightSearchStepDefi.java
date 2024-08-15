package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlightSearchStepDefi {
		
	@Given("I am on flight booking page")
	public void i_am_on_flight_booking_page() {
		System.out.println("I am on flight booking page");
	}
	
	@When("I enter departure city {string} and arrival city {string}")
	public void i_enter_departure_city_and_arrival_city(String depCity, String arrivalCity){
		System.out.println("I enter departure city "+depCity+" and arrival city "+arrivalCity);
	}

	@When("I search for flights")
	public void i_search_for_flights() {
		System.out.println("I search for flights");
	}

	@Then("I should see available flights")
	public void i_should_see_available_flights() {
		System.out.println("I should see available flights");
	}

}
