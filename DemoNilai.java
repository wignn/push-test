
public class DemoNilai {
    public static void main(String[] args) {
       
        Nilai nilai = new Nilai("2310631170160", "Adelya Rosmarlina Haryani", 85, 90, 80, 88);
        
        nilai.cetakNilai();
    }
}

class Nilai {
    // Deklarasi variabel
    private String nim;
    private String nama;
    private double nilaiAbsen;
    private double nilaiTugas;
    private double nilaiUTS;
    private double nilaiUAS;

    // Konstruktor untuk inisialisasi variabel
    public Nilai(String nim, String nama, double nilaiAbsen, double nilaiTugas, double nilaiUTS, double nilaiUAS) {
        this.nim = nim;
        this.nama = nama;
        this.nilaiAbsen = nilaiAbsen;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    // Method untuk menghitung dan mencetak nilai
    public void cetakNilai() {
        double nilaiAkhir = (nilaiAbsen * 0.10) + (nilaiTugas * 0.20) + (nilaiUTS * 0.30) + (nilaiUAS * 0.40);

        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Nilai Absen [10%] : " + nilaiAbsen);
        System.out.println("Nilai Tugas [20%] : " + nilaiTugas);
        System.out.println("Nilai UTS [30%] : " + nilaiUTS);
        System.out.println("Nilai UAS [40%] : " + nilaiUAS);
        System.out.println("Nilai Akhir : " + nilaiAkhir);
    }
}
