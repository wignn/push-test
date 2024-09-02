/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author USER
 */
public class MahasiswaBeraksi {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();

        mahasiswa.membaca();
        mahasiswa.nyontek();
        mahasiswa.modifikasi();
    }
}
class Mahasiswa {
    
    public void membaca() {
        System.out.println("Mahasiswa sedang membaca.");
    }

    public void nyontek() {
        System.out.println("Mahasiswa sedang menyontek.");
    }

    public void modifikasi() {
        System.out.println("Mahasiswa sedang memodifikasi coding.");
    }
}

