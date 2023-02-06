package BaiVeNha;

import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        System.out.print("Nhâp số tự nhiên n bất kì: ");
        int n = new Scanner(System.in).nextInt();
        int S = 0;
        int S1 = 0;
        int S2 = 0;
        for (int i = 0; i <= n; i++) {
            S = S + i;
            if (i % 2 != 0) {
                S1 = S1 + i;
            } else {
                S2 = S2 + i;
            }
        }
        System.out.println("S= " + S);
        System.out.println("S1= " + S1);
        System.out.println("S2= " + S2);
    }
}
