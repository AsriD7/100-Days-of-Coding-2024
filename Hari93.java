package day93;

public class Main {
    public static void main(String[] args) {
        int a = 7;
        for (int i = a - 1; i >= 0; i--) {
            for (int j = 0; j < 2 * a - 1; j++) {
                if (j == i || j == 2 * a - 2 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
