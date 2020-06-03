import java.text.SimpleDateFormat;
import java.util.Scanner;

/*Viết chương trình nhập vào 1 
 * ngày trong năm (ngày/tháng/năm), in ra ngày tiếp theo và ngày trước đó 
 * */
/*	nhập chuỗi dd/mm/yyyy 
 * tách ký tự dd, mm, yyyy
 * ngày tiếp theo dd++ và ngày trước đó dd--
 * mm thì tháng các tháng 1, 3, 5, 7, 8, 10 và 12 có 31 ngày
 * các tháng 4, 6, 9 và 11 có 30 ngày
 * Riêng tháng 2 nếu là năm nhuận (yyyy) thì có 29 ngày, còn không thì có 28 ngày.
 * */
public class zBai3_timNgayThang {

	public static void main(String[] args) {
		// đầu vào
		String ngayThangNam;
		//String mm, dd, yyyy;
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Nhập ngày/tháng/năm: ");
		ngayThangNam = scan.nextLine();
		
		// xử lý
		char d1 = ngayThangNam.charAt(0);
		char d2 = ngayThangNam.charAt(1);
		int dd=Integer.parseInt(""+d1+d2);
		
		char m1 = ngayThangNam.charAt(3);
		char m2 = ngayThangNam.charAt(4);
		int mm = Integer.parseInt(""+m1+m2);
		
		char y1 = ngayThangNam.charAt(6);
		char y2 = ngayThangNam.charAt(7);
		char y3 = ngayThangNam.charAt(8);
		char y4 = ngayThangNam.charAt(9);
		int yyyy = Integer.parseInt(""+y1+y2+y3+y4);
		
		System.out.println("dd/mm/yyyy "+dd+" "+mm+" "+yyyy);
		// xem đầu năm, cuối năm, tháng 2
		// đầu ra
		
		int ngayTiepTheo, ngayTruocDo;
		
		ngayTiepTheo = dd+1;
		ngayTruocDo =dd-1;
		
		
		
		System.out.println("Ngày Tiếp Theo là "+ngayTiepTheo);
		System.out.println("Ngày trước đó là "+ngayTruocDo);
		switch (mm) {
        // các tháng 1, 3, 5, 7, 8, 10 và 12 có 31 ngày.
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            System.out.println("Tháng " + mm + " có 31 ngày.");
            break;
         
        // các tháng 4, 6, 9 và 11 có 30 ngày
        case 4:
        case 6:
        case 9:
        case 11:
            System.out.println("Tháng " + mm + " có 30 ngày.");
            break;
             
        // Riêng tháng 2 nếu là năm nhuận thì có 29 ngày, còn không thì có 28 ngày.
        case 2:
            if ((yyyy % 4 == 0 && yyyy % 100 != 0) || (yyyy % 400 == 0)) {
                System.out.println("Tháng " + mm + " năm " + yyyy + " có 29 ngày.");
            } else {
                System.out.println("Tháng " + mm + " năm " + yyyy + " có 28 ngày.");
            }
            break;
        default:
            System.out.println("Nhập tháng không hợp lệ.");
        }
		
		
		
		

	}

}
