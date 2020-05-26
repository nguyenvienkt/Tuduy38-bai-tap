import java.util.Scanner;

/* Bài 8. Tính tiền hóa đơn
 * Viết chương trình nhập vào thông tin một mặt hàng: Tên, số lượng, đơn giá
 * Tính và xuất tiền phải trả dựa vào quy tắc:
 * - Nếu mua số lượng từ 50 đến 100 sẽ được giảm 8%.
 * - Nếu mua số lượng trên 100 sẽ được giảm 12%.
 * */
public class Bai8TinhTienHoaDon {

	public static void main(String[] args) {
		// code đầu vào
		String tenHang;
		double soLuong, donGia, thanhTien, donGiaGiam=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập tên hàng: ");
		tenHang = scan.nextLine();
		
		System.out.println("Nhập số lượng hàng: ");
		soLuong = scan.nextInt();
		
		System.out.println("Nhập giá tiền: ");
		donGia = scan.nextInt();
		
		
		// code xử lý
		
		if(soLuong >=50 && soLuong<=100) {
			donGiaGiam = donGia-0.08*donGia;
		} 
		else if (soLuong >100) {
			donGiaGiam = donGia-0.12*donGia;
		} 
		else if (soLuong <50) {
			donGiaGiam = donGia;
		}
		
		thanhTien = soLuong*donGiaGiam;	
		
		
		// code đầu ra
		System.out.println("Tổng số tiền thanh toán là: "+ thanhTien);
	}

}
