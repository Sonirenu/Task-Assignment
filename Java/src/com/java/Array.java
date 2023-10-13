package com.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intArray = { 1, 2, 3, 4, 5, 6, 7 };

		List<Integer> intList = Arrays.asList(intArray);

		Collections.shuffle(intList);

		intList.toArray(intArray);

		System.out.println(Arrays.toString(intArray));
	}
	}


