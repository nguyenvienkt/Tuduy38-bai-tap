
/* Viết chương trình nhập vào điểm trung bình và tên của 1 học sinh
 * in ra kết luận theo dạng: [tên HS] xếp loại [...]
 * Nếu điểm trung bình >=8: In ra học sinh giỏi
 * Nếu điểm trung bình >=6.5 và <8: In ra học sinh khá
 * Nếu điểm trung bình >=5.0 và <6.5: In ra học sinh trung bình
 * Nếu điểm trung bình <5: In ra học sinh xuất sắc*/
import java.util.Scanner;
public class DanNhapIfElseIf {

	public static void main(String[] args) {
		// Code đầu vào
		Scanner scan = new Scanner(System.in);
		int diemTrungBinh;
		String tenHocSinh;
			
		System.out.println("Mời bạn nhập số điểm trung bình: ");
		diemTrungBinh = Integer.parseInt(scan.nextLine());// đổi từ chuỗi sang số Lý do vì khi mà nhập số thì Java tự nhảy sang phần code xử lý luôn
		
		System.out.println("Mời bạn nhập tên học sinh: ");
		tenHocSinh = scan.nextLine();
		
		// Code xử lý
		
		// Code đầu ra
		
		if (diemTrungBinh >=8) {
			System.out.println("Bạn học sinh "+tenHocSinh+ " xếp loại giỏi");
		}
		else if (diemTrungBinh >=6.5) {	
			System.out.println("Bạn học sinh "+tenHocSinh+ " xếp loại khá");
		}
		else if (diemTrungBinh >=5) {
			System.out.println("Bạn học sinh "+tenHocSinh+ " xếp loại trung bình");
		}
		else { //else cuối đại diện cho trường hợp còn lại
			System.out.println("Bạn học sinh "+tenHocSinh+ " xếp loại yếu");
		}
	}
}
		
