package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
		
		System.out.print("500원 개수: ");
		int _500 = sc.nextInt();
		
		System.out.print("100원 개수: ");
		int _100 = sc.nextInt();
		
		System.out.print("50원 개수: ");
		int _50 = sc.nextInt();
		
		System.out.print("10원 개수: ");
		int _10 = sc.nextInt();
		
		int __500 = _500 * 500;
		int __100 = _100 * 100;
		int __50 = _50 * 50;
		int __10 = _10 * 10;
		
		int all = __500 + __100 + __50 + __10;
		
		System.out.println("동전의 총합은 " + all +  " 원 입니다.");
		
		sc.close();
	}

}
