import java.util.Scanner;

/* Viết chương trình xếp loại sinh viên
 * cho người dùng nhập thông tin 1 sinh viên: Họ Tên, Toan, Ly, Hoa.
 * Tính điểm trung bình (điểm TB) và xuất kết quả xếp loại theo tiêu chí sau
 * Loại Giỏi: điểm TB >8.5
 * Loại Khá: 6,5=< điểm TB <=8.5
 * Loại Trung Bình: 5=< điểm TB <=6,5
 * Loại yếu: điểm TB <5
 * :: gợi ý dùng toán tử && để kết nối hai kết quả luận lý
 * */
public class Bai7XepLoaiSinhVien {

	public static void main(String[] args) {
		// Code đầu vào
		String hoTen, xepLoai;
		int toan, ly, hoa, diemTB;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Họ Tên Sinh Viên: ");
		hoTen = scan.nextLine();
		System.out.println("Nhập điểm môn Toán: ");
		toan = scan.nextInt();
		System.out.println("Nhập điểm môn Lý: ");
		ly = scan.nextInt();
		System.out.println("Nhập điểm môn Hóa: ");
		hoa = scan.nextInt();
		
		
		// code xử lý
		diemTB = (toan+ly+hoa)/3;
		
		// code đầu ra
		
		if (diemTB >8.5) {
			xepLoai = "Giỏi";
			System.out.println("Bạn sinh viên "+hoTen+" xếp loại " + xepLoai);
		}
		if (diemTB >6.5) {
			xepLoai = "Khá";
			System.out.println("Bạn sinh viên "+hoTen+" xếp loại " + xepLoai);
		}
		if (diemTB >5) {
			xepLoai = "Trung Bình";
			System.out.println("Bạn sinh viên "+hoTen+" xếp loại " + xepLoai);
		}
		if (diemTB <5) {
			xepLoai = "Yếu";
			System.out.println("Bạn sinh viên "+hoTen+" xếp loại " + xepLoai);
		}
		
	}

}
