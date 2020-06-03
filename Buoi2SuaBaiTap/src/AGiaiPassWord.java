
public class AGiaiPassWord {

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
		/*
		 * 
							 * x	y	z	h
							 * 1	0	0	0
		* -->x +=2 --> 		   3	0	0	0 --> x tăng lên 2 đơn vị
		* -->y++   -->		   3	1	0	0 --> y tăng lên 1 đơn vị
		* -->y+=x++ -->		   4	4	0	0 --> y+= thực thiện trước, x++ thực hiện sau
		* -->x+=y++ -->		   8	5	0	0 --> x+= thực hiện trước, y++ thực hiện sau
		* --> z = y-4		   8	5	1	0 -->
		* --> y = z -1	       8	0	0	0 --> 
		* --> h = ++z		   8	0	2	2 --> ++z thực hiện trước, h thực hiện sau
		 * */
		int x = 3;
		System.out.println(x++);
		System.out.println(++x);
		// x++ --> thực hiện sau câu lệnh
		//++x --> thực hiện trước câu lệnh
	}

}
