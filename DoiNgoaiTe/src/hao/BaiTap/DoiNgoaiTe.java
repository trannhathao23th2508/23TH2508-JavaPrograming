package hao.BaiTap;

import java.util.Scanner;

	public class DoiNgoaiTe {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Danh sách các loại tiền tệ
	        String[] currencies = {"USD", "EUR", "VND"};

	        boolean continueConversion = true;

	        while (continueConversion) {
	            try {
	                // Hiển thị menu lựa chọn
	                	System.out.println("Chọn loại tiền tệ muốn đổi:");
	                for (int i = 0; i < currencies.length; i++) {
	                    System.out.println((i + 1) + ". " + currencies[i]);
	                }

	                // Nhập loại tiền tệ nguồn và đích
	                	System.out.print("Nhập loại tiền tệ nguồn: ");
	                int sourceCurrency = scanner.nextInt() - 1;
	                	System.out.print("Nhập loại tiền tệ đích: ");
	                int destinationCurrency = scanner.nextInt() - 1;

	                // Kiểm tra dữ liệu nhập vào
	                if (sourceCurrency < 0 || sourceCurrency >= currencies.length ||
	                        destinationCurrency < 0 || destinationCurrency >= currencies.length ||
	                        sourceCurrency == destinationCurrency) {
	                    System.out.println("Lựa chọn không hợp lệ!");
	                    continue;
	                }

	                // Nhập số tiền cần đổi
	                	System.out.print("Nhập số tiền cần đổi: ");
	                double amount = scanner.nextDouble();
	                if (amount <= 0) {
	                    System.out.println("Số tiền phải là số dương!");
	                    continue;
	                }

	                // Lấy tỷ giá (thay thế bằng cách gọi API)
	                double exchangeRate = 0.0; // Ví dụ: tỷ giá USD/EUR = 0.9
	                // ... (code để lấy tỷ giá từ API)

	                // Tính toán và hiển thị kết quả
	                double convertedAmount = amount * exchangeRate;
	                	System.out.println(amount + " " + currencies[sourceCurrency] + " tương đương " + convertedAmount + " " + currencies[destinationCurrency]);

	                // Hỏi người dùng có muốn tiếp tục
	                	System.out.print("Bạn có muốn tiếp tục đổi tiền không? (y/n): ");
	                	String choice = scanner.next();
	                continueConversion = choice.equalsIgnoreCase("y");
	            }
	            catch (Exception e) {
	                	System.out.println("Lỗi: " + e.getMessage());
	                scanner.nextLine(); // Clear scanner
	            }
	        }
	    }
	}

