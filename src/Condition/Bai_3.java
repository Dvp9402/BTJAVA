package Condition;

import java.util.Scanner;

public class Bai_3 {

	public static void main(String[] args) {
		float a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào một số: ");
		a = sc.nextFloat();
		if(a>0) {
			System.out.println("Positive");
		}else if(a==0) {
			System.out.println("0");
		}else {
			System.out.println("Negative");
		}
		sc.close();
	}
}
