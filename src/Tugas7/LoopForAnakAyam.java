package Tugas7;

public class LoopForAnakAyam {

    public static void main(String[] args) {
        int n = 10; 
        System.out.println("Lagu Anak Ayam menggunakan loop for:");
        
        for (int i = n; i > 0; i--) {
          if (i == 1) {
                System.out.println("Anak ayam turun " + i + ", mati satu tinggal induknya.");
        } else {
                System.out.println("Anak ayam turun " + i + ", mati satu tinggal " + (i - 1) + ".");
            }
        }
    }
}
