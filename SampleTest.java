package com.kk.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SampleTest {

	LocalDate startDate = null;
	LocalDate endDate = null;

	@BeforeEach
	void init(){
		startDate = LocalDate.now().minusDays(5);
		endDate = LocalDate.now();
	}
	@Test
	public void calculateWorkingDays() {
		// assert statements
		assertEquals(3, Sample.calculateWorkingDays(startDate, endDate));
	}
}
