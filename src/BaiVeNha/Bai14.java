package BaiVeNha;

import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
        System.out.print("Nhập n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Các số chẵn nhỏ hơn n: ");
        System.out.println("Các số lẻ nhỏ hơn n: ");
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
