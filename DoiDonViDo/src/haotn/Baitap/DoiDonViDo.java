package haotn.Baitap;

import java.util.Scanner;

public class DoiDonViDo {

	public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        // Menu lựa chọn đơn vị đo
        System.out.println("Chọn đơn vị muốn đổi:");
        System.out.println("1. Kilomet (km) sang mét (m)");
        System.out.println("2. Mét (m) sang kilomet (km)");
        System.out.println("3. Byte sang bit");
        System.out.println("4. Bit sang byte");
        System.out.print("Nhập lựa chọn của bạn: ");
        int luaChon = Scanner.nextInt();
        
        switch (luaChon) {
        
        case 1:
        	
            System.out.print("Nhập số kilomet: ");
            	double km = Scanner.nextDouble();
            	double m = km * 1000;
            System.out.println(km + " km = " + m + " m");
            	break;
        
        case 2:
        	
            System.out.print("Nhập số met: ");
            m = Scanner.nextDouble();
            km = m / 1000;
            System.out.println(m + " m = " + km + " km");
            break;   
            
        case 3:
            System.out.print("Nhập số byte: ");
            	double byteValue = Scanner.nextDouble();
            	double bitValue = byteValue * 8;
            
            System.out.println(byteValue + " byte = " + bitValue + " bit");
            	break;
            	
        case 4:
            System.out.print("Nhập số bit: ");
            bitValue = Scanner.nextDouble();
            byteValue = bitValue / 8;
            System.out.println(bitValue + " bit = " + byteValue + " byte");
            break;
            
        default:
        	
            System.out.println("Lựa chọn không hợp lệ!");
}
	}
}
