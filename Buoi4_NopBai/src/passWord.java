/*Bài tập buổi 4, ghi chú thêm:

Mật khẩu để mở file: (Đọc hết các dòng dưới)
CyberSoft-n
Với n là MỘT CON SỐ sau khi đoạn lệnh sau đây thực thi:
 * */
public class passWord {

	public static void main(String[] args) {
		// đầu vào 
		
		int n = 1;

		final int num_compare = 12345;

		int total = 0;

		while( true ) 
		{
	         total += n;
	         if( total >= num_compare )
	         {
	                    break; 
	         }
	         n++;
		}
	}

}

// CyberSoft-157
