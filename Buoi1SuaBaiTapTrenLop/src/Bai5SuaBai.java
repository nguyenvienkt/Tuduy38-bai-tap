import java.util.Scanner;

public class Bai5SuaBai {

	public static void main(String[] args) {
		/*Tính tổng 2 ký số, viết chương trình nhập một số có 2 chữ số (số nguyên) tính tổng 2 ký số vừa nhập
		 *Gợi ý: dấu chia (/) trong phép chia 2 chữ số nguyên thì sẽ ra số hàng chục
		 *dấu chia lấy phần dư (%) trong phép chia 2 chữ số nguyên thì sẽ ra số hàng đơn vị*/
		// Code đầu vào
		Scanner scan = new Scanner(System.in);
		int soNhap;
		int tongHaiKySo;
		int soHangChuc;
		int soHangDonVi;
		System.out.println("Mời bạn nhập số có 2 chữ số: ");
		soNhap = scan.nextInt();
		
		// Code xử lý
		soHangChuc = soNhap%10;
		soHangDonVi = soNhap/10;
		tongHaiKySo = soHangChuc+soHangDonVi;
		
		// Code đầu ra
		System.out.println("Tổng hai ký số là: " + tongHaiKySo);
	}

}
