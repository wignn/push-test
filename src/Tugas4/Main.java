/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas4;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek balok dan kubus
        BangunRuang balok = new Balok(5, 3, 2);
        BangunRuang kubus = new Kubus(4);

        // Menampilkan hasil perhitungan volume dan luas permukaan
        System.out.println("Balok:");
        System.out.println("Volume Balok: " + balok.hitungVolume());
        System.out.println("Luas Permukaan Balok: " + balok.hitungLuasPermukaan());

        System.out.println("Kubus:");
        System.out.println("Volume Kubus: " + kubus.hitungVolume());
        System.out.println("Luas Permukaan Kubus: " + kubus.hitungLuasPermukaan());
    }
}
