import java.util.Scanner;

/* Viết chương trình cho nhập vào 5 số nguyên
 * - tính tổng 5 số vừa nhập
 * Nâng cao: Cho người dùng chọn là sẽ nhập vào bao nhiêu số luôn
 * không nhất thiết là 5 số
 * */
public class BaiTapVongLap_1 {

	public static void main(String[] args) {
		// đầu vào
		
		int tongSoNguyen=0;
		int dem = 1;
		Scanner scan = new Scanner (System.in);
		
		// xử lý
		while (dem <10) {
			System.out.println("Mời bạn nhập số thứ "+dem +":");
			tongSoNguyen += scan.nextInt();
			dem++;
		}
		
		
		// đầu ra
		System.out.println("Tổng "+--dem+ " số vừa nhập là: " + tongSoNguyen);
	}

}
