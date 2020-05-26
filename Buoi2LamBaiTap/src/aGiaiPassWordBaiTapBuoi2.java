
public class aGiaiPassWordBaiTapBuoi2 {

	public static void main(String[] args) {
		/*
		 * CyberSoft-xyzh   >>>> ĐỌC TIẾP CHO HẾT TRƯỚC KHI HỎI

		với x, y,z, h là kết quả sau khi tất cả các lệnh sau đây thực thi :
		
		 
		
		int x = 1; 
		
		int y = 0; 
		
		int z = 0; 
		
		int h = 0; 
		
		 
		
		x+= 2; 
		
		y++;
		
		y+= x++;
		
		x+= y++; 
		
		z = y - 4;
		
		y = z-1; 
		
		h = ++z;
		 * */
		
		// Code đầu vào
		int x = 1;
		int y = 0;
		int z = 0;
		int h = 0;
		/*Lưu ý: x++; giống x = x+1; giống x += 1 // tăng thêm 1
		 * */
		
		// code xử lý
		x+= 2; 
		y++;		
		y+= x++;		
		x+= y++; 		
		z = y - 4;	
		y = z-1; 		
		h = ++z;

//		// Code đầu ra
		
		System.out.println("số x: "+ x);
		System.out.println("số y: "+ y);
		System.out.println("số z: "+ z);
		System.out.println("số h: "+ h);
		
		
		//pass: CyberSoft-xyzh ==> CyberSoft-8022

				
		
		
	}

}
