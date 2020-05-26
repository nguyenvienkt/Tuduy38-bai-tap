import java.util.Scanner;

/* Bài 6. Viết chương trình cho phép nhập vào số nguyên có hai chữ số. Hãy in ra cách đọc của số 
 * nguyên này.
 * :: gợi ý là lấy số hàng chục thì dùng phép chia /10, lấy số hàng đơn vị
 * thì dùng phép chia % (chia lấy dư) cho 10.
 * */
public class Bai6DocSoHaiChuSo {

	public static void main(String[] args) {
		// code đầu vào
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập số nguyên có hai chữ số: ");
		int haiChuSo = scan.nextInt();
		
		
		// code xử lý
		int hangChuc = haiChuSo/10;
		int hangDonVi = haiChuSo%10;
		String docHangChuc ="";
		String docHangDonVi = "";
		
		// code đầu ra
		if (hangChuc==0) {
			docHangChuc = "Không";
		}
		if (hangChuc==1) {
			docHangChuc = "Mười";
		}
		if (hangChuc==2) {
			docHangChuc = "Hai mươi";
		}
		if (hangChuc==3) {
			docHangChuc = "Ba mươi";
		}
		if (hangChuc==4) {
			docHangChuc = "Bốn mươi";
		}
		if (hangChuc==5) {
			docHangChuc = "Năm mươi";
		}
		if (hangChuc==6) {
			docHangChuc = "Sáu mươi";
		}
		if (hangChuc==7) {
			docHangChuc = "Bảy mươi";
		}
		if (hangChuc==8) {
			docHangChuc = "Tám mươi";
		}
		if (hangChuc==9) {
			docHangChuc = "Chín mươi";
		}

		if (hangDonVi==0) {
			docHangDonVi = "";
		}
		if (hangDonVi==1 && hangChuc>1) {
			docHangDonVi ="mốt";
		} else if (hangDonVi==1 && hangChuc==1) {
			docHangDonVi = "một";
		}
		if (hangDonVi==2) {
			docHangDonVi = "hai";
		}
		if (hangDonVi==3) {
			docHangDonVi = "ba";
		}
		if (hangDonVi==4) {
			docHangDonVi = "bốn";
		}
		if (hangDonVi==5) {
			docHangDonVi = "năm";
		}
		if (hangDonVi==6) {
			docHangDonVi = "sáu";
		}
		if (hangDonVi==7) {
			docHangDonVi = "bảy";
		}
		if (hangDonVi==8) {
			docHangDonVi = "tám";
		}
		if (hangDonVi==9) {
			docHangDonVi = "chín";
		}
		System.out.println("Số bạn vừa nhập là: "+docHangChuc +" "+ docHangDonVi);
	}

}
