package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.objects.InputObject;
import com.objects.OutputObject;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

@Controller
@Api(value = "Empollé", description = "REST API for Employee", tags = { "Employee" })
public class ControllerApi2 {

	@GetMapping("/api2/index2")
	@ResponseBody
	public String index() {
		return "holaasdasd";
	}

	@PostMapping("/api2/postTesting2")
	@ResponseBody
	@ApiOperation(notes = "Your Implementation Notes will show here", value = "asdasd")
	public OutputObject postTesting(@RequestBody InputObject inputObject) {
		return new OutputObject(inputObject.getParameter1(), false, null);
	}

}
