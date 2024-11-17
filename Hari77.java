package mulai;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nama : ");
        String nama = in.nextLine();
        if(nama.equals("Asri")){
            System.out.println("Benar");
        }else{
            System.out.println("Salah");
        }
    }
}


