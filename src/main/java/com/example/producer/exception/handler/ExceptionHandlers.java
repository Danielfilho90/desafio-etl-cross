package com.example.producer.exception.handler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.producer.model.ErrorResponse;

import feign.FeignException;

@RestControllerAdvice
public class ExceptionHandlers {

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(value = FeignException.class)
	public ErrorResponse handleInputParameterException(HttpServletRequest req, FeignException e) {
		return new ErrorResponse(HttpStatus.BAD_REQUEST.value(), e.status(), e.getMessage());
	}

}
