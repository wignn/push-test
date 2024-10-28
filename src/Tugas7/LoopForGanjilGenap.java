package Tugas7;

public class LoopForGanjilGenap {

    public static void main(String[] args) {
        System.out.println("Bilangan Genap dari 0-20 (For Loop):");
        
        for (int i = 0; i <= 20; i++) {
          if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nBilangan Ganjil dari 0-20 (For Loop):");
        for (int i = 0; i <= 20; i++) {
          if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
