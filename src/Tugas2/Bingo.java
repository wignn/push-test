/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas2;

/**
 *
 * @author User
 */
public class Bingo {
    private String name;

    public Bingo(String name) {
        this.name = name;
    }

    public void sing() {
        // Menampilkan awal lirik lagu
        // Menggunakan refrain untuk mempermudah & keteraturan kode
        String refrain = "There was a farmer who had a dog,\nAnd Bingo was his name-o.\n";

        // Looping untuk menghilangkan huruf B-I-N-G-O satu per satu
        for (int clapCount = 0; clapCount <= 5; clapCount++) {
            // Menampilkan bagian awal lirik
            System.out.print(refrain);

            // Menampilkan "clap" sesuai iterasi
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < clapCount; j++) {
                    System.out.print("(clap)-");
                }
                // Menampilkan huruf yang tersisa setelah clap
                System.out.println(name.substring(clapCount));
            }

            // Menampilkan akhir lirik
            System.out.println("And Bingo was his name-o.\n");
        }
    }

    public static void main(String[] args) {
        Bingo bingo = new Bingo("BINGO");

        // Method sing untuk menyanyikan lagu
        bingo.sing();
    }
}
