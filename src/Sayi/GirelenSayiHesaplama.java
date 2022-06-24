package Sayi;

import java.util.Scanner;

public class GirelenSayiHesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sayi;

        System.out.print("Bir sayi giriniz: ");
        sayi = input.nextInt();

        for (int ciftSayi = 0; ciftSayi<sayi; ciftSayi++) {
            if (ciftSayi %2 ==0){
                System.out.println(ciftSayi);
            } else {
                continue;
            }
        }
    }
}
