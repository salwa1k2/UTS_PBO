/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.no2;

/**
 *
 * @author Acer
 */
import java.util.Scanner;
public class No2 {
    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        
        int a = 0;
        int b = 0;
        double total = 0;
        int jumlah = 0;
        int bilangan;
        
        System.out.println("Masukan bilangan integer, program akan berhenti jika memasukan nilai 0: ");
        
        do {
            bilangan = input.nextInt();
            
            if (bilangan > 0) {
                a++;
                total += bilangan;
                jumlah++;
            } else if (bilangan < 0) {
                b++;
                total += bilangan;
                jumlah++;
            }
            
        } while (bilangan != 0);
        
        System.out.println("Jumlah bilangan positif adalah " + a);
        System.out.println("Jumlah bilangan negatif adalah " + b);
        System.out.println("Nilai total adalah " + total);
        
        if (jumlah > 0) {
            double avarage = total/jumlah;
            System.out.println("Nilai rata rata " + avarage);
        } else {
            System.out.println("Tidak ada bilangan yang dimasukkan selain 0.");
            }
        }
    
}
