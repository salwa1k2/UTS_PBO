/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.no3;

/**
 *
 * @author Acer
 */

import java.util.Scanner;

public class No3 {
         public static int sumDigits(long n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10; 
            n = n / 10;   
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan bilangan bulat: ");
        long angka = input.nextLong();

        int hasil = sumDigits(angka);
        System.out.println("jumlah semua digit: " + hasil);
    }
}
