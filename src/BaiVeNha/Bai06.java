package BaiVeNha;

import java.util.Scanner;

public class Bai06 {
    public static void main(String[] args) {
        System.out.print("Nhập số nguyên bất kì: ");
        int n = new Scanner(System.in).nextInt();
        int S = 0;
        while (n != 0) {
            S = S + n % 10;
            n = n / 10;
        }
        System.out.println("Tổng các chữ số = " + S);
    }
}
