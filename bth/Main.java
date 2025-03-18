package bth;

import java.util.Scanner;

public class Main {
    static final int Max_student = 100;
    static int size = 5;
    static String[] students = {"Nguyen Van A", "Tran Thi B", "Le Van C", "Pham Thi D", "Hoang Van E"};
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            showMenu();
            int choice = sc.nextInt();
            sc.nextLine();
            handleChoice(choice);
        }
    }

    public static void showMenu() {
        System.out.println("+------------------Menu------------------+");
        System.out.println("| 1. Hiển thị danh sách sinh viên        |");
        System.out.println("| 2. Thêm thông tin sinh viên            |");
        System.out.println("| 3. Sửa thông tin sinh viên             |");
        System.out.println("| 4. Xóa thông tin sinh viên             |");
        System.out.println("| 5. Thoát                               |");
        System.out.println("+----------------------------------------+");
        System.out.print("-> Nhập lựa chọn của bạn: ");
    }

    public static void handleChoice(int choice) {
        switch (choice) {
            case 1:
                displayStudents();
                break;
            case 2:
                addStudent();
                break;
            case 3:
                editStudent();
                break;
            case 4:
                deleteStudent();
                break;
            case 5:
                System.out.println("Thoát chương trình.");
                sc.close();
                return;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
        }
    }

    public static void displayStudents() {
        System.out.println("Danh sách sinh viên:");
        if (size == 0) {
            System.out.println("Danh sách trống.");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.println((i + 1) + ". " + students[i]);
            }
        }
    }

    public static void addStudent() {
        if (size < Max_student) {
            System.out.print("Nhập tên sinh viên: ");
            students[size] = sc.nextLine();
            size++;
            System.out.println("Thêm sinh viên thành công!");
        } else {
            System.out.println("Danh sách đã đầy, không thể thêm!");
        }
    }

    public static void editStudent() {
        System.out.print("Nhập số thứ tự sinh viên cần sửa: ");
        int editIndex = sc.nextInt();
        sc.nextLine();
        if (editIndex > 0 && editIndex <= size) {
            System.out.print("Nhập tên mới: ");
            students[editIndex - 1] = sc.nextLine();
            System.out.println("Cập nhật thành công!");
        } else {
            System.out.println("Sinh viên không tồn tại!");
        }
    }

    public static void deleteStudent() {
        System.out.print("Nhập số thứ tự sinh viên cần xóa: ");
        int deleteIndex = sc.nextInt();
        sc.nextLine();
        if (deleteIndex > 0 && deleteIndex <= size) {
            for (int i = deleteIndex - 1; i < size - 1; i++) {
                students[i] = students[i + 1];
            }
            size--;
            System.out.println("Xóa thành công!");
        } else {
            System.out.println("Sinh viên không tồn tại!");
        }
    }
}
