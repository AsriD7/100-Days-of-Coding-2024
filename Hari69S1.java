package mulai;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka = ");
        int ang = in.nextInt();
        int hasil = 1;
        System.out.print(ang+"! = ");
        for(int i = ang; i > 0; i-- ){
            System.out.print(i);
            if(i > 1){
                System.out.print(" x ");
            }
            hasil *= i;
        }
        System.out.println(" = "+hasil);
    }
}


