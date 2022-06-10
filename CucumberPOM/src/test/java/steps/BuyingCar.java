package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuyingCar {
	
	@Given ("I go to buy a car")
	public void buy_car()
	{
		System.out.println("I go to buy a car");
	}
	
	@And ("car must be of {string}")
	public void car_type(String brand)
	{
		System.out.println("car must be of "+brand+"");
	}

    @And ("car must be white in color")
    public void car_color()
    {
    	System.out.println("car must be white in color");
    }
       
    @Then ("I should get white cars in result")
    public void car_result()
    {
    	System.out.println("I should get white cars in result");
    }
    
    @And ("car must be atleast {int} years old")
    public void car_age(int age)
    {
    	System.out.println("car must be atleast "+age+" years old");
    }
    
    @But ("car should be be damaged")
    public void car_condition()
    {
    	System.out.println("car should be be damaged");
    }
	

}
