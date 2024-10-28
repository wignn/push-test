package Tugas7;

public class LoopWhileBilangan {
    public static void main(String[] args) {
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19};
        int i = 0;

        System.out.println("\nBilangan Prima (0-20) - Menggunakan while loop:");
        while (i < primes.length) {
            System.out.print(primes[i] + " ");
            i++;
        }

        i = 0;
        System.out.println("\nBilangan Bukan Prima (0-20) - Menggunakan while loop:");
        while (i <= 20) {
        boolean isPrime = false;
            int j = 0;
        while (j < primes.length) {
            if (i == primes[j]) {
                    isPrime = true;
                    break;
                }
                j++;
            }
            if (!isPrime) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
