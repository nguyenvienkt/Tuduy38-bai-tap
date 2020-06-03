import java.util.Scanner;

/*Viết chương trình nhập vào 1 chuỗi ký tự (tối đa 6 ký tự) viết 
 * hoa thường lẫn lộn. 
 * In ra chuỗi viết thường của chuỗi đó không dùng hàm lowerCase.
 * */
public class Bai4_inChuoiVietThuong {

	public static void main(String[] args) {
		// 
		String hoTen;
		String ketQua = ""; // tích lũy kí tự xử lý, phải bằng chuỗi rỗng cho khỏi lỗi
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Mời bạn nhập chuỗi có 6 kí tự: ");
		hoTen = scan.nextLine();
		
		if (hoTen.length() <6 || hoTen.length() >6) {
			System.out.println("Vui lòng nhập đúng 6 kí tự");
		} 
		else {
		
		char c0 = hoTen.charAt(0);
		if (c0 >=65 && c0 <=90)// A = 65, Z=90
		{ // a là 97 và z là 122 ---> A và a cách nhau 32 kí tự
			c0 +=32; // dùng toán cộng bằng, biến viết hoa thành viết thường			
		}
		ketQua +=c0; // ráp kí tự c0 vào biến kết quả
		/* xem bảng ASCII viết hoa từ 65 --90*/
		
		char c1 = hoTen.charAt(1);
		if (c1 >=65 && c1 <=90)// A = 65, Z=90
		{ // a là 97 và z là 122 ---> A và a cách nhau 32 kí tự
			c1 +=32; // dùng toán cộng bằng, biến viết hoa thành viết thường			
		}
		ketQua +=c1; // ráp kí tự c0 vào biến kết quả
		/* xem bảng ASCII viết hoa từ 65 --90*/
		
		char c2 = hoTen.charAt(2);
		if (c2 >=65 && c2 <=90)// A = 65, Z=90
		{ // a là 97 và z là 122 ---> A và a cách nhau 32 kí tự
			c2 +=32; // dùng toán cộng bằng, biến viết hoa thành viết thường			
		}
		ketQua +=c2; // ráp kí tự c0 vào biến kết quả
		/* xem bảng ASCII viết hoa từ 65 --90*/
		
		char c3 = hoTen.charAt(3);
		if (c3 >=65 && c3 <=90)// A = 65, Z=90
		{ // a là 97 và z là 122 ---> A và a cách nhau 32 kí tự
			c3 +=32; // dùng toán cộng bằng, biến viết hoa thành viết thường			
		}
		ketQua +=c3; // ráp kí tự c0 vào biến kết quả
		
		char c4 = hoTen.charAt(4);
		if (c4 >=65 && c4 <=90)// A = 65, Z=90
		{ // a là 97 và z là 122 ---> A và a cách nhau 32 kí tự
			c4 +=32; // dùng toán cộng bằng, biến viết hoa thành viết thường			
		}
		ketQua +=c4; // ráp kí tự c0 vào biến kết quả
		
		char c5 = hoTen.charAt(5);
		if (c5 >=65 && c5 <=90)// A = 65, Z=90
		{ // a là 97 và z là 122 ---> A và a cách nhau 32 kí tự
			c5 +=32; // dùng toán cộng bằng, biến viết hoa thành viết thường			
		}
		ketQua +=c5; // ráp kí tự c0 vào biến kết quả
		
		
		System.out.println("Chuỗi sau xử lý : "+ ketQua);
		}
	}
		

}
