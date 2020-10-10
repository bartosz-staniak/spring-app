package springapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebClass {

	@GetMapping("/printSoemthing")
	public String printSomething() {
		return "something";
	}
	
}
