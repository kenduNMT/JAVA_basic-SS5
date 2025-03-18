package bt5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập kích thước của mảng: ");

        int n = sc.nextInt();
        int[] array = new int[n];

        if (n == 0) {
            System.out.println("Kích thước rỗng");
            return;
        }
        {
            System.out.println("Nhập các phần tử của mảng:");
            for (int i = 0; i < n; i++) {
                System.out.print("Phần tử " + (i + 1) + ": ");
                array[i] = sc.nextInt();
            }
        }

        int maxOdd = Integer.MIN_VALUE;
        int minOdd = Integer.MAX_VALUE;
        boolean hasOdd = false; // Cờ kiểm tra có phần tử lẻ

        for (int num : array) {
            if (num > 0 && num % 2 != 0) {
                hasOdd = true;
                if (num > maxOdd) {
                    maxOdd = num;
                }
                if (num < minOdd) {
                    minOdd = num;
                }
            }
        }

        if (hasOdd) {
            System.out.println("Phần tử lẻ nguyên dương lớn nhất: " + maxOdd);
            System.out.println("Phần tử lẻ nguyên dương nhỏ nhất: " + minOdd);
        } else {
            System.out.println("Không có phần tử lẻ nguyên dương trong mảng");
        }

        sc.close();
    }
}
