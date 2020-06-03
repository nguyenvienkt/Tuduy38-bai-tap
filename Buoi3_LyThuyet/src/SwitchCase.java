/*
 * Switch-case:
 * 1. Mỗi case phải có break, không có break sẽ chạy xuống case tiếp theo
 * 2. Không thể bắt các case trùng nhau
 * 3. Giá trị bắt case phải cùng KDL với biến đem đi switch
 * 4. Có hỗ trợ trường hợp default sẽ bắt cho mình các trường hợp mình chưa bắt case (
 * (tương tự như cái else cuối trong cấu trúc if else if)
 * 5. Nếu có khai báo biến trong case, nên bọc case đó bởi 1 khối lệnh {}
 * 6. Thứ tự các case không cần theo thứ tự
 * 7. Bên trong case có thể if else switch case thêm thoải mái
 * */

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// đầu vào
		Scanner scan = new Scanner(System.in);
		int soNhap;
		int soHangChuc, soHangDonVi;
		
		System.out.println("Mời bạn nhập số có hai chữ số: ");
		soNhap = scan.nextInt();
		
		if (soNhap <10 || soNhap >99) {
			System.out.println("Vui lòng nhập số từ 10 -99");
			
		}
		else { // hợp lệ
			// xử lý
			soHangChuc = soNhap /10;
			soHangDonVi = soNhap % 10;
		
		
		switch (soHangChuc) {
		case 1:
			System.out.print("Mười");
			break;
		case 2:
			System.out.print("Hai mươi");
			break;
		case 3:
			System.out.print("Ba mươi");
			break;
		case 4:
			System.out.print("Bốn mươi");
			break;
		case 5:
			System.out.print("Năm mươi");
			break;
		case 6:
			System.out.print("Sáu mươi");
			break;
		case 7:
			System.out.print("Bảy mươi");
			break;
		case 8:
			System.out.print("Tám mươi");
			break;
		case 9:
			System.out.print("Chín mươi");
			break;
				
		}
		
		switch (soHangDonVi) {
		case 1:
			if (soHangChuc == 1) {
				System.out.println(" một");
			}
			else {
				System.out.println(" mốt");
			}
			
			break;
		case 2:
			System.out.println(" hai");
			break;
		case 3:
			System.out.println(" ba");
			break;
		case 4:
			System.out.println(" bốn");
			break;
		case 5:
			System.out.println(" lăm");
			break;
		case 6:
			System.out.println(" sáu");
			break;
		case 7:
			System.out.println(" bảy");
			break;
		case 8:
			System.out.println(" tám");
			break;
		case 9:
			System.out.println(" chín");
			break;
		
		}
			
			// đầu ra
		}
	}
}
	