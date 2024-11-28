package mulai;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Jumlah mahasiswa : ");
        int a = in.nextInt();
        in.nextLine();
        String [] nama = new String[a];
        for(int i = 0; i < a; i++){
            System.out.print("nama mahasiswa : ");
            nama[i] = in.nextLine();
        }
        System.out.println(Arrays.toString(nama));
    }
}


