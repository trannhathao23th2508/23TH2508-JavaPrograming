package haotn.Baitap;

import java.util.Scanner;

public class DoiDonViDo {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menu lựa chọn đơn vị đo
        System.out.println("Chọn đơn vị muốn đổi:");
        System.out.println("1. Kilomet (km) sang mét (m)");
        System.out.println("2. Mét (m) sang kilomet (km)");
        System.out.println("3. Byte sang bit");
        System.out.println("4. Bit sang byte");
        System.out.print("Nhập lựa chọn của bạn: ");
        int luaChon = scanner.nextInt();
}
}
