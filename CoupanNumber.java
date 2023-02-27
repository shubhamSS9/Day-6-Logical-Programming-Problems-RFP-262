package com.LogicalProgram;
import java.util.Scanner;
public class CoupanNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of coupons: ");
        int n = sc.nextInt();

        char[] ch = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890".toCharArray();

        for (int i = 0; i < n; i++) {
            int random = (int) (Math.random() * 999999999); // to increase the value of math.random and storing it at
            // int.
            StringBuffer sb = new StringBuffer();
            while (random > 0) {
                sb.append(ch[random % ch.length]);
                random /= ch.length;
            }

            String CouponCode = sb.toString();
            System.out.println("Coupon Code: " + CouponCode);
        }
    }
}
