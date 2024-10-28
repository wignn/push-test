package Tugas7;

public class LoopDoWhileGanjilGenap {
    public static void main(String[] args) {
        int i = 0;

        System.out.println("\nBilangan Genap dari 0-20 (Do-While Loop):");
        do {
         if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= 20);

        i = 0; 
        System.out.println("\nBilangan Ganjil dari 0-20 (Do-While Loop):");
        do {
         if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= 20);
    }
}
