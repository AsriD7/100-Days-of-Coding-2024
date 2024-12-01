package guest;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            String a = in.nextLine();
            String b = in.nextLine();
            if(a.equalsIgnoreCase("i") && b.equalsIgnoreCase("you")){
                System.out.println("end");
                break;
            }else{
                System.out.println("Langgeng yah :) ");
            }
            
        }
    }
}
