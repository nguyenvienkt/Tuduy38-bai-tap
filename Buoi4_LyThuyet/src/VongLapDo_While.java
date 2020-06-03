import java.util.Scanner;

/* Viết chương trình cho nhập vào số nguyên liên tục, nếu nhập số 0 
 * thì dừng 
 * -- yêu cầu: In ra tổng các số vừa nhập
 * Nâng cao: In ra có bao nhiêu số chẵn, bao nhiêu số lẻ
 * */
public class VongLapDo_While {

	public static void main(String[] args) {
		// đầu vào
		int soNhap, tong=0;
		int dem;
		
		Scanner scan = new Scanner(System.in);
		do {System.out.println("Nhập vào số nguyên: ");
		soNhap = scan.nextInt();		
		// xử lý
		tong +=soNhap;}	
		while (soNhap != 0);
		
		// đầu ra
		System.out.println("Tổng các số vừa nhập là: "+tong);
		

	}

}
