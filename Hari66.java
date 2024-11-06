package mulai;

public class Day66 {
    public static void main(String[] args) {
        System.out.println("<----Persegi-----\n");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println("\n<----Persegi Panjang-----\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


