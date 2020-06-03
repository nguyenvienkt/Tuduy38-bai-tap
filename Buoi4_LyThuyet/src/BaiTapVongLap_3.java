import java.util.Scanner;

/* Viết chương trình cho nhập vào số nguyên liên tục, nếu nhập số 0 
 * thì dừng 
 * -- yêu cầu: In ra tổng các số vừa nhập
 * Nâng cao: In ra có bao nhiêu số chẵn, bao nhiêu số lẻ
 * */
public class BaiTapVongLap_3 {

	public static void main(String[] args) {
		// đầu vào
		int soNhap=1, tong=0;
		int dem;
		
		int soChan=0, soLe=0;
		
		Scanner scan = new Scanner(System.in);
		while (soNhap != 0) {
			System.out.println("Nhập vào số nguyên: ");
			soNhap = scan.nextInt();		
			// xử lý
			tong +=soNhap;	
		}
		
		if(tong % 2 == 0) {
			soChan++;
		} else if (tong %2 != 0) {
			soLe++;
		}
		
		// đầu ra
		System.out.println("Tổng các số vừa nhập là: "+tong);
		System.out.println("Số lượng số chẵn là: "+soChan +" và số lẻ là: " +soLe);

	}

}
