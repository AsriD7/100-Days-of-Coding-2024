package mulai;

public class invi {
    public int tambah (int a, int b){
        return a + b;
    }
    public static void main(String[] args) {
        invi penjumlahan = new invi();
        int a = 5;
        int b = 2;
        int hasil = penjumlahan.tambah(a, b);
        System.out.println(hasil);
    }
}
