package Loop;

import java.util.Scanner;

public class Bai_6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số đầu tiên: ");
        int num1 = sc.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int num2 = sc.nextInt();
        int randomNum = (int) (Math.random() * (num2 - num1 )) + num1;
        int guessCount = 0;
        while (guessCount < 3) {
            System.out.print("Hãy đoán một số giữa " + num1 + " và " + num2 + ": ");
            int guess = sc.nextInt();
            if (guess == randomNum) {
                System.out.println("Bạn đã thắng!");
                return;
            } else if (guess < randomNum) {
                System.out.println("Tăng lên.");
            } else {
                System.out.println("Giảm xuống.");
            }
            guessCount++;
        }
        System.out.println("Bạn đã thua. Số đúng là " + randomNum + ".");
        sc.close();
	}
}
