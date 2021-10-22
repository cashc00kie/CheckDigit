package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your barcode number please.");
        int[] barcode = new int[13];
        for (int i = 0; i < barcode.length; i++) {
            barcode[i] = input.nextInt();
        }
// We are now adding any other numbers in correspondence to the algorithm on Teams
        int check1 = barcode[1] + barcode[3] + barcode[5] + barcode[7] + barcode[9] + barcode[11];
        int check2 = barcode[0] + barcode[2] + barcode[4] + barcode[6] + barcode[8] + barcode[10];
// Multiplying sum off odd placed numbers by 3
        int check3 = check1 * 3;
        int check4 = check2 + check3;
// Checking sum of numbers
        int lastCheck = check4 + barcode[12];
// Adding check number
        if (lastCheck == 80) {
            System.out.println("Your check digit matches that of the input");
        }else{
            System.out.println("Your check digit doesn't match that of the input");

        }
    }
}

