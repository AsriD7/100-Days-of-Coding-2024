package mulai;

public class invi {
    public static void main(String[] args) {
        int ang = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ang + " ");
                ang++;
            }
            System.out.println();
        }
    }
}
