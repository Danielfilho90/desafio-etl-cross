package com.example.producer.sort;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BubleSort implements SortingUtils {

	@Override
	public List<Double> sortNumbers(List<Double> numbers) {
		return numbers;
	}
	
}
