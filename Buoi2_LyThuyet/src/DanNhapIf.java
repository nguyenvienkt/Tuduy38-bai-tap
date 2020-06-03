import java.util.Scanner;

/*Viết chương trình nhập vào 1 số nguyên
 * Nếu số đó là số âm thì đổi dấu thành dương
 * In ra kết quả cuối cùng*/
public class DanNhapIf {

	public static void main(String[] args) {
		// Code đầu vào
		Scanner scan = new Scanner(System.in);		
		int soNguyen;
		
		System.out.println("Mời bạn nhập một số: ");
		soNguyen = scan.nextInt();
		
		// Code xử lý
		if(soNguyen<0) {
			soNguyen *= -1;
//			soNguyen = -soNguyen
		}
		
		
		// Code đầu ra
		System.out.println("Số sau xử lý: " + soNguyen);

	}

}
