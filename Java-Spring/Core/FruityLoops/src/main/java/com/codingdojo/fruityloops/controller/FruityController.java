package com.codingdojo.fruityloops.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.fruityloops.model.Item;

@Controller
@RequestMapping("/")
public class FruityController {
	
	 @RequestMapping("")
	    public String chooseMethod(Model model) {

	        ArrayList<Item> fruits = new ArrayList<Item>();
	        fruits.add(new Item("Kiwi", 1.5));
	        fruits.add(new Item("Mango", 2.0));
	        fruits.add(new Item("Goji Berries", 4.0));
	        fruits.add(new Item("Guava", .75));
	        System.out.println(fruits.get(0).name);
	        model.addAttribute("fruits", fruits);
	        return "index.jsp";
	    }


}