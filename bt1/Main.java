package bt1;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {10,20,5,50,30};
//        int[] numbers = {-1,-3,-2,-5};
//        int[] numbers = {100};
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        System.out.println("Phần tử lớn nhất là: "+max);
    }
}
