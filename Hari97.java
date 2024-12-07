package day97;
import java.util.Scanner;
public class Main {
    
    public static boolean inpri (int num){
        if(num<=1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("");
        System.out.print("Bilangan prima dari ");
        int a = in.nextInt();
        System.out.print("Sampai ");
        int b = in.nextInt();
        System.out.print("Adalah : ");
        for(int i = a; i <= b; i++){
            if(inpri(i)){
                System.out.print(i+" ");
            }
        }
    }  
}
