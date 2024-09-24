package haotn.BaiTap;

import java.util.Scanner;

public class ChuviDientichCanhnhoHCN {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        // Nhập chiều dài và chiều rộng
        System.out.print("Nhập chiều dài: ");
        double chieuDai = Scanner.nextDouble();

        System.out.print("Nhập chiều rộng: ");
        double chieuRong = Scanner.nextDouble();

        // Tính chu vi
        double chuVi = 2 * (chieuDai + chieuRong);

        // Tính diện tích
        double dienTich = chieuDai * chieuRong;

        // Tìm cạnh nhỏ (giả sử chiều rộng luôn nhỏ hơn hoặc bằng chiều dài)
        double canhNho = Math.min(chieuDai, chieuRong);

        // In kết quả ra màn hình
        System.out.println("Chu vi hình chữ nhật: " + chuVi);
        System.out.println("Diện tích hình chữ nhật: " + dienTich);
        System.out.println("Cạnh nhỏ của hình chữ nhật: " + canhNho); // Sửa lỗi thiếu dấu ngoặc kép
    }
}

