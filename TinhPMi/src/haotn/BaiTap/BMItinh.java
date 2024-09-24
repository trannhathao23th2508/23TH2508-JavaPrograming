package haotn.BaiTap;

import java.util.Scanner;

public class BMItinh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner banPhim = new Scanner (System.in);
		//nhập Họ Tên 
		System.out.print("họ tên :");
		String hoTen= banPhim.nextLine();
		//nhap chieu cao
	System.out.print("chiều cao :");
	double chieuCao =banPhim.nextDouble();
	// nhap can nang
	System.out.print("cân nặng  :");
	double canNang =banPhim.nextDouble();
	
	double bmi=canNang/(chieuCao*chieuCao);
	
	System.out.println("bạn"+hoTen);
	System.out.println("bmi của bạn "+bmi);
	
	if (bmi<18.5)
		System.out.println("thiếu cân ");
	else if (bmi<25)
		System.out.println("cân nặng bình thường  ");
	else if (bmi<30)
		System.out.println("thừa cân , tiền béo phì ");
	else if (bmi<35)
		System.out.println("béo phì độ 1 ");
	else if (bmi<40)
		System.out.println("béo phì độ 2 ");
	else System.out.println("béo phì dộ 3 (bệnh lý)");
	
	
	
		
		
		
		
	}

}
