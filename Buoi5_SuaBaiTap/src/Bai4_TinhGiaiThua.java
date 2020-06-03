import java.util.Scanner;

/*Viết chương trình cho phép người dùng nhập vào số n. 
 * Tính và xuất ra giai thừa của số n. 
 * *Gợi ý: 6! = 1 * 2 * 3 * 4 * 5 * 6 n! = 1 * 2 * 3 * … * n 0! = 1

 * */
public class Bai4_TinhGiaiThua {

	public static void main(String[] args) {
		// đầu vào
		Scanner scan = new Scanner (System.in);
		
		int n;
		int ketQua = 1;
		int dem = 1;
		System.out.println("Mời bạn nhập vào n:");
		n = scan.nextInt();
		
		// xử lý
		while(dem<=n){
		ketQua *= dem;
		dem++;
		}
		
		// đầu ra
		System.out.println("Kết quả giai thừa: " +ketQua);

	}

}
