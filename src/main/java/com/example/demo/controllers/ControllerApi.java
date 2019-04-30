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
public class ControllerApi {

	@GetMapping("/api/index")
	@ResponseBody
	public String index() {
		return "holaasdasd";
	}

	@PostMapping("/api/postTesting")
	@ResponseBody
	public OutputObject postTesting(@RequestBody InputObject inputObject) {
		return new OutputObject(inputObject.getParameter1(), false, null);
	}

}
