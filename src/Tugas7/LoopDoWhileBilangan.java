package Tugas7;

public class LoopDoWhileBilangan {
    public static void main(String[] args) {
      int[] primes = {2, 3, 5, 7, 11, 13, 17, 19};
      int i = 0;
        System.out.println("\nBilangan Prima (0-20) - Menggunakan do-while loop:");
        
      do {
            System.out.print(primes[i] + " ");
            i++;
    } while (i < primes.length);

        i = 0;
        System.out.println("\nBilangan Bukan Prima (0-20) - Menggunakan do-while loop:");
      do {
        boolean isPrime = false;
        int j = 0;
        do {
             if (i == primes[j]) {
                isPrime = true;
                    break;
                }
                j++;
            } while (j < primes.length);

            if (!isPrime) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= 20);
    }
}
