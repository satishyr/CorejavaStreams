package com.app.core;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class SummaryStatics {
	public static void main(String[] args) {
		IntSummaryStatistics summary=IntStream.of(7,2,19,88,73,4,10).summaryStatistics();
		System.out.println(summary);
	}

}
