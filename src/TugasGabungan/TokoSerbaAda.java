package TugasGabungan;

import java.util.Scanner;

public class TokoSerbaAda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        String[] kodeBarang = {"a001", "a002", "a003"};
        String[] namaBarang = {"Buku", "Pensil", "Pulpen"};
        int[] hargaBarang = {3000, 4000, 5000};
        
        
        int[] jumlahBeli = new int[3];
        int totalBayar = 0;

        System.out.print("Masukkan Jumlah Item Barang: ");
        int jumlahItem = scanner.nextInt();

        for (int i = 0; i < jumlahItem; i++) {
            System.out.println("Data ke " + (i + 1));
            System.out.print("Masukkan Kode: ");
            String kode = scanner.next();
            System.out.print("Masukkan Jumlah Beli: ");
            int jumlah = scanner.nextInt();

            
            int index = -1;
            for (int j = 0; j < kodeBarang.length; j++) {
                if (kodeBarang[j].equalsIgnoreCase(kode)) {
                    index = j;
                    break;
                }
            }

            if (index != -1) {
                jumlahBeli[index] = jumlah;
                totalBayar += hargaBarang[index] * jumlah;
            } else {
                System.out.println("Kode barang tidak ditemukan.");
            }
        }

        
        System.out.println("\nTOKO SERBA ADA");
        System.out.println("*************************************");
        System.out.println("No  Kode Barang  Nama Barang  Harga  Jumlah Beli  Jumlah Bayar");
        System.out.println("==============================================================");

        for (int i = 0; i < kodeBarang.length; i++) {
            if (jumlahBeli[i] > 0) {
                int totalPerItem = hargaBarang[i] * jumlahBeli[i];
                System.out.printf("%-4d%-13s%-13s%-8d%-13d%-12d\n", i + 1, kodeBarang[i], namaBarang[i], hargaBarang[i], jumlahBeli[i], totalPerItem);
            }
        }

        System.out.println("==============================================================");
        System.out.println("Total Bayar                               " + totalBayar);
    }
}
