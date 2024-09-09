package latihan;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan bilangan pertama");
        int a = input.nextInt();

        System.out.println("Masukan bilangan kedua");
        int b = input.nextInt();

        System.out.println("Masukan bilangan ketiga");
        int c = input.nextInt();

        if (a > b && a > c){
            System.out.println("Bilngan pertama adalah bilangan maksimal");

        }

        if (b > a && b > c){
            System.out.println("Bilangan kedua adalah bilangan maksimal");

        }

        if (c > a && c > b){
            System.out.println("Bilangan ketiga adalah bilangan maksimal");

        }
    }
}
