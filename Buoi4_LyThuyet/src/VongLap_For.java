import java.util.Scanner;

public class VongLap_For {

	public static void main(String[] args) {
		/*	Cần 1 biến bắt đầu
		 * 	nhỏ hơn giá trị nào đó
		 *  xong thì tăng biến đếm
		 *  For --> kiểm tra trước mới chạy nội dung, dựa trên nền tảng while nhưng 3 vế mang lên 1 dòng
		 *  Cấu trúc
		 *  For(vế 1, vế 2, vế 3)
		 *  vế 1: Vế khởi tạo, chạy 1 lần
		 *  vế 2: Vế điều kiện
		 *  vế 3: Vị trí ++
		 *  
		 *  ---> Vế 1 chạy 1 lần, xong vế 2 --> Nội dung --> vế 3 --> vế 2 --> nội dung
		 *  
		 *  
		 *  
		 *  
		 * */
		
		Scanner scan = new Scanner (System.in);
		
		int[] mang = new int [5];
		int tong;
		int viTri = 0;
		
		for (int i = 0; i<mang.length; i++) {
			System.out.println("Mời bạn nhập số thứ "+(i+1)+ ":");
			mang[i]=scan.nextInt();
		}

	}

}
