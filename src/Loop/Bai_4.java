package Loop;

import java.util.Scanner;

public class Bai_4 {

	public static void main(String[] args) {
		// Tính lãi kép
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số tiền gửi vào: ");
		double tiengui = sc.nextDouble();
		System.out.print("Nhập vào lãi suất: ");
		double lai = sc.nextDouble();
		System.out.print("Nhập số tháng gửi: ");
		int thang = sc.nextInt();
		
		double tienlai = tiengui * Math.pow(1+lai / 12,thang) - tiengui;
		System.out.printf("Lãi kép sau %d tháng là: %.2f",thang,tienlai);
		sc.close();
	}

}
