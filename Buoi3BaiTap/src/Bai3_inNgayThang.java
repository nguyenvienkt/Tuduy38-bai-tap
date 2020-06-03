/*Viết chương trình nhập vào 1 
 * ngày trong năm (ngày/tháng/năm), in ra ngày tiếp theo và ngày trước đó 
 * */

/* ngày,tháng,năm nhập kiểm tra ngày (1-31), tháng (1-12), năm >0 thì ok. còn lại thì nhắc
 * 
 * tháng nếu 
 * tháng 1, 3, 5, 7, 8, 10 và 12 có 31 ngày
 * tháng 4, 6, 9 và 11 có 30 ngày
 * tháng 2 nếu là năm nhuận (yyyy) thì có 29 ngày, còn không thì có 28 ngày.
 * --> nhập vào tháng, xong xem tháng có bao nhiêu ngày, rồi tìm ngày trước, và sau ngày nhập
 * case: tháng 1
 *  nếu ngày nhập là ngày 1 thì ngày trước là 31, tháng trước 12, năm trước = năm nhập--
 *  nếu ngày nhập là ngày 31 thì ngày trước là 30, tháng trước 1, năm trước = năm nhập--
 *  nếu ngày nhập >1 và <31 thì ngày trước là ngày nhập --, tháng trước = 1, năm trước = nam
 *  
 * ngày sau = ngày nhập + 1
 * */
import java.util.Scanner;

public class Bai3_inNgayThang {

