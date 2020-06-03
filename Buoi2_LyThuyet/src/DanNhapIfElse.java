import java.util.Scanner;

/*Viết chương trình nhập vào 1 số nguyên
 * In ra kết luận số đó là số chẵn hay số lẻ
 * */

public class DanNhapIfElse {

	public static void main(String[] args) {
		// Code đầu vào
		Scanner scan = new Scanner(System.in);
		int soNguyen;
		
		System.out.println("Mời bạn nhập một số nguyên: ");
		soNguyen = scan.nextInt();
		
		
		// Code xử lý
		
		// Code đầu ra
		//System.out.println("Số bạn nhập vào là số")
		if(soNguyen %2 == 0) {
			System.out.println("Số bạn nhập là số chẵn");
		}
		else {
			System.out.println("Số bạn nhập là số lẻ");
		}
			
		}
}
