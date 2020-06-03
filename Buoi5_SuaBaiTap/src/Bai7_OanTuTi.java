import java.util.Scanner;

/* Xây dựng chương trình trò chơi Oẳn Tù Tì (Bao,Búa Kéo). 
 * Người và máy sẽ chơi với nhau. Ngẫu nhiên cho máy một lựa chọn, 
 * gợi ý: - Quy ước 1 = Bao, 2 = Búa, 3 = Kéo int lua_chon_cua_may = (int) (Math.random() * 3 + 1);
Nếu người dùng nhập > 3 hoặc < 0 thì báo lỗi, bắt người dùng nhập lại. 
Nếu người dùng nhập 0 thì dừng trò chơi. Tính và xuất ra xem ai sẽ là người thắng nhiều nhất
 và tỉ số là bao nhiêu.

 * */
public class Bai7_OanTuTi {

	public static void main(String[] args) {
		// đầu vào
		Scanner scan = new Scanner(System.in);
		int soLanMayThang = 0, soLanBanThang = 0;
		
		while (true) {
		int mayChon = (int) (Math.random() * 3 + 1);
		//System.out.println("máy chọn: "+mayChon);
		int banChon;
		
		while (true) {
		System.out.println("Mời bạn chọn: 1-Bao, 2-Búa, 3-Kéo");
		banChon = scan.nextInt();
		// xử lý
		
		if(banChon <0 || banChon >3) {
			System.out.println("Vui lòng chọn từ 0 ->3");
		}
		else {
			break;
		}
		
		}
		if(banChon==0) {
			System.out.println("Hẹn gặp lại lần sau nhé");
			break;
		}
		// đầu ra
		if(banChon ==mayChon) {
			System.out.println("Hòa");
		}
		else if (mayChon==1 && banChon==3
				|| mayChon==2 && banChon==1
				|| mayChon==3 && banChon==2) {
			System.out.println("Chúc mừng, bạn thắng");
			soLanBanThang++;
		}
		else {
			System.out.println("Hẹn lần sau, bạn thua");
			soLanMayThang++;
		}
	
		}
		
		System.out.println("Tỉ số bạn - máy: "+soLanBanThang + " - "+soLanMayThang);

	}

}
