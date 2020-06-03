import java.util.Scanner;

/*Chương trình cho phép máy tính phát sinh ngẫu nhiên một số từ 1 đến 1000. 
 * Người dùng sẽ đoán và nhập, nếu đúng với kết quả của máy, game sẽ dừng. 
 * Ngược lại máy sẽ báo bạn đang nhập một số LỚN HƠN hoặc NHỎ HƠN số bí mật. 
 * Xuất thêm người chơi cần bao nhiêu lần đoán để tìm ra số bí ẩn. Hàm tạo số ngẫu nhiên : 
 * *Gợi ý: int so_ngau_nhien = (int) (Math.random() * 999 + 1); 
 * Câu lệnh trên cho phép tạo ra một số random từ 1 - 1000
 * 
 * || __Tìm kiếm tuần tự (tuyến tính) --> kiểm tra từng giá trị, mỗi lần tìm bỏ 1 kết quả. Áp dụng cho mọi tập
 * || hợp. 
 * || __Tìm kiếm nhị phân
 * || __Tìm kiếm nội suy (interpolation)
 * ||
 * ||

 * */
public class Bai6_TroChoiDoanSo {

	public static void main(String[] args) {
		// đầu vào
		Scanner scan = new Scanner (System.in);
		int soNgauNhien = (int) (Math.random() * 999 + 1);
		int dem = 0;
		//System.out.println("Số bí mật: "+soNgauNhien);
		int soDoan;
		
		while (true) {
		System.out.println("Mời bạn đoán số từ 1 - 1000: ");
		soDoan = scan.nextInt();
		dem++;
		// xử lý
		
		
		// đầu ra
		if (soDoan == soNgauNhien) {
			System.out.println("Chúc mừng bạn đã thắng");
			System.out.println("Bạn đã dùng: "+dem+ " lần đoán");
			break;
		}
		else if (soDoan >soNgauNhien) {
			System.out.println("Bạn cần nhập số nhỏ hơn!");
		}
		else {
			System.out.println("Bạn cần nhâp số lớn hơn!");
		}
		
		}

	}

}
