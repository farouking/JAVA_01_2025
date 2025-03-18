package com.codingdojo.Human;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanHelloController {

    // First Route: Simple greeting
    @RequestMapping("/")
    public String hellohuman(@RequestParam(value = "q", required = false) String searchQuery) {
        if (searchQuery != null) {
            return "Hello: " + searchQuery;
        }
        return "Hello Human!";
    }
//http://localhost:8080/
//http://localhost:8080/?q=Farouk    
    
    // Ninja Bonus: First and Last Name
    @RequestMapping("/greet")
    public String hellohuman(
            @RequestParam(value = "firstName", required = false) String firstName,
            @RequestParam(value = "lastName", required = false) String lastName) {

        if (firstName == null) firstName = "Human";  // Default if no first name provided
        if (lastName == null) lastName = "";         // Default empty string for last name

        return "Hello " + firstName + " " + lastName + "!";
    }
     //http://localhost:8080/greet?firstName=Farouk&lastName=SOUISSI
    // Sensei Bonus: Repeat Greeting
    @RequestMapping("/repeat")
    public String repeatHello(
            @RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "times", required = false) Integer times) {

        if (name == null) name = "Human"; // Default if no name provided
        if (times == null || times < 1) times = 1; // Default to 1 if times is not provided or invalid

        String greeting = "Hello " + name + "!<br>";
        return greeting.repeat(times);
    }
}
//http://localhost:8080/repeat?name=Farouk&times=3