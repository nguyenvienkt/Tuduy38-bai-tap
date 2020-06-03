import java.util.Scanner;

public class Bai4GiaiBaiTap {

	public static void main(String[] args) {
		// đầu vào
		Scanner scan = new Scanner(System.in);
		String tenSV_1, tenSV_2, tenSV_3;
		int namSinh_1, namSinh_2, namSinh_3;
		
		System.out.println("Nhập SV thứ nhất: ");
		tenSV_1 = scan.nextLine();
		System.out.println("Nhập năm sinh SV thứ nhất: ");
		namSinh_1 = Integer.parseInt(scan.nextLine());
		
		System.out.println("Nhập SV thứ hai: ");
		tenSV_2 = scan.nextLine();
		System.out.println("Nhập năm sinh SV thứ ba: ");
		namSinh_2 = Integer.parseInt(scan.nextLine());
		
		System.out.println("Nhập SV thứ ba: ");
		tenSV_3 = scan.nextLine();
		System.out.println("Nhập năm sinh SV thứ ba: ");
		namSinh_3 = Integer.parseInt(scan.nextLine());
		
		// xử lý
		
		// đầu ra
		if(namSinh_1 > namSinh_2 && namSinh_1 > namSinh_3) {
			System.out.println("Sinh viên trẻ nhất là "+tenSV_1+ " Năm sinh " + namSinh_1);
		}
		
		else if(namSinh_2 > namSinh_1 && namSinh_2 > namSinh_3) {
			System.out.println("Sinh viên trẻ nhất là "+tenSV_2+ " Năm sinh " + namSinh_2);
		}
		
		else if(namSinh_3 > namSinh_1 && namSinh_3 > namSinh_1) {
			System.out.println("Sinh viên trẻ nhất là "+tenSV_3+ " Năm sinh " + namSinh_3);
		}
		

	}

}
