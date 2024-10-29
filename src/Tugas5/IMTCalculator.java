/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas5;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class IMTCalculator {
    public static void main(String[] args) {
        // Membuat scanner untuk input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta input berat badan dalam kilogram
        System.out.print("Masukkan berat badan (kg): ");
        double beratBadan = scanner.nextDouble();

        // Meminta input tinggi badan dalam meter
        System.out.print("Masukkan tinggi badan (meter): ");
        double tinggiBadan = scanner.nextDouble();

        // Menghitung IMT menggunakan rumus
        double IMT = beratBadan / (tinggiBadan * tinggiBadan);

        // Menentukan kriteria berdasarkan nilai IMT
        String kriteria;
        if (IMT <= 18.4) {
            kriteria = "Berat Badan Kurang";
        } else if (IMT >= 18.5 && IMT <= 24.9) {
            kriteria = "Berat Badan Ideal";
        } else if (IMT >= 25 && IMT <= 29.9) {
            kriteria = "Berat Badan Lebih";
        } else if (IMT >= 30 && IMT <= 39.9) {
            kriteria = "Gemuk";
        } else {
            kriteria = "Sangat Gemuk";
        }

        // Menampilkan hasil perhitungan IMT dan kriteria
        System.out.println("Indeks Massa Tubuh (IMT): %.2f\\n\" " + IMT);
        System.out.println("Kriteria: " + kriteria);

        
    }
}