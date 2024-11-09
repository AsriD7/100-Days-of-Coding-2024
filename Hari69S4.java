package evaluaaa;

public class Main {
    public int perkalian (int a, int b){
        return a * b;
    }
    public static void main(String[] args) {
        Main perka = new Main();
        int a = 2;
        int b = 5;
        int hasil = perka.perkalian(a, b);
        System.out.println("Hasil perkalian = "+hasil);
    }
    
}
