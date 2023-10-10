package baitap2;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {};

        try {
            int maxNumber = max(numbers);
            System.out.println("Số lớn nhất trong mảng là: " + maxNumber);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int max(int[] arr) throws Exception {
        if (arr.length == 0) {
            throw new Exception("Mảng rỗng");
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
