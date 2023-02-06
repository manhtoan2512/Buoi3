package BaiVeNha;

import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {
        System.out.print("Nhập n: ");
        int n = new Scanner(System.in).nextInt();
        int S = 0;
        for (int i = 7; i <= n; i+=7) {
                S = S + i;
        }
        System.out.println("Tổng các số tự nhiên không lớn hơn " + n + " và chia hết cho " +
                "7 là " + S);
    }
}
