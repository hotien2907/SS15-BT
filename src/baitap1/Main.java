package baitap1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = getIntegerInput(scanner, "Nhập số nguyên thứ nhất: ");
        int num2 = getIntegerInput(scanner, "Nhập số nguyên thứ hai: ");

        int sum = num1 + num2;
        System.out.println("Tổng hai số là: " + sum);
    }

    public static int getIntegerInput(Scanner scanner, String message) {
        try {
            System.out.print(message);
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Lỗi: Bạn phải nhập vào một số nguyên. Vui lòng thử lại.");

            return getIntegerInput(scanner, message);
        }
    }
}
