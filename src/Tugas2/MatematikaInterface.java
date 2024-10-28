/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Tugas2;

/**
 *
 * @author User
 */
public interface MatematikaInterface {
   
    int pertambahan(int a, int b);
    int pengurangan(int a, int b);
    int perkalian(int a, int b);
    int pembagian(int a, int b);
}

class Matematika implements MatematikaInterface {
   
    public int pertambahan(int a, int b) {
        return a + b;
    }
    
    public int pengurangan(int a, int b) {
        return a - b;
    }

    public int perkalian(int a, int b) {
        return a * b;
    }

    public int pembagian(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Pembagian dengan nol tidak valid!");
            return 0;
        }
    }
}
class MatematikaBeraksi {
    public static void main(String[] args) {
        // Buat objek Matematika
        Matematika matematika = new Matematika();

        int hasilPertambahan = matematika.pertambahan(20, 10);
        System.out.println("Pertambahan: 20 + 10 = " + hasilPertambahan);

        int hasilPengurangan = matematika.pengurangan(10, 5);
        System.out.println("Pengurangan: 10 - 5 = " + hasilPengurangan);

        int hasilPerkalian = matematika.perkalian(10, 3);
        System.out.println("Perkalian: 10 * 3 = " + hasilPerkalian);

        int hasilPembagian = matematika.pembagian(21, 2);
        System.out.println("Pembagian: 21 / 2 = " + hasilPembagian);
    }
}
