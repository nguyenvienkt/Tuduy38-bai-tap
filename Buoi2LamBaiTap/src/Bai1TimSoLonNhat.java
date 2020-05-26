import java.util.Scanner;

/* Yêu cầu viết chương trình nhập vào 2 số nguyên m và n
 * Xuất ra màn hình số nguyên lớn nhất trong 2 số vừa nhập
 * */
public class Bai1TimSoLonNhat {

	public static void main(String[] args) {
		// code đầu vào
		int soNguyenM, soNguyenN;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Nhập số nguyên m: ");		
		soNguyenM = Integer.parseInt(scan.nextLine());
		
		System.out.println("Nhập số nguyên n: ");
		soNguyenN = Integer.parseInt(scan.nextLine());
		
		// code xử lý
		
		// code đầu ra
		if (soNguyenM>soNguyenN) {
		System.out.println("Số nguyên lớn nhất là số m.");
		}
		else {
		System.out.println("Số nguyên lớn nhất là số n. ");
		}

	}

}
