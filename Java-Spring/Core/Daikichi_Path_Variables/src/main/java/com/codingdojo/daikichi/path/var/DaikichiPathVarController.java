package com.codingdojo.daikichi.path.var;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiPathVarController {

    // Route for travel
    @RequestMapping("/travel/{country}")
    public String showTravelMessage(@PathVariable("country") String country) {
        return "Congratulations! You will soon travel to " + country;
    }

    // Route for lotto
    @RequestMapping("/lotto/{number}")
    public String showLottoMessage(@PathVariable("number") int number) {
        if (number % 2 == 0) { 
            return "You will take a grand journey in the near future, but be wary of tempting offers!";
        } else {
            return "You have enjoyed the fruits of your labor, but now is a great time to spend time with family and friends.";
        }
    }
}
