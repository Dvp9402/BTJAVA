package Condition;

import java.util.Scanner;

public class Bai_2 {

	public static void main(String[] args) {
		/*Viết chương trình nhập vào điểm của một học viên. Kết quả trả về là xếp loại của học viên đó. 
			Yêu cầu:
			- Lớn hơn 8 điểm là giỏi 
			- Lớn hơn 6,5 điểm là khá
			- Lớn hơn 5 điểm là trung bình
			- Còn lại là yếu
		 */
		float diem;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào điểm: ");
		diem= scanner.nextFloat();
		if(diem > 8) {
			System.out.println("Học viên xếp loại giỏi !");
		}else if(diem > 6.5 && diem <= 8) {
			System.out.println("Học viên xếp loại khá !");
		}else if(diem > 5 && diem <= 6.5) {
			System.out.println("Học viên xếp loại trung bình !");
		}else {
			System.out.println("Học viên xếp loại yếu !");
		}
		scanner.close();
	}
}
