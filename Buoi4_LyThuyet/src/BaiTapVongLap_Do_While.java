import java.util.Scanner;

/* Viết chương trình nhập vào 2 số nguyên
 * In ra một menu như sau: (sout)
 * 0. Thoát
 * 1. In ra tổng 2 số
 * 2. In ra hiệu 2 số
 * 3. In ra số thứ nhất là chẵn hay lẻ
 * 4. In ra số thứ hai là chẵn hay lẻ
 * Cho người dùng chọn menu (từ 0 ->4) --> 
 * Nâng cao; Bắt lỗi nhập ngoài 0->4
 * Nếu chọn 0 thì thoát chương trình
 * Ngược lại nếu chọn 1->4 thì in ra kết quả tương ứng, sau đó qua lại menu
 * Nâng cao: Chọn option nào xong thì ẩn option đó ở lần lặp kế tiếp
 * chọn hết 4 option 1->4 thì tự động thoát
 * */
public class BaiTapVongLap_Do_While {

	public static void main(String[] args) {
		// đầu vào
		int soMot, soHai;
		int luaChon;
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập vào số nguyên thứ nhất: ");
		soMot = scan.nextInt();
		
		System.out.println("Nhập vào số nguyên thứ hai: ");
		soHai = scan.nextInt();
		do {
		System.out.println("Mời bạn chọn số theo menu bên dưới");
		System.out.println("0. Thoát");
		System.out.println("1. In ra tổng 2 số");
		System.out.println("2. In ra hiệu 2 số");
		System.out.println("3. Số thứ nhất là ");
		System.out.println("4. Số thứ hai là ");
		
		System.out.println("Vui lòng chọn số từ 0->4: ");
		luaChon = scan.nextInt();
		
		// xử lý
		
		// đầu ra
		
		switch (luaChon) {
		case 0:
			System.out.println("Tạm biệt");
			break;
		case 1:
			System.out.println("Tổng hai số là: "+(soMot+soHai));
			break;
		case 2:
			System.out.println("Hiệu hai số là: "+(soMot-soHai));
			break;
		case 3:
			if (soMot %2 ==0) {
				System.out.println("Số thứ nhất là số chẵn ");
			} else {
				System.out.println("Số thứ nhất là số lẻ");
			}
			break;
		case 4:
			if (soHai %2 ==0) {
				System.out.println("Số thứ hai là số chẵn ");
			} else {
				System.out.println("Số thứ hai là số lẻ");
			}
			break;
		} 
		
	} while (luaChon != 0);
		
	
  }	

}
