/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas3;

/**
 *
 * @author User
 */
public class DemoKonversiSuhu {
    public static void main(String[] args) {
        // Membuat objek dari class KonversiSuhu2 (karena KonversiSuhu2 mewarisi KonversiSuhu)
        KonversiSuhu2 konversi = new KonversiSuhu2();

        // Memberikan nilai Celcius
        double celcius = 25;
        // Memanggil method celciusToFahrenheit dari class KonversiSuhu
        double fahrenheit = konversi.celciusToFahrenheit(celcius);
        System.out.println(celcius + " derajat Celcius = " + fahrenheit + " derajat Fahrenheit");

        // Memanggil method celciusToReamur dari class KonversiSuhu
        double reamur = konversi.celciusToReamur(celcius);
        System.out.println(celcius + " derajat Celcius = " + reamur + " derajat Reamur");

        // Memberikan nilai Fahrenheit
        double fahrenheitInput = 77;
        // Memanggil method fahrenheitToReamur dari class KonversiSuhu2
        double reamurFromFahrenheit = konversi.fahrenheitToReamur(fahrenheitInput);
        System.out.println(fahrenheitInput + " derajat Fahrenheit = " + reamurFromFahrenheit + " derajat Reamur");
    }
}
