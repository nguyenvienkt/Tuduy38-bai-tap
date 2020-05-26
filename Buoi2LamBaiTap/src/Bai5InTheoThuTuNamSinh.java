import java.util.Scanner;

/* Bài 5: In theo thứ tự năm sinh
 * Viết chương trình cho phép nhập tên và năm sinh của 3 sinh viên. (Tương tự bài 4)
 * Xuất ra tên và tuổi của 3 sinh viên trên theo thứ tự từ trẻ đến già.
 * ::Gợi ý: Sử dụng toán tử && hoặc if lồng if
 * */
public class Bai5InTheoThuTuNamSinh {

	public static void main(String[] args) {
		// code đầu vào
		String ten_1, ten_2, ten_3, tenNN;
		int nam_1, nam_2, nam_3, namLN;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập tên sinh viên thứ nhất: ");
		ten_1 = scan.nextLine();
		System.out.println("Nhập năm sinh của sinh viên thứ nhất: ");
		nam_1 = Integer.parseInt(scan.nextLine());
		
		System.out.println("Nhập tên sinh viên thứ hai: ");
		ten_2 = scan.nextLine();
		System.out.println("Nhập năm sinh của sinh viên thứ hai: ");
		nam_2 = Integer.parseInt(scan.nextLine());
		
		System.out.println("Nhập tên sinh viên thứ ba: ");
		ten_3 = scan.nextLine();
		System.out.println("Nhập năm sinh của sinh viên thứ ba: ");
		nam_3 = Integer.parseInt(scan.nextLine());
		
		
		
		// code xử lý
		
		// code đầu ra
		namLN =nam_1;
		tenNN=ten_1;
		
		if(nam_1 < nam_2) {
			namLN = nam_2;
			nam_2 = nam_1;
			nam_1 = namLN;
			
			tenNN = ten_2;
			ten_2 = ten_1;
			ten_1 = tenNN;
			
			
		}
		if (nam_1 < nam_3) {
			namLN = nam_3;
			nam_3 = nam_1;
			nam_1 = namLN;
			
			tenNN = ten_3;
			ten_3 = ten_1;
			ten_1 = tenNN;
			
		}
		if (nam_2 < nam_3) {
			namLN = nam_3;
			nam_3 = nam_2;
			nam_2 = namLN;
			
			tenNN = ten_3;
			ten_3 = ten_2;
			ten_2 = tenNN;
			
		}
		
		System.out.println("Số thứ tự tuổi nhỏ đến lớn là sinh viên tên "+ten_1+ " sinh năm "+nam_1+" tới sinh viên tên "+ten_2 + " sinh năm "+ nam_2+" và cuối cùng là sinh viên "+ten_3 +" sinh năm "+nam_3);
	}

}
