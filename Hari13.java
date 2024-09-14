package RestoranPengunjung;

public class PengunjungRestoran {

    public static void main(String[] args) {
        System.out.println("Selamat datang di Restoran Makan Enak!");
        int jumlahPengunjungHariIni = 0;
        // Variabel ini digunakan untuk menyimpan jumlah pengunjung yang datang hari ini.
        short jumlahPengunjungSore = 15;
        jumlahPengunjungHariIni += jumlahPengunjungSore;
        // Asumsikan ada 15 pengunjung di pagi hari
        jumlahPengunjungHariIni += 15;
        System.out.print("Total pengunjung hari ini adalah: ");
        System.out.printf("%d pengunjung", jumlahPengunjungHariIni);
    }
}
