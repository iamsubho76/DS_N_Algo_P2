package com.org.ds2.recursion;

import java.math.BigDecimal;

public class Algorithm {
	public static void main(String[] args) {
		Algorithm a = new Algorithm();
		System.out.println(a.sumIterative(15));
		System.out.println(a.sumRecursive(15));
		System.out.println("++++++++++++++++++++++Head Recursion for Asending Order++++++++++++++++++++++++++++");
		a.buildHeadRecursion(5);
		System.out.println("++++++++++++++++++++++Tail Recursion for Desending Order++++++++++++++++++++++++++++");
		a.buildTailRecursion(5);
		System.out.println("+++++++++++++++++++++++Factorial with accumilator+++++++++++++++++++++++++++");
		a.calculateFactorialWithoutAccumulator(5);
		System.out.println("+++++++++++++++++++++++Calculate GCD+++++++++++++++++++++++++++");
		System.out.println(a.caliculateGCD(100, 30));
	}

	public int sumIterative(int n) {
		int result = (BigDecimal.ZERO).intValue();
		for (int i = 1; i <= n; i++) {
			result = result + i;
		}
		return result;
	}

	public int sumRecursive(int n) {
		if (n == 1) return 1;

		return n + sumRecursive(n - 1);
	}

	public void buildHeadRecursion(int height) {
		if (height == 0) return;
		buildHeadRecursion(height - 1);
		System.out.println(height);
	}

	public void buildTailRecursion(int height) {
		if (height == 0) return;
		System.out.println(height);
		buildTailRecursion(height - 1);
	}

	public int factorialWithoutAccumulator(int n) {
		if (n == 1) return 1;

		return n * factorialWithoutAccumulator(n - 1);
	}

	public int calculateFactorialWithoutAccumulator(int n) {
		return factorialWithoutAccumulator(1, n);
	}

	public int factorialWithoutAccumulator(int accumulator, int n) {
		if (n == 1) return accumulator;

		return factorialWithoutAccumulator(accumulator * n, n - 1);
	}
	
	private int caliculateGCD(int num1, int num2) {
		if(num2 == 0) return num1;
		
		return caliculateGCD(num2, num1%num2);
	}
}
