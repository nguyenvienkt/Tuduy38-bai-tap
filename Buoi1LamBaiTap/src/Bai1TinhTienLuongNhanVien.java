import java.util.Scanner;

public class Bai1TinhTienLuongNhanVien {

	public static void main(String[] args) {
		/*
		 * Bài 1: Tính tiền lương nhân viên
		 * với lương 1 ngày: 100.000
		 * cho người dùng nhập vào số ngày làm.
		 * công thức tính lương = Lương 1 ngày nhân với số ngày đi làm*/
		/* --> Phân tích bài tính lương, chỉ số quan tâm lương là lương 100.000đ/ngày*/
		// Code đầu vào
		long ngayLuong = 100000;
		Scanner soNgayDiLam = new Scanner(System.in);		
		System.out.println("Số ngày nhân viên đi làm là: ");
		
		// Code xử lý
		long tongLuong = soNgayDiLam.nextLong()*ngayLuong;
		
		// Code xuất
		System.out.println("Tiền lương nhân viên (100000/ngày) là: " + (tongLuong));

	}

}
/* Lưu ý: khi sửa bài. không quăng thẳng số 100000 vô trong code. Nếu có nhiều nơi dùng con số này thì phải đi tìm sửa hết
Lưu ý: Khi khai báo biến, cần tránh khai báo biến rời rạc trong dòng code. Do đó phải làm theo sơ đồ 3 khối

Đầu vào: Khai báo các biến có trong chương trình
Xử lý: Các tính toán trong chương trình
Đầu ra: Trả về kết quả cần thiết
*/
