package com.example.producer.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.example.producer.integration.DienekesService;
import com.example.producer.model.NumbersResponse;
import com.example.producer.sort.SortingUtils;

@Service
public class TransformService {

	private static final int FIRST_PAGE = 1;

	@Autowired
	private DienekesService dienekesService;

	private SortingUtils sortingUtils;

	public List<Double> transform() {

		List<Double> numbers = new ArrayList<>();

		fetchAllNumbers(numbers, FIRST_PAGE);

		return sortingUtils.sortNumbers(numbers);

	}

	private List<Double> doSortAlgorithm(List<Double> numbers) {

		return numbers;
	}

	private void fetchAllNumbers(List<Double> numbers, int page) {

		NumbersResponse partialResponse = dienekesService.fethNumbers(page);

		if (isResponseValid(partialResponse)) {
			numbers.addAll(partialResponse.getNumbers());
			fetchAllNumbers(numbers, ++page);
		}

	}

	private boolean isResponseValid(NumbersResponse partialResponse) {
		return partialResponse != null && !CollectionUtils.isEmpty(partialResponse.getNumbers());
	}
}
