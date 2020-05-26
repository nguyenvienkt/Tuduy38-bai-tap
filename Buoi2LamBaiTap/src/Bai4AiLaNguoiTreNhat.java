import java.util.Scanner;

/* Bài 4: Ai là người trẻ nhất?
 * Viết chương trình cho phép nhập tên và năm sinh của 3 sinh viên.
 * Xuất ra tên và năm sinh của sinh viên trẻ nhất.
 * */
public class Bai4AiLaNguoiTreNhat {

	public static void main(String[] args) {
		// code đầu vào
		Scanner scan = new Scanner (System.in);
		
		String sv_1, sv_2, sv_3;
		int ns_1, ns_2, ns_3;
		
		System.out.println("Tên Sinh Viên thứ nhất là: ");
		sv_1 = scan.nextLine();		
		System.out.println("Năm sinh Sinh Vien thứ nhất là: ");
		ns_1 = Integer.parseInt(scan.nextLine());
		
		System.out.println("Tên Sinh Viên thứ hai là: ");
		sv_2 = scan.nextLine();		
		System.out.println("Năm sinh Sinh Vien thứ hai là: ");
		ns_2 = Integer.parseInt(scan.nextLine());
		
		System.out.println("Tên Sinh Viên thứ ba là: ");
		sv_3 = scan.nextLine();		
		System.out.println("Năm sinh Sinh Vien thứ ba là: ");
		ns_3 = Integer.parseInt(scan.nextLine());
		// code xử lý
		
		// code đầu ra
		int nsLonNhat = ns_1;
		String svNhoNhat = sv_1;
		
		if (ns_1 < ns_2) {
			nsLonNhat = ns_2;
			svNhoNhat = sv_2;
		}
		if (ns_1 < ns_3) {
			nsLonNhat = ns_3;
			svNhoNhat = sv_3;
		}		
		System.out.println("Sinh Viên trẻ nhất tên là: " +svNhoNhat + " sinh năm : " +nsLonNhat);
				

	}

}
