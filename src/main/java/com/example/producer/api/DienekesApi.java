package com.example.producer.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.producer.model.NumbersResponse;

@FeignClient(contextId = "dienekesApiClient", name = "dienekes-api", url = "http://challenge.dienekes.com.br/api")
public interface DienekesApi {

	@GetMapping("/numbers")
	ResponseEntity<NumbersResponse> fetchNumbers(@RequestParam(value = "page", required = false) Integer page);

}
