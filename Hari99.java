package day99;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Bilangan 1 : ");
        int a = in.nextInt();
        System.out.print("Bilangan 2 : ");
        int b = in.nextInt();
        System.out.println();
        System.out.print("1. Penjumlahan\n2. Pengurangan\n3. Perkalian\n4. Pembagian\n5. Modulo");
        System.out.print("\nPilihan : ");
        int pilihan = in.nextInt();
        
        int hasil = 0;
        switch(pilihan){
            case 1 : hasil = a + b; break;
            case 2 : hasil = a - b; break;
            case 3 : hasil = a * b; break;
            case 4 : hasil = a / b; break;
            case 5 : hasil = a % b; break;
            default : System.out.println("Pilihan salah"); break;
        }
        System.out.println("Hasil = "+hasil);
    }
}
