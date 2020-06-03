import java.util.Scanner;

/* Viết chương trình nhập vào 5 số
 * Tính tổng 5 số và in r [công thức] = tổng
 * Nâng cao: cho người dùng chọn nhập bao nhiêu số luôn.
 * Không nhất thiết là 5 số
 * */
public class BaiTapMang_1 {

	public static void main(String[] args) {
		// đầu vào
		Scanner scan = new Scanner (System.in);
		
		int[] mang = new int [5];
		int tong=0;
		int viTri = 0;
				
		while(viTri < mang.length) {
		System.out.println("Mời bạn nhập số thứ "+(viTri+1) +":");
		mang[viTri] = scan.nextInt();
		viTri++;
		}
		
		// xử lý
		
		
		// đầu ra
		for(int i = 0; i<mang.length; i++) {
			tong += mang[i]; // cộng logic
			System.out.print(i == mang.length - 1 ? mang[i]+ "=" : mang[i] + "+");
		}
		
		System.out.println(tong);
		
	}

}
