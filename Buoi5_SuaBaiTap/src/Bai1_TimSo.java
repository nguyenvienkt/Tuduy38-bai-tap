/*Tìm số nguyên dương n nhỏ nhất sao cho : 1 + 2 + … + n > 5000
 * */
public class Bai1_TimSo {

	public static void main(String[] args) {
		// đầu vào
		int tong = 0, n=1;
		
		// xử lý
		while (true){ //tong<=5000. Dùng while true vòng lặp vô tận.
			tong +=n;
			if (tong>5000) {
				break;
			}
			n++;
		}
		
		// đầu ra
		System.out.println("Số n: "+n);
		System.out.println("Tổng: "+tong);

	}

}
