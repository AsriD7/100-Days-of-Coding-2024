package day95;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for(int i = a - 1; i>=0; i-- ){
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
