/**
 * 
 */
package Haotn.BaiTap;

import java.util.Scanner;

/**
 * 
 */
public class TinhDelta {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in); 
		 
			System.out.print("Nhập hệ số a: ");
	        double a = scanner.nextDouble();

	        System.out.print(" Nhập hệ số b: ");
	        double b = scanner.nextDouble(); 
	        
	        System.out.print("Nhập hệ số c: ");
	        double c = scanner.nextDouble();
//tính delta
	        double delta = b * b - 4 * a * c;
	        
	        
	        System.out.println("Delta = " + delta);
	        System.out.println("Căn bậc hai của delta là: " + Math.sqrt(delta));
	}

}
