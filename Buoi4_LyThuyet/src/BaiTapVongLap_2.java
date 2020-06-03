import java.util.Scanner;

/* Viết chương trình nhập vào số nguyên n bất kỳ
 * In ra tổng từ 1 đến số đó
 * Ví dụ: nhập vào 5 => in ra tổng của 1 + 2 + 3 + 4 +5 = 15
 * Nâng cao: In ra công thức luôn
 * 
 *
 */
public class BaiTapVongLap_2 {

	public static void main(String[] args) {
		// đầu vào
		int tong = 0;
		int dem = 1;
		int soNhap;
		Scanner scan = new Scanner (System.in);
		System.out.println("Nhập số nguyên n bất kỳ: ");
		soNhap = scan.nextInt();
		
		// xử lý
		
		while (dem <= soNhap) {
			tong += dem; // 1, 2, 3
			
			if (dem==soNhap) {
				System.out.print(dem+" = ");
			} else {
				System.out.print(dem+" + ");
			}			
			dem++; 
		}
		
		// đầu ra
		System.out.println(tong);

	}

}
