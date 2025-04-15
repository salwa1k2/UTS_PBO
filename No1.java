/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.no1;

/**
 *
 * @author Acer
 */
import java.util.Random;

public class No1 {

    public static void main(String[] args) {
        Random random = new Random();

        int pilih = random.nextInt(12) + 1;

        String bulan= "";
        
        switch (pilih) {
            case 1:
                bulan = "Januari";
                break;
            case 2:
                bulan = "Februari";
                break;
            case 3:
                bulan = "Maret";
                break;
            case 4:
                bulan = "April";
                break;
            case 5:
                bulan = "Mei";
                break;
            case 6:
                bulan = "Juni";
                break;
            case 7:
                bulan = "Juli";
                break;
            case 8:
                bulan = "Agustus";
                break;
            case 9:
                bulan = "September";
                break;
            case 10:
                bulan = "Oktober";
                break;
            case 11:
                bulan = "November";
                break;
            case 12:
                bulan = "Desember";
                break;
        }
        
        System.out.println("bulan ke - " + pilih);
        System.out.println("yaitu: " + bulan);
        
                
    }
}
