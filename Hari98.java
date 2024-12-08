package day98;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int x = 1;
        int y = 10;
        int h = 0;
        for(int i = x; i <= y; i++){
            if(i % 2 ==0){
                h += i;
            }
        }
        System.out.println(h);
    }
}
