import java.util.Scanner;

public class Bai5GiaiTenTuoiBaSinhVien {

	public static void main(String[] args) {
		// đầu vào
		Scanner scan = new Scanner(System.in);
		String tenSV_1, tenSV_2, tenSV_3;
		int namSinh_1, namSinh_2, namSinh_3;
		int tuoiSV_1, tuoiSV_2, tuoiSV_3;
		
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
		tuoiSV_1 = 2020 - namSinh_1;
		tuoiSV_2 = 2020 - namSinh_2;
		tuoiSV_3 = 2020 - namSinh_3;
		
		// đầu ra
		if(namSinh_1 > namSinh_2 && namSinh_1 > namSinh_3) {
			System.out.println("Sinh viên trẻ nhất là "+tenSV_1+ " Tuổi " + tuoiSV_1);
			if(namSinh_2 >namSinh_3) {
				System.out.println("Sinh viên trẻ nhì là "+tenSV_2+ " Tuổi " + tuoiSV_2);
				System.out.println("Sinh viên già nhất là "+tenSV_3+ " Tuổi " + tuoiSV_3);
			}
			else {
				System.out.println("Sinh viên trẻ nhì là "+tenSV_3+ " Tuổi " + tuoiSV_3);
				System.out.println("Sinh viên già nhất là "+tenSV_2+ " Tuổi " + tuoiSV_2);
			}
			
		}
		
		else if(namSinh_2 > namSinh_1 && namSinh_2 > namSinh_3) {
			System.out.println("Sinh viên trẻ nhất là "+tenSV_2+ " Tuổi " + tuoiSV_2);
			if(namSinh_1 > namSinh_3) {
				System.out.println("Sinh viên trẻ nhì là "+tenSV_1+ " Tuổi " + tuoiSV_1);
				System.out.println("Sinh viên già nhất là "+tenSV_3+ " Tuổi " + tuoiSV_3);
			}
			else{
				System.out.println("Sinh viên trẻ nhì là "+tenSV_3+ " Tuổi " + tuoiSV_3);
				System.out.println("Sinh viên già nhất là "+tenSV_1+ " Tuổi " + tuoiSV_1);
			}
			
		}
		
		else if(namSinh_3 > namSinh_1 && namSinh_3 > namSinh_1) {
			System.out.println("Sinh viên trẻ nhất là "+tenSV_3+ " Tuổi " + tuoiSV_3);
			if(namSinh_1 > namSinh_2) {
				System.out.println("Sinh viên trẻ nhì là "+tenSV_1+ " Tuổi " + tuoiSV_1);
				System.out.println("Sinh viên già nhất là "+tenSV_2+ " Tuổi " + tuoiSV_2);
			}
			else{
				System.out.println("Sinh viên trẻ nhì là "+tenSV_2+ " Tuổi " + tuoiSV_2);
				System.out.println("Sinh viên già nhất là "+tenSV_1+ " Tuổi " + tuoiSV_1);
			}
		}
		

	}

}
