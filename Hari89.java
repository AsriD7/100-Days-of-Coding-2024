package mulai;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Jumlah teman : ");
        int a = in.nextInt();
        in.nextLine();
        String [] nama = new String[a];
        for(int i = 0; i < a; i++){
            System.out.print("nama : ");
            nama[i] = in.nextLine();
        }
        for(int i = 0; i < a; i++){
            System.out.println((i+1)+" "+nama[i]);
        }
        System.out.print("Index yg ingin di ubah mulai dari 0 : ");
        int index = in.nextInt();
        System.out.print("nama baru : ");
        in.nextLine();
        String baru = in.nextLine();
        nama[index] = baru;
        for(int i = 0; i < a; i++){
            System.out.println((i+1)+" "+nama[i]);
        }
        
    }
}

