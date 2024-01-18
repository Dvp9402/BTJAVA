package Loop;

import java.util.Scanner;

public class Bai_1 {

	public static void main(String[] args) {
		//1. Viết chương trình tính giai thừa của 1 số
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số cần tính giai thừa: ");
		a = sc.nextInt();
		int gt =1;
		for(int i=1; i<a;i++ ) {
			gt = gt*i;
		}
		System.out.printf("%d! = %d ",a,gt);
		sc.close();
	}
}
