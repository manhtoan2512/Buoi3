package BaiVeNha;

import java.util.Scanner;

public class Bai02 {
    public static void main(String[] args) {
        System.out.print("Nhập số tự nhiên n: ");
        int n = new Scanner(System.in).nextInt();
        int i = 1;
        int demSTN = 0;
        for (i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println("ước của n là: " + i);
                demSTN++;
            }
        }
        System.out.println("n có " + demSTN + " ước số");
    }
}
