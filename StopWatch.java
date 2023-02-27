package com.LogicalProgram;
import java.util.Scanner;
public class StopWatch {
    public static void main(String[] args) {
        double dif;
        Scanner sc = new Scanner(System.in);

        System.out.print("Start the stop watch: ");
        double start = sc.nextDouble();
        start = System.currentTimeMillis();

        System.out.print("Stop the stop watch: ");
        double stop = sc.nextDouble();
        stop = System.currentTimeMillis();

        if (stop == 0) {
            double now = System.currentTimeMillis();
            dif = now - start;
        } else {
            dif = stop - start;
        }
        double mils = dif % 1000;
        System.out.println("elapsed time is: " + mils + "msecs");
    }
}
