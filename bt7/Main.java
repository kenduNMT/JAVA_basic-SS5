package bt7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập kích thước của mảng: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Mảng không có phần tử");
        } else {
            int[] array = new int[n];

            System.out.println("Nhập các phần tử của mảng:");
            for (int i = 0; i < n; i++) {
                System.out.print("Phần tử " + (i + 1) + ": ");
                array[i] = scanner.nextInt();
            }

            // Khởi tạo danh sách cho số chẵn và số lẻ
            ArrayList<Integer> evenNumbers = new ArrayList<>();
            ArrayList<Integer> oddNumbers = new ArrayList<>();

            for (int num : array) {
                if (num % 2 == 0) {
                    evenNumbers.add(num);
                } else {
                    oddNumbers.add(num);
                }
            }

            System.out.println("Mảng sau khi sắp xếp:");
            for (int even : evenNumbers) {
                System.out.print(even + " ");
            }
            for (int odd : oddNumbers) {
                System.out.print(odd + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}