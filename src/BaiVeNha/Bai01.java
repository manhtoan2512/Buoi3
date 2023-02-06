package BaiVeNha;

import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        System.out.print("Nhập a: ");
        float a = new Scanner(System.in).nextFloat();
        System.out.print("Nhập b: ");
        float b = new Scanner(System.in).nextFloat();
        System.out.print("Nhập c: ");
        float c = new Scanner(System.in).nextFloat();
        System.out.print("Nhập d: ");
        float d = new Scanner(System.in).nextFloat();

        if (a > b && a > c && a > d) {
            System.out.println("a là số lớn nhất");
        } else if (b>c && b>a && b>d) {
            System.out.println("b là số lớn nhất");
        } else if (c>a && c>b && c>d) {
            System.out.println("c là số lớn nhất");
        } else {
            System.out.println("d là số lớn nhất");
        }
    }
}