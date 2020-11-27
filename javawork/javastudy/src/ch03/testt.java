package ch03;

import java.util.Scanner;

import ch09.Swing01;

public class testt {

	private static int sum2(int b , int c) {
	
		return b + c;
	}
	
	public static int sum(int i , int a) {
		
		return i + a;
	}
	
	public static void main(String[] args) {

		int i = 20;
		int s = sum(i,10);

		int c = sum2(i,14);
	}

}
