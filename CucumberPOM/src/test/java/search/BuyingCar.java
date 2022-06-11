package search;

import java.util.List;
import java.util.Map;

import io.cucumber.java.DataTableType;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class BuyingCar {

	@ParameterType("(.+?)")
	public Color colors(String allcolors) {
		// may be you can connect to Db and check whether the required color is present
		// or not
		Color c = new Color();
		c.name = allcolors.split(",")[0];
		return c;

	}

	@ParameterType("(.+?)")
	public Users user(String address) {
		Users u = new Users();
		u.hno = address.split(",")[0];
		u.loc = address.split(",")[1];
		u.city = address.split(",")[2];
		u.country = address.split(",")[3];
		return u;

	}

	@Given("I go to buy a car")
	public void buy_car() {
		System.out.println("I go to buy a car");
	}

	@And("run on {string} with this {string}")
	public void browserenv(String brow, String url) {
		System.out.println("Runed on " + brow + " and env is " + url);
	}

	@And("car must be of {string}")
	public void car_type(String brand) {
		System.out.println("car must be of " + brand + "");
	}

	@And("car can be {colors} in color")
	public void car_color(Color color) {
		System.out.println("car must be " + color.name + " in color");
	}

	@And("address is {user}")
	public void get_address(Users user) {
		user.print_userdetails();
	}

	@Then("I should get white cars in result")
	public void car_result() {
		System.out.println("I should get white cars in result");
	}

	@And("^car must be atleast (\\d+) years old$")
	public void car_age(int age) {
		System.out.println("car must be atleast " + age + " years old");
	}

	@But("car should be be damaged")
	public void car_condition() {
		System.out.println("car should be be damaged");
	}

//	@And("car should have all the links")
//	public void car_details(DataTable table) {
//		System.out.println(table);
//		List<Map<String, String>> data = table.asMaps();
//		System.out.println(data.get(0).get("Links"));
//		System.out.println(data.get(0).get("Title"));
//		System.out.println(data.get(0).get("Group"));
//		System.out.println(data.get(1).get("Links"));
//		System.out.println(data.get(1).get("Title"));
//		System.out.println(data.get(1).get("Group"));
//	}

	@And("car should have all the links")
	public void car_details(List<CarDetails> cardetails) {
		System.out.println(cardetails.get(0).links);
		System.out.println(cardetails.get(0).title);
		System.out.println(cardetails.get(0).group);
		System.out.println(cardetails.get(1).links);
		System.out.println(cardetails.get(1).title);
		System.out.println(cardetails.get(1).group);
	}

	@DataTableType
	public CarDetails entry(Map<String, String> entry) {
		System.out.println("entry called");
		return new CarDetails(entry.get("Links"), entry.get("Title"), entry.get("Group"));
	}

}
