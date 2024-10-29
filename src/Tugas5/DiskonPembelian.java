/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas5;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class DiskonPembelian { 
  public static void main(String[] args){ 
      
         int diskon = 0, totalBelanja = 500000;
         if(totalBelanja <= 500000){ 
         diskon = totalBelanja/5; 
         } else {
         diskon = totalBelanja/20;
}
        double potongan;
        double jumlahDibayar = totalBelanja - diskon;

        System.out.println("Total Belanja Rp. " + totalBelanja);
        System.out.println("Besarnya potongan Rp. = " + diskon); 
        System.out.println("Jumlah yang harus dibayarkan Rp. " + jumlahDibayar);
   } 
} 
