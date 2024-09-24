package haotn.BaiTap;

public class BMItinh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner banPhim = new Scanner (System.in);
		//nhập Họ Tên 
		System.out.print("họ tên :");
		String hoTen = banPhim.nextline();
		//nhap chieu cao
	System.out.print("chiều cao :");
	double chieuCao =banPhim.nextDouble();
	// nhap can nang
	System.out.print("cân nặng  :");
	double canNang =banPhim.nextDouble();
	
	double bmi=canNang/(chieuCao*chieuCao);
	
	system.out.println("bạn"+hoTen);
	system.out.println("bmi của bạn "+bmi);
	
		
		
		
		
	}

}
