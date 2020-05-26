import java.util.Scanner;

public class Bai5TinhTongHaiKySo {

	public static void main(String[] args) {
		// Code đầu vào
		Scanner nhapSoHaiChuSo = new Scanner(System.in);
		
		System.out.println("Nhập vào một số có hai chữ số: ");
		int soCoHaiChuSo = nhapSoHaiChuSo.nextInt();
		int soHangDonVi = soCoHaiChuSo%10;
		int soHangChuc = soCoHaiChuSo/10;
		
		// Code xử lý		
		int tongHaiKySo = (soHangDonVi+soHangChuc);
		
		
		// Code xuất		
		System.out.println("Tổng hai ký số vừa nhập là: " + (tongHaiKySo));

	}

}
