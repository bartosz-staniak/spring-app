package springapp;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebClass {

	public String printSomething() {
		return "something";
	}
	
}
