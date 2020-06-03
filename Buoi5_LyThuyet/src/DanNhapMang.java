/* Địa chỉ ô nhớ trong bộ nhớ theo hệ cơ số thập lục phân
 * hệ nhịn phân 0,1
 * hệ thập phân 0,1,2,3,4,5,6,7,8,9
 * hệ thập lục phân (16) số: 0,1,2,3,4,5,6,7,8,9,a,b,c,d,e,f --> ff là số lớn nhất trong hệ thập lục phân
 * 
 * */
public class DanNhapMang {

	public static void main(String[] args) {
		
		// a, b, c, d ở đây là địa chỉ ô nhớ cho 4 biến.
		//--> nếu có nhiều biến thì sao? thì đưa vào mảng.
		
		// khai báo vậy là 4 phần tử trong mảng có giá trị mặc định là 0
		// khai báo mảng giá trị index đánh số từ 0. số thứ tự phần tử cuối cùng trong mảng = độ dài mảng trừ một. ví dụ mảng 4 phần tử thì phần 
		// tử cuối cùng là 4-1=3.
		
		int [] arr = new int [4]; 
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
		// khai báo vậy là 4 phần tử trong mảng có giá trị mặc định lần lượt là -3, 7, 5, 1
		int [] arr2 = {-3, 7, 5, 1};
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println(arr2[3]);

	}

}
