package BaiVeNha;

import java.util.Scanner;

public class Bai08 {
    public static void main(String[] args) {
        System.out.print("Nhập n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.print("Nhập m: ");
        int m = new Scanner(System.in).nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if(i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("*  ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
