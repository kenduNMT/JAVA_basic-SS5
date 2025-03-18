package bt4;

import java.util.Arrays;
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
        System.out.println("Mảng ban đầu: " + Arrays.toString(array));


        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }


        System.out.println("Mảng sau khi đảo ngược: " + Arrays.toString(array));

        sc.close();
    }
}
