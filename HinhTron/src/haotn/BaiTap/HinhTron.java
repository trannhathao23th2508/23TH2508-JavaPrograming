
package haotn.BaiTap;

import java.util.Scanner;

public class HinhTron {


	    public static void main(String[] args) {
	    	 Scanner Scanner = new Scanner(System.in);   
	 // Sửa lỗi khai báo Scanner

	        System.out.print("Nhập bán kính hình tròn: ");
	        double banKinh = Scanner.nextDouble();

	        // Tính chu vi
	        double chuVi = 2 * Math.PI * banKinh;

	        // Tính diện tích
	        double dienTich = Math.PI * banKinh * banKinh;

	        System.out.println("Chu vi hình tròn: " + chuVi); // Sửa lỗi in
	        System.out.println("Diện tích hình tròn: " + dienTich); // Sửa lỗi in

    }


