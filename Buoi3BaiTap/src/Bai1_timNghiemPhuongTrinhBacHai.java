/*Viết chương trình để tìm nghiệm của phương trình bậc hai 
 * ax2 + bx + c = 0 
 * --> công thức nghiệm của PT bậc 2 một ẩn:
 * Delta (A) = b^2-4ac
 * A > 0, phương trình có 2 nghiệm x1 = (-b -Căn Delta)/2a, x2 = (-b +Căn Delta)/2a
 * A = 0, b = 0, c=0, vô số nghiệm
 * a = 0, b = 0 c#0 --> vô nghiệm
 * a = 0, b#0, c#0 -->  phương trình có nghiệm kép x1 = x2  = -b/2a
 * A < 0, phương trình vô nghiệm
 * */
import java.util.Scanner;

public class Bai1_timNghiemPhuongTrinhBacHai {

	public static void main(String[] args) {
		
		float a, b, c;
		float x1, x2;
		
		Scanner scan = new Scanner(System.in);
		    
        System.out.print("Nhập hệ số bâc 2 là a: ");
        a = scan.nextFloat();
        System.out.print("Nhập hệ số bậc 1 là b: ");
        b = scan.nextFloat();
        System.out.print("Nhập hằng số c: ");
        c = scan.nextFloat();
        
        // xử lý

        if (a == 0) 
        {
            if (b == 0) 
            {
                if (c==0) 
                {
                	System.out.println("Phương trình vô số nghiệm");
                }
                else 
                {
                	System.out.println("Phương trình vô nghiệm!");
                }
            } 
            else 
            {
                System.out.println("Phương trình có một nghiệm: "
                        + "x = " + (-c / b));
            }
        } 
        else 
        {
	        // tính nghiệm
        	float delta = b*b -4*a*c;
            if (delta > 0) 
            {
	            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
	            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
	            System.out.println("Phương trình có 2 nghiệm là: "
	                    + "x1 = " + x1 + " và x2 = " + x2);
	        } 
	        else if (delta == 0) 
	        {
	            x1 = (-b / (2 * a));
	            System.out.println("Phương trình có nghiệm kép: "
	                    + "x1 = x2 = " + x1);
	        } 
	        else 
	        {
	            System.out.println("Phương trình vô nghiệm!");
	        }

        } 
	        
	}
}
