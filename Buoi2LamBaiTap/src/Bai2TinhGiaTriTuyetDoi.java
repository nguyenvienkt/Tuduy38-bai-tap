import java.util.Scanner;

/* Viết chương trình nhập vào 3 số thực. hãy thay tất cả các số âm bằng trị tuyết đối
 * của nó và xuất ra màn hình
 * ví dụ nhập: a = 2 b = -5 c = -8
 * Kết quả : a = 2, b = 5, c = 8
 * */
public class Bai2TinhGiaTriTuyetDoi {

	public static void main(String[] args) {
		// code đầu vào
		float soThucMot, soThucHai, soThucBa;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập số thực 1: ");
		soThucMot = Float.parseFloat(scan.nextLine());
		System.out.println("Nhập số thực 2: ");
		soThucHai = Float.parseFloat(scan.nextLine());
		System.out.println("Nhập số thực 3: ");
		soThucBa = Float.parseFloat(scan.nextLine());
				
		// code xử lý
		
		// code đầu ra
		if (soThucMot>0) {
			System.out.println("Số thực 1 là: " +soThucMot);
		}
		else {
			System.out.println("Số thực 1 là: " +-soThucMot);
		}
	
		if (soThucHai>0) {
			System.out.println("Số thực 2 là: " +soThucHai);
		}
		else {
			System.out.println("Số thực 2 là: " +-soThucHai);
		}
		
		if (soThucBa>0) {
			System.out.println("Số thực 3 là: " +soThucBa);
		}
		else {
			System.out.println("Số thực 3 là: " +-soThucBa);
		}
		
		

	}

}
