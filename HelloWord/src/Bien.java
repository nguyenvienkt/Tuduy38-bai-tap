
public class Bien {

	public static void main(String[] args) {
		// Biến  - Variable - giống như cái xô đựng nước để mình xài. 
		// Là khái niệm dùng để lưu trữ một giá trị xài nhiều lần trong dự án
		// Cú pháp khai báo biến: [Kiểu dữ liệu] [tên biến] = [giá trị];
		// Biến không được bắt đầu bằng số, tên biến không dấu, không có khoảng cách
		// kết thúc dấu chấm phẩy.
		// chỉnh sửa dữ liệu cho biến cập nhật cho biến year
		// Trong 1 khối lệnh thì chỉ được khai báo 1 lần biến
		 int year = 2020; // dấu bằng là phép gán, vế phải dấu bằng chạy trước tạo ra dữ liệu và gán qua vế trái 
		
		System.out.println(year);
		System.out.println(year);
		System.out.println(year);
		// Cú pháp cập nhật lại biến đã khai báo ở trên
		year = 2022; // bỏ khai báo kiểu dữ liệu đi
		            // year = year + 1 //
		System.out.println(year);
		//bên trái khai báo kiểu dữ liệu kiểu gì thì bên phải phải gán kiểu dữ liệu kiểu đó 
		// số thực bao gồm số nguyên nên có thể chứa số nguyên
		
		// float là 4 byte
		float soThucFloat = 3.14f;
		System.out.println(soThucFloat);
		
		// double là 8 byte
		double soThucDouble = 3.14;
		System.out.println(soThucDouble);
		
		char kyTu = '@';
		System.out.println(kyTu);
		
		String chuoiKyTu = "Ai cung dep trai";
		System.out.println(chuoiKyTu);
		
		
	}

}
