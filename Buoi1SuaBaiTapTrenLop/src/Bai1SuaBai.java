import java.util.Scanner;

public class Bai1SuaBai {

	public static void main(String[] args) {
		// Code đầu vào
		Scanner scan = new Scanner(System.in);
		final int luongMotNgay = 100000;// Bởi vì lương là hằng số và không cho khai báo đè giá trị do đó phải cho là hằng số gán là "final"
		int soNgayLam, tongSoLuong; // cú pháp khai báo biến chứ chưa có gán giá trị, cùng kiểu dữ liệu thì khai báo cùng lúc
		
			// In ra câu lệnh nhận dữ liệu số ngày làm
		System.out.println("Mời bạn nhập số ngày đi làm: ");
		soNgayLam = scan.nextInt();
		
		// Code xử lý
		tongSoLuong = luongMotNgay*soNgayLam;
		
		// Code xuất ra
		System.out.println("Tổng lương tháng: " + tongSoLuong);

	}

}