	public static void main(String[] args) {
		// đầu vào
		int ngay, thang, nam;
		
			
		Scanner scan = new Scanner (System.in);
		System.out.println("Nhập ngày: ");
		ngay = scan.nextInt();
		
		System.out.println("Nhập tháng: ");
		thang = scan.nextInt();
		
		System.out.println("Nhập năm: ");
		nam = scan.nextInt();


		// xử lý
		
		// đầu ra
		if(    ngay <=0 || ngay>31&&thang==1
			|| ngay <=0 || ngay>31&&thang==3
			|| ngay <=0 || ngay>31&&thang==5
			|| ngay <=0 || ngay>31&&thang==7
			|| ngay <=0 || ngay>31&&thang==10
			|| ngay <=0 || ngay>31&&thang==12
			|| ngay <=0 || ngay>30&&thang==4
			|| ngay <=0 || ngay>30&&thang==6
			|| ngay <=0 || ngay>30&&thang==9
			|| ngay <=0 || ngay>30&&thang==11
			|| ngay <=0 || ngay>29&&thang==2&&(nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)
			|| ngay <=0 || ngay>28&&thang==2&&(nam %4 != 0 ) 	
				
			||	thang<=0 || thang >12 || nam <0) {
			System.out.println("Vui lòng nhập lại vì một trong những lý do dưới đây: ");
			System.out.println("Số ngày từ 1 đến 28 cho Tháng 2 năm không nhuận "
			+ "và 1 đến 29 cho Tháng 2 năm nhuận (số năm chia hết cho 4 và chia cho 100 ra kết quả khác 0 hoặc số năm chia 400 bằng 0");
			System.out.println("Số ngày từ 1 đến 30 cho Tháng 4, 6, 9 và 11");
			System.out.println("Số ngày từ 1 đến 31 cho Tháng 1, 3, 5, 7, 8, 10 và 12");
			System.out.println("Tháng từ 1 đến 12, năm phải là số dương");
		}
		
		else {
			switch (thang) {
			case 1:
				if (ngay==1) {
					System.out.print("Ngày trước đó là "+31);
					System.out.print(" tháng "+12);
					System.out.println(" năm "+ --nam);
					
					System.out.print("Ngày tiếp theo là "+2);
					System.out.print(" tháng "+thang);
					System.out.println(" năm "+ ++nam);
				}
				else if (ngay==31) {
					System.out.print("Ngày trước đó là "+ --ngay);
					System.out.print(" tháng "+thang);
					System.out.println(" năm "+ nam);
					
					System.out.print("Ngày tiếp theo là "+1);
					System.out.print(" tháng "+ ++thang);
					System.out.println(" năm "+ nam);
				}
				else {
					System.out.print("Ngày trước đó là "+ --ngay);
					System.out.print(" tháng "+thang);
					System.out.println(" năm "+ nam);
					
					int ngaySau = ngay+2;
					System.out.print("Ngày tiếp theo là "+ ngaySau);
					System.out.print(" tháng "+ thang);
					System.out.println(" năm "+ nam);
				}
				break;
			case 2:
	            if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {
	                System.out.println(" có 29 ngày.");
	                
	                if (ngay==1) {
						System.out.print("Ngày trước đó là "+31);
						System.out.print(" tháng "+ --thang);
						System.out.println(" năm "+ nam);
						
						System.out.print("Ngày tiếp theo là "+ ++ngay);
						System.out.print(" tháng "+ ++thang);
						System.out.println(" năm "+ nam);
					}
					else if (ngay==29) {
						System.out.print("Ngày trước đó là "+ --ngay);
						System.out.print(" tháng "+thang);
						System.out.println(" năm "+ nam);
						
						System.out.print("Ngày tiếp theo là "+1);
						System.out.print(" tháng "+ ++thang);
						System.out.println(" năm "+ nam);
					}
					else {
						System.out.print("Ngày trước đó là "+ --ngay);
						System.out.print(" tháng "+thang);
						System.out.println(" năm "+ nam);
						
						int ngaySau = ngay+2;
						System.out.print("Ngày tiếp theo là "+ ngaySau);
						System.out.print(" tháng "+ thang);
						System.out.println(" năm "+ nam);
					}
					
	                    
	            } 
	            else {
	                System.out.println(" có 28 ngày.");
	                if (ngay==1) {
						System.out.print("Ngày trước đó là "+31);
						System.out.print(" tháng "+ --thang);
						System.out.println(" năm "+ nam);
						
						System.out.print("Ngày tiếp theo là "+ ++ngay);
						System.out.print(" tháng "+ ++thang);
						System.out.println(" năm "+ nam);
					}
					else if (ngay==28) {
						System.out.print("Ngày trước đó là "+ --ngay);
						System.out.print(" tháng "+thang);
						System.out.println(" năm "+ nam);
						
						System.out.print("Ngày tiếp theo là "+1);
						System.out.print(" tháng "+ ++thang);
						System.out.println(" năm "+ nam);
					}
					else {
						System.out.print("Ngày trước đó là "+ --ngay);
						System.out.print(" tháng "+thang);
						System.out.println(" năm "+ nam);
						
						int ngaySau = ngay+2;
						System.out.print("Ngày tiếp theo là "+ ngaySau);
						System.out.print(" tháng "+ thang);
						System.out.println(" năm "+ nam);
					}
	            }
	            break;	
				
			 case 3:
				 if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {
		                System.out.println(" có 29 ngày.");
		             
		                if (ngay==1) {
							System.out.print("Ngày trước đó là "+29);
							System.out.print(" tháng "+ --thang);
							System.out.println(" năm "+ nam);
							
							System.out.print("Ngày tiếp theo là "+ ++ngay);
							System.out.print(" tháng "+ ++thang);
							System.out.println(" năm "+ nam);
						}
						else if (ngay==31) {
							System.out.print("Ngày trước đó là "+ --ngay);
							System.out.print(" tháng "+thang);
							System.out.println(" năm "+ nam);
							
							System.out.print("Ngày tiếp theo là "+1);
							System.out.print(" tháng "+ ++thang);
							System.out.println(" năm "+ nam);
						}
						else {
							System.out.print("Ngày trước đó là "+ --ngay);
							System.out.print(" tháng "+thang);
							System.out.println(" năm "+ nam);
							
							int ngaySau = ngay+2;
							System.out.print("Ngày tiếp theo là "+ ngaySau);
							System.out.print(" tháng "+ thang);
							System.out.println(" năm "+ nam);
						}
		                         
				 }
				 else {
			             System.out.println(" có 28 ngày.");
			       
			             if (ngay==1) {
								System.out.print("Ngày trước đó là "+28);
								System.out.print(" tháng "+ --thang);
								System.out.println(" năm "+ nam);
								
								System.out.print("Ngày tiếp theo là "+ ++ngay);
								System.out.print(" tháng "+ ++thang);
								System.out.println(" năm "+ nam);
							}
							else if (ngay==31) {
								System.out.print("Ngày trước đó là "+ --ngay);
								System.out.print(" tháng "+thang);
								System.out.println(" năm "+ nam);
								
								System.out.print("Ngày tiếp theo là "+1);
								System.out.print(" tháng "+ ++thang);
								System.out.println(" năm "+ nam);
							}
							else {
								System.out.print("Ngày trước đó là "+ --ngay);
								System.out.print(" tháng "+thang);
								System.out.println(" năm "+ nam);
								
								int ngaySau = ngay+2;
								System.out.print("Ngày tiếp theo là "+ ngaySau);
								System.out.print(" tháng "+ thang);
								System.out.println(" năm "+ nam);
							}
			             
			             
		           }
		           
			 
				 break;
				
			case 4:
				if (ngay==1) {
					System.out.print("Ngày trước đó là "+31);
					System.out.print(" tháng "+ --thang);
					System.out.println(" năm "+ nam);
					
					System.out.print("Ngày tiếp theo là "+ ++ngay);
					System.out.print(" tháng "+ ++thang);
					System.out.println(" năm "+ nam);
				}
				else if (ngay==30) {
					System.out.print("Ngày trước đó là "+ --ngay);
					System.out.print(" tháng "+thang);
					System.out.println(" năm "+ nam);
					
					System.out.print("Ngày tiếp theo là "+1);
					System.out.print(" tháng "+ ++thang);
					System.out.println(" năm "+ nam);
				}
				else {
					System.out.print("Ngày trước đó là "+ --ngay);
					System.out.print(" tháng "+thang);
					System.out.println(" năm "+ nam);
					
					int ngaySau = ngay+2;
					System.out.print("Ngày tiếp theo là "+ ngaySau);
					System.out.print(" tháng "+ thang);
					System.out.println(" năm "+ nam);
				}
				break;
			
			case 5:
				if (ngay==1) {
					System.out.print("Ngày trước đó là "+30);
					System.out.print(" tháng "+ --thang);
					System.out.println(" năm "+ nam);
					
					System.out.print("Ngày tiếp theo là "+ ++ngay);
					System.out.print(" tháng "+ ++thang);
					System.out.println(" năm "+ nam);
				}
				else if (ngay==31) {
					System.out.print("Ngày trước đó là "+ --ngay);
					System.out.print(" tháng "+thang);
					System.out.println(" năm "+ nam);
					
					System.out.print("Ngày tiếp theo là "+1);
					System.out.print(" tháng "+ ++thang);
					System.out.println(" năm "+ nam);
				}
				else {
					System.out.print("Ngày trước đó là "+ --ngay);
					System.out.print(" tháng "+thang);
					System.out.println(" năm "+ nam);
					
					int ngaySau = ngay+2;
					System.out.print("Ngày tiếp theo là "+ ngaySau);
					System.out.print(" tháng "+ thang);
					System.out.println(" năm "+ nam);
				}
				break;
				
			case 6:
				if (ngay==1) {
					System.out.print("Ngày trước đó là "+31);
					System.out.print(" tháng "+ --thang);
					System.out.println(" năm "+ nam);
					
					System.out.print("Ngày tiếp theo là "+ ++ngay);
					System.out.print(" tháng "+ ++thang);
					System.out.println(" năm "+ nam);
				}
				else if (ngay==30) {
					System.out.print("Ngày trước đó là "+ --ngay);
					System.out.print(" tháng "+thang);
					System.out.println(" năm "+ nam);
					
					System.out.print("Ngày tiếp theo là "+1);
					System.out.print(" tháng "+ ++thang);
					System.out.println(" năm "+ nam);
				}
				else {
					System.out.print("Ngày trước đó là "+ --ngay);
					System.out.print(" tháng "+thang);
					System.out.println(" năm "+ nam);
					
					int ngaySau = ngay+2;
					System.out.print("Ngày tiếp theo là "+ ngaySau);
					System.out.print(" tháng "+ thang);
					System.out.println(" năm "+ nam);
				}
				break;
			
			case 7:
				if (ngay==1) {
					System.out.print("Ngày trước đó là "+30);
					System.out.print(" tháng "+ --thang);
					System.out.println(" năm "+ nam);
					
					System.out.print("Ngày tiếp theo là "+ ++ngay);
					System.out.print(" tháng "+ ++thang);
					System.out.println(" năm "+ nam);
				}
				else if (ngay==31) {
					System.out.print("Ngày trước đó là "+ --ngay);
					System.out.print(" tháng "+thang);
					System.out.println(" năm "+ nam);
					
					System.out.print("Ngày tiếp theo là "+1);
					System.out.print(" tháng "+ ++thang);
					System.out.println(" năm "+ nam);
				}
				else {
					System.out.print("Ngày trước đó là "+ --ngay);
					System.out.print(" tháng "+thang);
					System.out.println(" năm "+ nam);
					
					int ngaySau = ngay+2;
					System.out.print("Ngày tiếp theo là "+ ngaySau);
					System.out.print(" tháng "+ thang);
					System.out.println(" năm "+ nam);
				}
				break;
			
			case 8:
				if (ngay==1) {
					System.out.print("Ngày trước đó là "+31);
					System.out.print(" tháng "+ --thang);
					System.out.println(" năm "+ nam);
					
					System.out.print("Ngày tiếp theo là "+ ++ngay);
					System.out.print(" tháng "+ ++thang);
					System.out.println(" năm "+ nam);
				}
				else if (ngay==31) {
					System.out.print("Ngày trước đó là "+ --ngay);
					System.out.print(" tháng "+thang);
					System.out.println(" năm "+ nam);
					
					System.out.print("Ngày tiếp theo là "+1);
					System.out.print(" tháng "+ ++thang);
					System.out.println(" năm "+ nam);
				}
				else {
					System.out.print("Ngày trước đó là "+ --ngay);
					System.out.print(" tháng "+thang);
					System.out.println(" năm "+ nam);
					
					int ngaySau = ngay+2;
					System.out.print("Ngày tiếp theo là "+ ngaySau);
					System.out.print(" tháng "+ thang);
					System.out.println(" năm "+ nam);
				}
				break;
				
			case 9:
				if (ngay==1) {
					System.out.print("Ngày trước đó là "+31);
					System.out.print(" tháng "+ --thang);
					System.out.println(" năm "+ nam);
					
					System.out.print("Ngày tiếp theo là "+ ++ngay);
					System.out.print(" tháng "+ ++thang);
					System.out.println(" năm "+ nam);
				}
				else if (ngay==30) {
					System.out.print("Ngày trước đó là "+ --ngay);
					System.out.print(" tháng "+thang);
					System.out.println(" năm "+ nam);
					
					System.out.print("Ngày tiếp theo là "+1);
					System.out.print(" tháng "+ ++thang);
					System.out.println(" năm "+ nam);
				}
				else {
					System.out.print("Ngày trước đó là "+ --ngay);
					System.out.print(" tháng "+thang);
					System.out.println(" năm "+ nam);
					
					int ngaySau = ngay+2;
					System.out.print("Ngày tiếp theo là "+ ngaySau);
					System.out.print(" tháng "+ thang);
					System.out.println(" năm "+ nam);
				}
				break;
			
			case 10:
				if (ngay==1) {
					System.out.print("Ngày trước đó là "+30);
					System.out.print(" tháng "+ --thang);
					System.out.println(" năm "+ nam);
					
					System.out.print("Ngày tiếp theo là "+ ++ngay);
					System.out.print(" tháng "+ ++thang);
					System.out.println(" năm "+ nam);
				}
				else if (ngay==31) {
					System.out.print("Ngày trước đó là "+ --ngay);
					System.out.print(" tháng "+thang);
					System.out.println(" năm "+ nam);
					
					System.out.print("Ngày tiếp theo là "+1);
					System.out.print(" tháng "+ ++thang);
					System.out.println(" năm "+ nam);
				}
				else {
					System.out.print("Ngày trước đó là "+ --ngay);
					System.out.print(" tháng "+thang);
					System.out.println(" năm "+ nam);
					
					int ngaySau = ngay+2;
					System.out.print("Ngày tiếp theo là "+ ngaySau);
					System.out.print(" tháng "+ thang);
					System.out.println(" năm "+ nam);
				}
				break;	
				
			case 11:
				if (ngay==1) {
					System.out.print("Ngày trước đó là "+31);
					System.out.print(" tháng "+ --thang);
					System.out.println(" năm "+ nam);
					
					System.out.print("Ngày tiếp theo là "+ ++ngay);
					System.out.print(" tháng "+ ++thang);
					System.out.println(" năm "+ nam);
				}
				else if (ngay==30) {
					System.out.print("Ngày trước đó là "+ --ngay);
					System.out.print(" tháng "+thang);
					System.out.println(" năm "+ nam);
					
					System.out.print("Ngày tiếp theo là "+1);
					System.out.print(" tháng "+ ++thang);
					System.out.println(" năm "+ nam);
				}
				else {
					System.out.print("Ngày trước đó là "+ --ngay);
					System.out.print(" tháng "+thang);
					System.out.println(" năm "+ nam);
					
					int ngaySau = ngay+2;
					System.out.print("Ngày tiếp theo là "+ ngaySau);
					System.out.print(" tháng "+ thang);
					System.out.println(" năm "+ nam);
				}
				break;	
					
			case 12:
				if (ngay==1) {
					System.out.print("Ngày trước đó là "+ 30);
					System.out.print(" tháng "+ --thang);
					System.out.println(" năm "+ nam);
					
					System.out.print("Ngày tiếp theo là "+ ++ngay);
					System.out.print(" tháng "+ ++thang);
					System.out.println(" năm "+ nam);
				}
				else if (ngay==31) {
					System.out.print("Ngày trước đó là "+ --ngay);
					System.out.print(" tháng "+thang);
					System.out.println(" năm "+ nam);
					
					System.out.print("Ngày tiếp theo là "+1);
					System.out.print(" tháng "+ 1);
					System.out.println(" năm "+ ++nam);
				}
				else {
					System.out.print("Ngày trước đó là "+ --ngay);
					System.out.print(" tháng "+thang);
					System.out.println(" năm "+ nam);
					
					int ngaySau = ngay+2;
					System.out.print("Ngày tiếp theo là "+ ngaySau);
					System.out.print(" tháng "+ thang);
					System.out.println(" năm "+ nam);
				}
				break;
	
			}
		}
	
	
	
	
	}
	

}
