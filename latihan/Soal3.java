package latihan;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Kalkulator Sederhana");
        System.out.println("Pilih operasi yang diinginkan:");
        System.out.println("1. (+)");
        System.out.println("2. (-)");
        System.out.println("3. (*)");
        System.out.println("4. (/)");
        System.out.println("5. %");

        System.out.print("Masukkan pilihan operasi (1-5): ");
        int pilihan = input.nextInt();

        System.out.println("Masukkan bilangan pertama: ");
        int a = input.nextInt();

        System.out.println("Masukkan bilangan kedua: ");
        int b = input.nextInt();

        int hasil = 0;

        switch (pilihan) {
            case 1:
                hasil = a + b;
                System.out.println("Hasil penjumlahan: " + hasil);
                break;
            case 2:
                hasil = a - b;
                System.out.println("Hasil pengurangan: " + hasil);
                break;
            case 3:
                hasil = a * b;
                System.out.println("Hasil perkalian: " + hasil);
                break;
            case 4:
                if (a != 0) {
                    hasil = a / b;
                    System.out.println("Hasil pembagian: " + hasil);
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                }
                break;
            case 5:
                hasil = a % b;
                System.out.println("Hasil modulus: " + hasil);
                break;

            default:
                System.out.println("1 ampe 5 aja bang");
        }

        input.close();
    }
}