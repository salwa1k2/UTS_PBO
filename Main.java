/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.limassegiempat;

/**
 *
 * @author Acer
 */
public class Main {
     public static void main(String[] args) {
        LimasSegiEmpat limas1 = new LimasSegiEmpat(1.0, 1.0, 1.0);
        System.out.println("Limas segi empat dengan luas alas : " + limas1.getLuasAlas() + 
                  ", luas selubung limas : " + limas1.getLuasSelubung() + 
                  " dan tinggi : " + limas1.getTinggi() + 
                  ". Luasnya : " + limas1.getLuas() + 
                  ", sedangkan volumenya : " + limas1.getVolume());
        LimasSegiEmpat limas2 = new LimasSegiEmpat(30.0, 40.0, 50.0);
        System.out.println("Limas segi empat dengan luas alas : " + limas2.getLuasAlas() + 
                          ", luas selubung limas : " + limas2.getLuasSelubung() + 
                          " dan tinggi : " + limas2.getTinggi() + 
                          ". Luasnya : " + limas2.getLuas() + 
                          ", sedangkan volumenya : " + limas2.getVolume());
        LimasSegiEmpat limas3 = new LimasSegiEmpat(25.0, 35.0, 45.0);
        System.out.println("Limas segi empat dengan luas alas : " + limas3.getLuasAlas() + 
                          ", luas selubung limas : " + limas3.getLuasSelubung() + 
                          " dan tinggi : " + limas3.getTinggi() + 
                          ". Luasnya : " + limas3.getLuas() + 
                          ", sedangkan volumenya : " + limas3.getVolume());
     }
}