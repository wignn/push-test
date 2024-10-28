/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas4;

/**
 *
 * @author User
 */
 class Kubus extends BangunRuang {
    private double sisi;

    // Constructor untuk menginisialisasi sisi kubus
    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    // Overriding method hitungVolume dari superclass
    
    public double hitungVolume() {
        return sisi * sisi * sisi;
    }

    // Overriding method hitungLuasPermukaan dari superclass
    
    public double hitungLuasPermukaan() {
        return 6 * (sisi * sisi);
    }
}