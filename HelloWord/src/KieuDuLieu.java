
public class KieuDuLieu {

	public static void main(String[] args) {
		// Kiểu dữ liệu
		System.out.println(2020+2020); // số nguyên (4 byte bộ nhớ), trong Java mặc định là integer -int
		System.out.println(3.14); // số thực mặc định Java số thực là kiểu double - double
		System.out.println(3.14f); // thêm f vào sau nếu số thực là kiểu float - float
		System.out.println('@'); // Kí tự (char) trong dấu nháy đơn '' . chỉ được 1 ký tự, không được từ 2 kí tự trở lên
		System.out.println("Vien"); // Kiểu chuỗi trong dấy nháy kép
		System.out.println("123"); // trong Java 1 char = 2 byte. có 3 số nên chuỗi này chiếm 6 bytes bộ nhớ
		System.out.println("123"+123); // ra chuỗi vì Java tự chuyển đổi số sang chuỗi
		System.out.println(123+"123");
		System.out.println(3 * 5 + 10);
		
	}

}
