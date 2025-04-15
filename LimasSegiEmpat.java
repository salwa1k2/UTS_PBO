/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.limassegiempat;

/**
 *
 * @author Acer
 */
class LimasSegiEmpat {
    private double luasAlas;
    private double luasSelubungLimas;
    private double tinggi;

    public LimasSegiEmpat(double luasAlas, double luasSelubungLimas, double tinggi) {
        this.luasAlas = luasAlas;
        this.luasSelubungLimas = luasSelubungLimas;
        this.tinggi = tinggi;
    }

    public void setLuasAlas(double luasAlas) {
        this.luasAlas = luasAlas;
    }
    
    public double getLuasAlas() {
        return luasAlas;
    }
    
    public void setLuasSelubung(double luasSelubungLimas) {
        this.luasSelubungLimas = luasSelubungLimas;
    }
    
    public double getLuasSelubung() {
        return luasSelubungLimas;
    }
    
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    public double getTinggi() {
        return tinggi;
    }

    public double getLuas() {
        return luasAlas + luasSelubungLimas;
    }

    public double getVolume() {
        return (1.0/3.0) * luasAlas * tinggi;
    }
}