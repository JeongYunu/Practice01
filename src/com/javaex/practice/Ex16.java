package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품가격: ");
		
		double sell = sc.nextDouble();
		
		System.out.print("받은돈: ");
		
		double money = sc.nextDouble();
		
		double tax = sell * 0.1;
		double change = money - sell;
		
		System.out.println("===================");
		System.out.println("받은돈: " + money);
		System.out.println("상품가격: " + sell);
		System.out.println("부가세: " + tax);
		System.out.println("잔액: " + change);
		
		sc.close();

	}

}
