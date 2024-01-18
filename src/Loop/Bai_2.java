package Loop;

public class Bai_2 {

	public static void main(String[] args) {
		// In ra màn hình 20 số nguyên tố đầu tiên
		int dem = 0;
		int a = 2;
		while(dem<20){
			if(check(a)) {
				System.out.println(a + "");
				dem++;
			}
			a++;
		}
	}
	public static boolean check(int n) {
		if(n<1) {
			return false;
		}
		for(int i=2;i <= Math.sqrt(n);i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
}
