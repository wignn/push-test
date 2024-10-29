/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas3;

/**
 *
 * @author User
 */
public class Matematika2 extends Matematika {
    
    // Method untuk modulus
    public int modulus(int a, int b) {
        // Pastikan b bukan nol
        if (b != 0) {
            return a % b;
        } else {
            System.out.println("Error: Pembagi tidak boleh nol.");
            return 0;
        }
    }
}
