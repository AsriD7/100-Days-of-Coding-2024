package day100;
import java.time.LocalTime;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LocalTime w = LocalTime.now();
        System.out.print("Masukkan nama : ");
        String nama = in.nextLine();
        if(w.getHour()>=12&&w.getHour()<=17){
            System.out.println("=================");
            System.out.println("Selamat Siang, "+nama+"\nProgram Anda Telah Selesai");
            System.out.println("=================");
        }else if(w.getHour()<12){
            System.out.println("=================");
            System.out.println("Selamat Pagi, "+nama+"\nProgram Anda Telah Selesai");
            System.out.println("=================");
        }else if(w.getHour()>17){
            System.out.println("=================");
            System.out.println("Selamat Malam, "+nama+"\nProgram Anda Telah Selesai");
            System.out.println("=================");
        }
    }
}
