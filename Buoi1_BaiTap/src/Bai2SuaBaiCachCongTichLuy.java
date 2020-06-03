import java.util.Scanner;

public class Bai2SuaBaiCachCongTichLuy {

	public static void main(String[] args) {
		// Code đầu vào
		Scanner scan = new Scanner(System.in);
		float GTTB = 0;
		
		System.out.println("Mời bạn nhập số thứ 1: ");
		GTTB += scan.nextFloat();
		System.out.println("Mời bạn nhập số thứ 2: ");
		GTTB += scan.nextFloat();
		System.out.println("Mời bạn nhập số thứ 3: ");
		GTTB += scan.nextFloat();
		System.out.println("Mời bạn nhập số thứ 4: ");
		GTTB += scan.nextFloat();
		System.out.println("Mời bạn nhập số thứ 5: ");
		GTTB += scan.nextFloat();
		
		// Code xử lý
		GTTB/=5; 
		// GTTB/=5 --> sẽ thay đổi giá trị của biến, và từ đây trở đi thì biến sẽ bi
		//--> GTTB = GTTB/5 (phép chia bình thường ko làm thay đổi giá trị biến)
		
		// GTTB*=5 --> GTTB bản thân nhân lên 5 lần
		// GTTB-=5 --> GTTB bản thân giảm 5 đơn vị
		// Code đầu ra
		System.out.println("Giá trị trung bình cộng của năm số là: " + GTTB);

	}

}
