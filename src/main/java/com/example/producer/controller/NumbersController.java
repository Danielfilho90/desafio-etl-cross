package com.example.producer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.producer.service.TransformService;

@RestController
public class NumbersController {

	@Autowired
	private TransformService transformService;

	@GetMapping("/numbers")
	public List<Double> getNumbers() {
		return transformService.transform();
	}

}
