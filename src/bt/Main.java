package bt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        boolean validInput = false;

        do {
            try {
                System.out.print("Nhập số nguyên thứ nhất: ");
                num1 = Integer.parseInt(scanner.nextLine());

                System.out.print("Nhập số nguyên thứ hai: ");
                num2 = Integer.parseInt(scanner.nextLine());

                validInput = true;

                System.out.println("Tổng: " + (num1 + num2));
                System.out.println("Hiệu: " + (num1 - num2));
                System.out.println("Tích: " + (num1 * num2));

                try {
                    if (num2 == 0) {
                        throw new ArithmeticException("Không thể chia cho 0.");
                    }
                    System.out.println("Thương: " + ((double) num1 / num2));
                } catch (ArithmeticException e) {
                    System.out.println("Lỗi: " + e.getMessage());
                }

            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Vui lòng nhập số nguyên.");
            }
        } while (!validInput);
    }
}
