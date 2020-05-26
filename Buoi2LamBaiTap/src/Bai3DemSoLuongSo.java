import java.util.Scanner;

/* Bài 3: Đếm số lượng số:
 * Viết chương trình nhập vào 5 số nguyên. Xuất ra có bao nhiêu số lẻ
 * và bao nhiêu số chẵn
 * */
public class Bai3DemSoLuongSo {

	public static void main(String[] args) {
		// code đầu vào
		int soNguyenMot, soNguyenHai, soNguyenBa, soNguyenBon, soNguyenNam,soChan=0, soLe=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Nhập vào số nguyên thứ nhất: ");
		soNguyenMot = Integer.parseInt(scan.nextLine());
		System.out.println("Nhập vào số nguyên thứ hai: ");
		soNguyenHai = Integer.parseInt(scan.nextLine());
		System.out.println("Nhập vào số nguyên thứ ba: ");
		soNguyenBa = Integer.parseInt(scan.nextLine());
		System.out.println("Nhập vào số nguyên thứ tư: ");
		soNguyenBon = Integer.parseInt(scan.nextLine());
		System.out.println("Nhập vào số nguyên thứ năm: ");
		soNguyenNam = Integer.parseInt(scan.nextLine());
		
		
		
		// code xử lý
		
		// code đầu ra
		if (soNguyenMot %2 == 0 ) {
			soChan = ++soChan;
		}
		else {
			soLe = ++soLe;
		}
		
		if (soNguyenHai %2 == 0) {
			soChan = ++soChan;
		}
		else {
			soLe = ++soLe;
		}
		if(soNguyenBa %2 == 0) {
			soChan = ++soChan;
		}
		else {
			soLe = ++soLe;
		}
		if (soNguyenBon %2 ==0) {
			soChan = ++soChan;
		}
		else {
			soLe = ++soLe;
		}
		if(soNguyenNam %2 ==0) {
			soChan = ++soChan;
		}
		else {
			soLe = ++soLe;
		}
		System.out.println("Có "+soChan+ " số chẵn và "+soLe +" số lẻ");
	}

}
