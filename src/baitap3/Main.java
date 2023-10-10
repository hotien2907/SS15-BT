package baitap3;



public class Main {
    public static void main(String[] args) {
        Object[] numbers = {5, 7, 10, 34, "23", 46};
        int sum = calculateSum(numbers);
        System.out.println("Tổng của mảng là: " + sum);
    }

    public static int calculateSum(Object[] arr) {
        int sum = 0;

        for (Object element : arr) {
            try {
                if (element instanceof Integer) {
                    sum += (int) element;
                } else if (element instanceof String) {
                    int intValue = Integer.parseInt((String) element);
                    sum += intValue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Phần tử không phải là số nguyên. Bỏ qua phần tử này.");
            }
        }

        return sum;
    }
}
