import java.util.Scanner;

public class Bai6GiaiDocSo {

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
			
			
			// đầu ra
			if(soHangChuc == 1) {
				System.out.print("Mười");
			}
			else if(soHangChuc == 2) {
				System.out.print("Hai mươi");
			}
			else if(soHangChuc == 3) {
				System.out.print("Ba mươi");
			}
			else if(soHangChuc == 4) {
				System.out.print("Bốn mươi");
			}
			else if(soHangChuc == 5) {
				System.out.print("Năm mươi");
			}
			else if(soHangChuc == 6) {
				System.out.print("Sáu mươi");
			}
			else if(soHangChuc == 7) {
				System.out.print("Bảy mươi");
			}
			else if(soHangChuc == 8) {
				System.out.print("Tám mươi");
			}
			else  { //if(soHangChuc == 9)
				System.out.print("Chín mươi");
			}
			
			
			// hàng đơn vị
			if (soHangDonVi == 0) {
				System.out.println("");
			}
			else if (soHangDonVi == 1) {
				if (soHangChuc == 1) {
				System.out.println(" một");
				}
				else {System.out.println(" mốt");}
			}
			else if (soHangDonVi == 2) {
				System.out.println(" hai");
			}
			else if (soHangDonVi == 3) {
				System.out.println(" ba");
			}
			else if (soHangDonVi == 4) {
				System.out.println(" bốn");
			}
			else if (soHangDonVi == 5) {
				System.out.println(" lăm");
			}
			else if (soHangDonVi == 6) {
				System.out.println(" sáu");
			}
			else if (soHangDonVi == 7) {
				System.out.println(" bảy");
			}
			else if (soHangDonVi == 8) {
				System.out.println(" tám");
			}
			else { //if (soHangDonVi == 9)
				System.out.println(" chín");
			}
						
		}			

	}

}
