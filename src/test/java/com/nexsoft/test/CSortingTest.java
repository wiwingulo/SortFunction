package com.nexsoft.test;

import static org.junit.jupiter.api.Assertions.*;
import java.io.*;
import java.time.Duration;
import java.util.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import com.nexsoft.sorting.CSorting;

public class CSortingTest {

	CSorting cSorting;

	@BeforeEach
	public void init() throws IOException {
		cSorting = new CSorting();
	
	}
	@DisplayName ("Ketika data berurut")
	@ParameterizedTest
	@CsvFileSource(resources = "data.csv", numLinesToSkip = 1)
	public void testBubbleSort_WhenDataIsProvide(int a, int b, int c, int d, int e) {
		assertTimeout(Duration.ofMillis(450), () -> {
			// arrange
			int arrayInt[] = { a, b, c, d, e };
			int expected[] = { a, b, c, d, e };
			Arrays.sort(expected);

			// act
			cSorting.bubbleSort(arrayInt, arrayInt.length);

			// assert
			assertArrayEquals(expected, arrayInt);
		});
	}
	
	@DisplayName ("BubleSort ketika araay tidak terurut")
	@ParameterizedTest
	@CsvFileSource(resources = "data.csv", numLinesToSkip = 1)
	public void testBubbleSort_WhenArrayNotSorted(int a, int b, int c, int d, int e) {
		assertTimeout(Duration.ofMillis(450), () -> {
			// arrange
			int arrayInt[] = { a, b, c, d, e };
			int expected[] = { a, b, c, d, e };
			
			// act
			cSorting.bubbleSort(arrayInt, arrayInt.length);
			
			// assert
			assertArrayEquals(expected, arrayInt);
		});
	}
	@DisplayName ("SelectionSort ketika berurut")
	@ParameterizedTest
	@CsvFileSource(resources = "data.csv", numLinesToSkip = 1)
	public void testSelectionSort_WhenDataIsProvide(int a, int b, int c, int d, int e) {
		assertTimeout(Duration.ofMillis(450), () -> {
			// arrange
			int arrayInt[] = { a, b, c, d, e };
			int expected[] = { a, b, c, d, e };
			Arrays.sort(expected);

			// act
			cSorting.selectionSort(arrayInt);

			// assert
			assertArrayEquals(expected, arrayInt);
		});
	}
	
	@DisplayName("selectionSort ketika tidak berurut")
	@ParameterizedTest
	@CsvFileSource(resources = "data.csv", numLinesToSkip = 1)
	public void testSelectionSort_WhenArrayNotSorted(int a, int b, int c, int d, int e) {
		assertTimeout(Duration.ofMillis(450), () -> {
			// arrange
			int arrayInt[] = { a, b, c, d, e };
			int expected[] = { a, b, c, d, e };
			
			// act
			cSorting.selectionSort(arrayInt);
			
			// assert
			assertArrayEquals(expected, arrayInt);
		});
	}
	@DisplayName ("InsertionSort ketika berurut")
	@ParameterizedTest
	@CsvFileSource(resources = "data.csv", numLinesToSkip = 1)
	public void testInsertionSort_WhenDataIsProvide(int a, int b, int c, int d, int e) {

		assertTimeout(Duration.ofMillis(450), () -> {
			// arrange
			int arrayInt[] = { a, b, c, d, e };
			int expected[] = { a, b, c, d, e };
			Arrays.sort(expected);

			// act
			cSorting.insertionSort(arrayInt, arrayInt.length);

			// assert
			assertArrayEquals(expected, arrayInt);
		});
	}
	@DisplayName ("InsertionSort ketika tidak berurut")
	@ParameterizedTest
	@CsvFileSource(resources = "data.csv", numLinesToSkip = 1)
	public void testInsertionSort_WhenArrayNotSorted(int a, int b, int c, int d, int e) {
		
		assertTimeout(Duration.ofMillis(450), () -> {
			// arrange
			int arrayInt[] = { a, b, c, d, e };
			int expected[] = { a, b, c, d, e };
			
			// act
			cSorting.insertionSort(arrayInt, arrayInt.length);
			// assert
			assertArrayEquals(expected, arrayInt);
		});
	}
}