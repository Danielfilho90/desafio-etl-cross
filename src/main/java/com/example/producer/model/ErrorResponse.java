package com.example.producer.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ErrorResponse {

	private int value;
	private int status;
	private String message;

}
