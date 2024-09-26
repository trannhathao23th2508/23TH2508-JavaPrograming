package Haotc.BaiTap; // Assuming this is your desired package name

import java.util.Scanner;

public class TinhDiemTB { // More descriptive class name

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập họ và tên sinh viên: ");
        String hoTen = scanner.nextLine();

        System.out.print("Nhập điểm trung bình: ");
        double diemTrungBinh = scanner.nextDouble();

        System.out.println(hoTen + " có điểm trung bình là: " + diemTrungBinh + " điểm.");
    }
}