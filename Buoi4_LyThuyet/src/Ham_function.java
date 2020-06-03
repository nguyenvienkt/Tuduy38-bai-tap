/* Tham số của hàm:
 * 1. tên tham số không cần giống tên biến truyền qua
 * 2. giá trị của tham số copy từ biến truyền qua, tham số dùng bên hàm mới 
 * là 1 biến clone ra từ biến gốc ban đầu (không phải biến ban đầu)
 * ==> thay đổi giá trị bên hàm phụ sẽ không tác động vào được bên 
 * hàm chính
 * 3. Khai báo thứ tự ra sao thì truyền cho đúng thứ tự đó
 * */


	// đặt hàm phụ trong class và ngoài hàm main
	// Khai báo hàm cú pháp public static [kiểu dữ liệu] [tên hàm] ([các tham số ...])
	//		public static      void     hienThiMenu    ()      {}
	//     	public static [kiểu dữ liệu] [tên hàm] (tham số)   {}
	// void nghĩa là kiểu dữ liệu không có gì hết.
	// tên hàm nên đặt theo kiểu camel như tên biến
	// gọi hàm
	
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
public class Ham_function {
	
	public static void hienThiMenu () {
		System.out.println("Mời bạn chọn số theo menu bên dưới");
		System.out.println("0. Thoát");
		System.out.println("1. In ra tổng 2 số");
		System.out.println("2. In ra hiệu 2 số");
		System.out.println("3. Số thứ nhất là ");
		System.out.println("4. Số thứ hai là ");
	}

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
		hienThiMenu();
		
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
			kiemTraSoChanLe(soMot);
			break;
		case 4:
			//kiemTraSoChanLe(soHai);
			break;
		} 
		
	} while (luaChon != 0);
		
		
	
	
	
  }	
	
	
	public static void kiemTraSoChanLe (int soMot) {
		if (soMot %2 == 0) {
			System.out.println("Số thứ nhất là số chẵn ");
		} else {
			System.out.println("Số thứ nhất là số lẻ");
		}
	}

}
	