package BaiVeNha;

import java.util.Scanner;

public class Bai04 {
    public static void main(String[] args) {
        System.out.print("Nhập n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println(n+" Số nguyên tố đầu tiên là: " );
        int p = 2;
        int i = 1;
        int flag;
        int dem;
        while (i <= n) {
            flag = 1;
            for (dem = 2; dem <= p - 1; dem++) {
                if (p % dem == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                System.out.print(p + " ");
                i++;
            }
            p++;
        }
    }
}
