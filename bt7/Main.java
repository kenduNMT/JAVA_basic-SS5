package bt7;

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
            int[] temp = new int[n]; // Mảng tạm thời để lưu sắp xếp
            int evenIndex = 0; // Chỉ số cho số chẵn
            int oddIndex = n - 1; // Chỉ số cho số lẻ

            System.out.println("Nhập các phần tử của mảng:");
            for (int i = 0; i < n; i++) {
                System.out.print("Phần tử " + (i + 1) + ": ");
                array[i] = scanner.nextInt();
            }

            for (int num : array) {
                if (num % 2 == 0) {
                    temp[evenIndex++] = num; // Số chẵn đưa về đầu
                } else {
                    temp[oddIndex--] = num; // Số lẻ đưa về cuối
                }
            }

            // Sao chép lại thứ tự từ mảng temp vào array
            System.arraycopy(temp, 0, array, 0, n);

            System.out.println("Mảng sau khi sắp xếp:");
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
