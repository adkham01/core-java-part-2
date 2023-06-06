package com.interview.questions;

public class Patterns1 {
	
	public static void main(String[] args) {
		print1(5);
		print2(5);
		print3(5);
		print4(5);
		print8(5);

	}
	public static void print1(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 0; j < n-i;j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i*2-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void print2(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= n*2-(i*2-1);k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void print3(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 0; i < n-1; i++) {
			for(int j = 0; j < n-i-1; j++) {
				System.out.print("*");				
			}
			System.out.println();
		}
	}
	public static void print4(int n) {
		int star = 0;
		for(int i = 0; i < n; i++) {
			if(i % 2 == 0) star = 1;
			else star = 0;
			for(int j = 0; j <= i; j++) {
				System.out.print(star);
				star = 1 - star;
			}
			System.out.println();
		}
	}
	public static void print5(int n) {
		for(int i = 1; i < n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for(int k = 1; k <= 2*(n-1)-(i*2); k++) {
				System.out.print(" ");
			}
			for(int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}

	}
	public static void print6(int n) {
		int number = 1;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(number+" ");
				number+=1;
			}
			System.out.println();
		}
	}
	public static void print7(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print((char)(65+i)+" ");
			}
			System.out.println();
		}
	}
	public static void print8(int n) {
		for(int i = 1; i < n;i++) {
			for(int j = 1; j <= (n-1)-i;j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < i;j++) {
				System.out.print((char)(65+j));
			}
			for(int j = i; j > 1; j--) {
				System.out.print((char)(63+j));
			}
			System.out.println();
		}
	
	}
	/*
	 
   A
  ABA	  
 ABCBA	 
ABCDCBA
	
	
	*/
}
