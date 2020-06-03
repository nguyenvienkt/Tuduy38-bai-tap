import java.util.Scanner;

/*
 * Nhập 3 số float a, b, c từ bàn phím. Kiểm tra xem ba số này có tạo 
 * thành cạnh của tam giác hay không. Nếu có kiểm tra xem nó là loại tam giác 
 * nào trong các loại sau: vuông, vuông cân, cân, đều, tam giác thường. 
 * */
/*
 * 3 số tạo thành tam giác khi tổng hai số bất kỳ lớn hơn số còn lại: a+b> c && b+c>a && c+a>b
 * tam giác cân là tam giác có 2 cạnh bằng nhau: a==b || b=ac || c==a
 * tam giác đều là tam giác có 3 cạnh bằng nhau: a==b && b==c && c==a
 * tam giác vuông là tam giác có bình phương 1 cạnh bằng
 *  tổng các bình phương 2 cạnh còn lại: b*b=c*c+a*a || c*c=b*b+a*a || a*a=b*b+c*c
 * */
public class Bai2_tamGiac {

	public static void main(String[] args) {
		// đầu vào
		float a, b, c;
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập số thứ nhất: ");
		a = scan.nextFloat();
		
		System.out.println("Nhập số thứ hai: ");
		b = scan.nextFloat();
		
		System.out.println("Nhập số thứ ba: ");
		c = scan.nextFloat();
		
		// xử lý
		
		// đầu ra
		
		if (a+b >c && a+c>b && b+c>a) {
			System.out.print("3 số a, b, c tạo thành một tam giác và đó là ");
			if (a*a==b*b+c*c || b*b==c*c+a*a || c*c==a*a+b*b) {
				System.out.println("tam giác vuông");
			}
			else if (a*a==b*b+c*c && b==c || b*b==c*c+a*a && c==a || c*c==a*a+b*b &&b==a) {
				System.out.println("tam giác vuông cân");
			}
			
			else if (a==b||b==c||c==a) {
				System.out.println("tam giác cân");
				if (b==c&&c==a) {
					System.out.println("và cũng là tam giác đều");
				}
			}
			
			else if (a==b && b==c && c==a) {
				System.out.println("tam giác đều");
			}
			else {
				System.out.println("tam giác thường");
			}
				
		}
		
		else if (a+b<c || a+c<b || b+c<a){
				System.out.println("3 số a, b, c không tạo thành một tam giác");
			}
			
		

	}

}
