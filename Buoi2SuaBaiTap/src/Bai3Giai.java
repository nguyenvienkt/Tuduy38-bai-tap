import java.util.Scanner;

public class Bai3Giai {

	public static void main(String[] args) {
		// đầu vào
		Scanner scan = new Scanner(System.in);
		int so_1, so_2, so_3, so_4, so_5;
		int soLuongSoChan=0, soLuongSoLe=0;
		
		System.out.println("Nhập số 1: ");
		so_1 = scan.nextInt();
		System.out.println("Nhập số 2: ");
		so_2 = scan.nextInt();
		System.out.println("Nhập số 3: ");
		so_3 = scan.nextInt();
		System.out.println("Nhập số 4: ");
		so_4 = scan.nextInt();
		System.out.println("Nhập số 5: ");
		so_5 = scan.nextInt();

		// xử lý
		if(so_1 %2 ==0) {
			soLuongSoChan++;
		}
		
		if(so_2 %2 ==0) {
			soLuongSoChan++;
		}
		
		if(so_3 %2 ==0) {
			soLuongSoChan++;
		}
		
		if(so_4 %2 ==0) {
			soLuongSoChan++;
		}
		
		if(so_5 %2 ==0) {
			soLuongSoChan++;
		}
		
		soLuongSoLe = 5 - soLuongSoChan;
			
		
		// đầu ra
		System.out.println("có "+soLuongSoLe+ " số lẻ");
		System.out.println("và có "+soLuongSoChan+ " số chẵn");
	
		
		
		
		
	}

}
