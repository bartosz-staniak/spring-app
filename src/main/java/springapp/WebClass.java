package springapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebClass {

	@GetMapping("/printSomething")
	public String printSomething() {
		return "something";
	}
	
	@GetMapping("/getCurrentDate")
	public String getCurrentDate() {
		String date = ("Today is " + (java.time.LocalDate.now()).toString() + ".");
		return date;
	}
	
}
