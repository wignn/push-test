package Tugas7;

public class LoopWhileAnakAyam {


    public static void main(String[] args) {
 
        int n = 10; 
        int i = n;

        System.out.println("\nLagu Anak Ayam menggunakan loop while:");
        while (i > 0) {
          if (i == 1) {
                System.out.println("Anak ayam turun " + i + ", mati satu tinggal induknya.");
       } else {
                System.out.println("Anak ayam turun " + i + ", mati satu tinggal " + (i - 1) + ".");
            }
            i--;
        }
    }
}

