package bt6;

public class Main {
    public static void main(String[] args) {
//        int[] originalArray = {10, 20, 30, 10, 20, 30, 10, 20, 30, 40, 50, 50, 50, 50, 40, 10, 20, 30, 50, 40};
//        int[] originalArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 16, 14, 15, 13, 12, 11, 2, 1};
        int[] originalArray = {100, 200, 300, 400, 500, 600, 700, 800, 900, 100, 100, 200, 300, 100, 400, 100, 800, 100, 100, 200};
        int[] markingArray = new int[1000];

        // Đếm số lần xuất hiện của mỗi phần tử trong originalArray
        for (int num : originalArray) {
            markingArray[num]++;
        }

        // Tìm số lần xuất hiện nhiều nhất
        int maxFrequency = 0;
        for (int count : markingArray) {
            if (count > maxFrequency) {
                maxFrequency = count;
            }
        }

        System.out.println("Phần tử xuất hiện nhiều nhất với số lần xuất hiện là " + maxFrequency + ":");
        for (int i = 0; i < markingArray.length; i++) {
            if (markingArray[i] == maxFrequency) {
                System.out.println("Phần tử " + i);
            }
        }
    }
}
