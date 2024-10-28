
package Tugas7;

public class LoopForBilangan {
    public static void main(String[] args) {
        
     int[] primes = {2, 3, 5, 7, 11, 13, 17, 19};
        System.out.println("Bilangan Prima dari 0-20:");
        
     for (int prime : primes) {
        System.out.print(prime + " ");
        }

        System.out.println("\nBilangan Bukan Prima dari 0-20:");
        for (int i = 0; i <= 20; i++) {
          boolean isPrime = false;
        for (int prime : primes) {
          if (i == prime) {
                isPrime = true;
            
            break;
            
           }
            
       }
         if (!isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
