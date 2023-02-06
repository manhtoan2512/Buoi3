package BaiVeNha;

import java.util.Scanner;

public class Bai05 {
    public static void main(String[] args) {
        System.out.print("Nhập 1 số bất kì: ");
        int number = new Scanner(System.in).nextInt();
        int reversed = 0;
        int number2 = number;
        while (number2>0) {
            reversed = reversed * 10 + number2 % 10;
            number2 /= 10;
        }
        if (number == reversed) {
            System.out.println("Đây là số thuận nghịch");
        } else {
            System.out.println("Đây không phải là số thuận nghịch");
        }
    }
}
