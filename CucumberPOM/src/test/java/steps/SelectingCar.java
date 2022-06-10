package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class SelectingCar {

	@When ("I search for cars")
    public void car_search()
    {
    	System.out.println("I search for cars");
    }
    
    @And ("I selct city as Tokyo")
    public void car_city()
    {
    	System.out.println("I selct city as Tokyo");
    }
}
