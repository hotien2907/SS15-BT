package baitap4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào chuỗi: ");
        String inputString = scanner.nextLine();

        List<Integer> integers = new ArrayList<>();

        for (char c : inputString.toCharArray()) {
            try {
                int number = Integer.parseInt(String.valueOf(c));
                integers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: " + c + " không phải là số nguyên thay thế bằng 0");
                integers.add(0);
            }
        }

        System.out.println("Danh sách số nguyên sau chuyển đổi:");
        System.out.println(integers);
    }
}
