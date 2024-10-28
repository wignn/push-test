package Tugas7;

public class LoopWhileGanjilGenap {
    public static void main(String[] args) {
        
        System.out.println("\nBilangan Genap dari 0-20:");
        int i = 0;
        while (i <= 20) {
          if (i % 2 == 0) {
            System.out.print(i + " ");
            }
            i++;
        }

        System.out.println("\nBilangan Ganjil dari 0-20:");
        i = 0;
        do {
          if (i % 2 != 0) {
            System.out.print(i + " ");
            }
            i++;
        } while (i <= 20);
    }
}
