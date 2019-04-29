package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.objects.InputObject;
import com.objects.OutputObject;
import com.wordnik.swagger.annotations.Api;

@Controller
@Api(tags="Customer Controller")
public class ControllerSwagger {

	@GetMapping("/api/index")
	@ResponseBody
	public String index() {
		return "holaasdasd";
	}

	
	/// <summary>
	/// This is method summary I want displayed
	/// </summary>
	/// <param name="guid">guid as parameter</param>
	/// <param name="page_number">Page number - defaults to 0</param>
	/// <returns>List of objects returned</returns>
	@PostMapping("/api/postTesting")
	@ResponseBody
	public OutputObject postTesting(@RequestBody InputObject inputObject) {
		return new OutputObject(inputObject.getParameter1(), false, null);
	}

}
