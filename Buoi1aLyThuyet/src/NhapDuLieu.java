import java.util.Scanner;

/*Viết chương trình nhập tên vì sao bạn thích
 * in ra câu: [vì sao đó] đang tỏa sáng*/
public class NhapDuLieu {

	public static void main(String[] args) {
		// Lệnh nhập 
		// Cú pháp khai báo biến: [Kiểu dữ liệu] [tên biến] = [giá trị]
		//							Scanner			scan		new Scanner..args.
		Scanner scan = new Scanner(System.in); // Lệnh để user nhập
		System.out.println("Mời bạn nhập tên vì sao bạn thích:");
		String tenViSao = scan.nextLine(); // dòng lệnh này để cho user gõ text vào và gán text đó là chuỗi string
		System.out.println(tenViSao + " đang tỏa sáng");

	}

}
