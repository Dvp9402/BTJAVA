package Condition;

import java.util.Scanner;

public class Bai_1 {

	public static void main(String[] args) {
		// Cho 3 số nguyên. Tìm số lớn nhất trong 3 số đó
		 int a,b,c;
	        Scanner scanner = new Scanner (System.in);
	        System.out.println ("Nhập vào số thứ nhất: ");
	        a = scanner.nextInt ();
	        System.out.println ("Nhập vào số thứ hai: ");
	        b = scanner.nextInt ();
	        System.out.println ("Nhập vào số thứ ba: ");
	        c = scanner.nextInt ();
	        if( a >= b && a >= c)
	            System.out.println (a+" là số lớn nhất!!");
	        else if (b >= a && b >= c)
	            System.out.println (b+" là số lớn nhất!!");
	        else
	            System.out.println (c+" là số lớn nhất!!");
	        scanner.close();	 
	}
}

