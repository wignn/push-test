package Tugas7;

public class LoopDoWhileHuruf {
    public static void main(String[] args) {
        System.out.println("Huruf Z - A menggunakan do-while:");
        char c = 'Z';
        do {
            System.out.print(c + " ");
            c--;
        } while (c >= 'A');
        System.out.println(); 
    }
}
