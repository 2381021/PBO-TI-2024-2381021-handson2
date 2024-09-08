package branching;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan nomor hari (1-7) : ");
        int nomorHari = input.nextInt();

        String namaHari = "";

        switch (nomorHari){
            case 1:
                namaHari = "Minggu";
                break;
            case 2:
                namaHari = "Senin";
        }
    }
}
