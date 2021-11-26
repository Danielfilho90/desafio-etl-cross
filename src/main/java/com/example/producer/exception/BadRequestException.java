package com.example.producer.exception;

public class BadRequestException extends RuntimeException {

	private static final long serialVersionUID = 3225528090077972561L;

	public BadRequestException(String message) {
		super(message);
	}

}
