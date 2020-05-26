import java.util.Scanner;

public class Bai2SuaBai {

	public static void main(String[] args) {
		// Code đầu vào
		Scanner scan = new Scanner(System.in);
		float so_1, so_2, so_3, so_4, so_5, GTTB;
		
		System.out.println("Mời bạn nhập số thứ 1: ");
		so_1 = scan.nextFloat();
		System.out.println("Mời bạn nhập số thứ 2: ");
		so_2 = scan.nextFloat();
		System.out.println("Mời bạn nhập số thứ 3: ");
		so_3 = scan.nextFloat();
		System.out.println("Mời bạn nhập số thứ 4: ");
		so_4 = scan.nextFloat();
		System.out.println("Mời bạn nhập số thứ 5: ");
		so_5 = scan.nextFloat();
		
		// Code xử lý
		GTTB = (so_1+so_2+so_3+so_4+so_5)/5;
		
		// Code đầu ra
		System.out.println("Giá trị trung bình cộng của năm số là: " + GTTB);

	}

}
