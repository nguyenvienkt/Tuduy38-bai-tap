import java.util.Scanner;

public class Bai4TinhDienTichChuViHinhChuNhat {

	public static void main(String[] args) {
		// Code đầu vào
		Scanner kichThuoc = new Scanner(System.in);
		
		System.out.println("Nhập chiều dài hình chữ nhật: ");
		double chieuDai = kichThuoc.nextDouble();
		
		System.out.println("Nhập chiều rộng chữ nhật: ");
		double chieuRong = kichThuoc.nextDouble();
		
		// Code xử lý
		double chuViHinhChuNhat = (chieuDai+chieuRong)*2;
		double dienTichHinhChuNhat = (chieuDai*chieuRong);
		
		// Code xuất		
		System.out.println("Chu vi hình chữ nhật là: " + (chuViHinhChuNhat));
		System.out.println("Diện tích hình chữ nhật là: " + (dienTichHinhChuNhat));
	}

}
