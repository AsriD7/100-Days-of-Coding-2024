package mulai;

public class Main {
    public static int Penjum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + Penjum(n - 1);
    }
    public static void main(String[] args) {
        int ang = 5;
        int hasil = Penjum(ang);
        System.out.println("Penjumlahan dari 1 hingga "+ang+" adalah: "+hasil);
    }
}
