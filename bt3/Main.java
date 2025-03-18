package bt3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Nhập kích thước của mảng: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        int countEven = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                countEven++;
            }
        }

        System.out.println("Tổng số chẵn là: "+countEven);

        sc.close();
    }
}
