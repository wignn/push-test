
public class MahasiswaBeraksi {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();

        mahasiswa.membaca();
        mahasiswa.nyontek();
        mahasiswa.modifikasi();
    }
}
class Mahasiswa {
    
    public void membaca() {
        System.out.println("Mahasiswa sedang membaca.");
    }

    public void nyontek() {
        System.out.println("Mahasiswa sedang menyontek.");
    }

    public void modifikasi() {
        System.out.println("Mahasiswa sedang memodifikasi coding.");
    }
}

