import java.util.Scanner;

public class Bai1TinhTienLuongNhanVien {

	public static void main(String[] args) {
		// Code đầu vào
		long ngayLuong = 100000;
		Scanner soNgayDiLam = new Scanner(System.in);		
		System.out.println("Số ngày nhân viên đi làm là: ");
		
		// Code xử lý
		long tongLuong = soNgayDiLam.nextLong()*ngayLuong;
		
		// Code xuất
		System.out.println("Tiền lương nhân viên (100000/ngày) là: " + (tongLuong));

	}

}
