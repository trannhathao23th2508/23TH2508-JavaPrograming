/**
 * 
 */
package Haotn_BaiTap;

import java.util.Scanner;

/**
 * 
 */
public class NhapXuatHoTen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hoTen;
		int tuoi;
		double chieuCao;
		double canNang;
	
		Scanner banPhim;
		banPhim = new Scanner(System.in);
		
		System.out.print("Họ Tên ?");		
		hoTen= banPhim.nextLine();
		System.out.print("Tuổi?");	
		tuoi= banPhim.nextInt();	
		System.out.print("Chiều Cao (m) ?");
		chieuCao= banPhim.nextDouble();
		System.out.print("Cân Nặng (kg) ?");
		canNang= banPhim.nextDouble();
		
		System.out.println("Name:" +hoTen);
		System.out.println("Tuổi:" +tuoi);
		System.out.println("Chiều Cao (m):" +chieuCao);
		System.out.println("Cân Nặng (kg):" +canNang);
	}

}
