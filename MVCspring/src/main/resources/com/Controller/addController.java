package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class addController {

	@RequestMapping("/add")
	public void add()
	{
		System.out.println("I am here");
	}
}
