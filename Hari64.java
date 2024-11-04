package mulai;

public class Day64 {
    public static void main(String[] args) {
        outerLoop:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 3) {
                    System.out.println("Break at i = " + i + ", j = " + j);
                    break outerLoop;
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    }
}


