package mulai;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        int ang;
        do{
            Scanner in = new Scanner(System.in);
            System.out.print("Masukkan angka = ");
            ang = in.nextInt();
            if(ang % 2 ==0 && ang % 3==0){
                System.out.println("Angka adalah kelipatan 2 dan kelipatan 3. Masukkan angka lagi");
            }else if(ang % 2 == 0){
                System.out.println("Angka adalah kelipantan 2.");
            }else if(ang % 3 == 0){
                System.out.println("Angka adalah kelipatan 3.");
            }
        }while(ang % 2 ==0 && ang % 3==0);
        
    }
    
}
