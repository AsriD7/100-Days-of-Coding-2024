package mulai;
import java.util.Scanner;
public class Day41 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan bil pertama : ");
        String a = in.nextLine();
        int c = Integer.parseInt(a);
        System.out.print("Masukkan bil kedua : ");
        String b = in.nextLine();
        int d = Integer.parseInt(b);
        int pj = c + d;
        int pg = c - d;
        int pk = c * d;
        int pb = c / d;
        int md = c % d;
        if(pj>pk){
            System.out.println("Iya lebih besar");
        }else{
            System.out.println("Tidak lebih besar");
        }
        System.out.println("penjumlahan : "+pj);
        System.out.println("pengurangan : "+pg);
        System.out.println("perkalian   : "+pk);
        System.out.println("pembagian   : "+pb);
        System.out.println("modulus     : "+md);
        
        
        
    }
}
