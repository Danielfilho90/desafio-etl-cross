package com.example.producer.model;

import java.util.List;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class NumbersResponse {
	
	@NotNull
	private List<Double> numbers;

}
