package mulai;
import java.util.Scanner;
public class Day60 {
    
    public static void main(String[] args) {
        String nama;
        do{
            Scanner in = new Scanner(System.in);
            System.out.print("Nama : ");
            nama = in.nextLine();
        }while(nama.equalsIgnoreCase("Asri"));
        System.out.println("Program selesai ");
    }
    
}
