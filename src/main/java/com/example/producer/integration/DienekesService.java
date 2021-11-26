package com.example.producer.integration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.example.producer.api.DienekesApi;
import com.example.producer.model.NumbersResponse;

@Component
public class DienekesService {

	@Autowired
	private DienekesApi dienesApi;

	public NumbersResponse fethNumbers(int page) {

		ResponseEntity<NumbersResponse> response = dienesApi.fetchNumbers(page);

		return response.getBody();

	}

}
