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

public class NilaiMahasiswa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data mahasiswa
        System.out.print("NPM: ");
        String npm = input.nextLine();
        
        System.out.print("Nama Mahasiswa: ");
        String nama = input.nextLine();
        
        System.out.print("Nilai Kehadiran: ");
        double nilaiKehadiran = input.nextDouble();
        
        System.out.print("Nilai Tugas: ");
        double nilaiTugas = input.nextDouble();
        
        System.out.print("Nilai UTS: ");
        double nilaiUTS = input.nextDouble();
        
        System.out.print("Nilai UAS: ");
        double nilaiUAS = input.nextDouble();

        // Menghitung nilai akhir
        double nilaiAkhir = (0.10 * nilaiKehadiran) + (0.20 * nilaiTugas) + (0.30 * nilaiUTS) + (0.40 * nilaiUAS);

        // Menentukan grade dan keterangan dari nilai akhir
        String grade;
        String keterangan;

        if (nilaiAkhir <= 45) {
            grade = "E";
            keterangan = "KURANG SEKALI";
        } else if (nilaiAkhir <= 55) {
            grade = "D";
            keterangan = "KURANG";
        } else if (nilaiAkhir <= 65) {
            grade = "C";
            keterangan = "CUKUP";
        } else if (nilaiAkhir <= 75) {
            grade = "B";
            keterangan = "BAIK";
        } else {
            grade = "A";
            keterangan = "ISTIMEWA";
        }

        // Output data dan hasil perhitungan
        System.out.println("\nTampilan Output:");
        System.out.println("NPM Mahasiswa       : " + npm);
        System.out.println("Nama Mahasiswa      : " + nama);
        System.out.println("Nilai Akhir         : " + nilaiAkhir);
        System.out.println("Grade               : " + grade);
        System.out.println("Keterangan          : " + keterangan);
        
    }
}
