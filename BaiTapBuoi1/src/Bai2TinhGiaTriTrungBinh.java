import java.util.Scanner;

public class Bai2TinhGiaTriTrungBinh {

	public static void main(String[] args) {
		// Code đầu vào
		Scanner nhapSoThuc = new Scanner(System.in);
		
		System.out.println("Nhập Số Thực 1 là: ");
		float soThucMot = nhapSoThuc.nextFloat();
		
		System.out.println("Nhập Số Thực 2 là: ");
		float soThucHai = nhapSoThuc.nextFloat();
		
		System.out.println("Nhập Số Thực 3 là: ");
		float soThucBa = nhapSoThuc.nextFloat();
		
		System.out.println("Nhập Số Thực 4 là: ");
		float soThucBon = nhapSoThuc.nextFloat();
		
		System.out.println("Nhập Số Thực 5 là: ");
		float soThucNam = nhapSoThuc.nextFloat();
		
		// Code xử lý
		float trungBinhCongNamSoThuc = (soThucMot+soThucHai+soThucBa+soThucBon+soThucNam)/5;
		
		// Code xuất		
		System.out.println("Trung bình cộng năm số thực là: " + (trungBinhCongNamSoThuc));

	}

}
