import java.util.Scanner;

public class Bai3QuyDoiTien {

	public static void main(String[] args) {
		// Code đầu vào
		Scanner nhapTienUSD = new Scanner(System.in);
		
		System.out.println("Nhập số tiền USD: ");
		double soTienUSD = nhapTienUSD.nextDouble();
		
		// Code xử lý
		double soTienVND = (soTienUSD)*23500;
		
		// Code xuất		
		System.out.println("Quy đổi sang số tiền VND (tỉ giá USD/VND =23.500) là: " + (soTienVND));

	}

}
