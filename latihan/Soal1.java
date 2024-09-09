package latihan;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan bilangan pertama");
        int a = input.nextInt();

        System.out.println("Masukan bilangan kedua");
        int b = input.nextInt();

        if (a > b){
            System.out.println("Bilngan pertama adalah bilangan maksimal");
            System.exit(0);
        }

        if (b > a){
            System.out.println("Bilangan kedua adalah bilangan maksimal");
            System.exit(0);
        }
    }
}
