package BaiVeNha;

import java.util.Scanner;

public class Bai03 {
    public static void main(String[] args) {
        System.out.print("Nhập a: ");
        int a = new Scanner(System.in).nextInt();
        System.out.print("Nhập b: ");
        int b = new Scanner(System.in).nextInt();
        int i = a;
        int j = b;
        while (i != j) {
            if (i > j) {
                i -= j;
            } else {
                j -= i;
            }
        }
        int ucln = i;
        int bcnn = (a*b/ucln);
        System.out.println("Ước chung lớn nhất của "+a+" là: " +ucln);
        System.out.println("Bội chung nhỏ nhất của "+b+" là: " +bcnn);

    }
}
