/**
 * 
 */
package bai3;

import java.util.Scanner;

/**
 * 
 */
public class ThetichHCN {

	/**
	 * @param args
	 */
	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);

		        // Nhập cạnh của khối lập phương
		        System.out.print("Nhập cạnh của khối lập phương: ");
		        double canh = scanner.nextDouble();

		        // Tính thể tích
		        double theTich = canh * canh * canh;

		        // Xuất kết quả
		        System.out.println("Thể tích của khối lập phương là: " + theTich);
	}
	
}
	
	
	


