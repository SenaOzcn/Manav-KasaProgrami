import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // creat variables
        double armut, elma, domates, muz, patlican, armutFiyat, elmaFiyat, domatesFiyat, muzFiyat, patlicanFiyat, toplam;
        armutFiyat = 2.14;
        elmaFiyat = 3.67;
        domatesFiyat = 1.11;
        muzFiyat = 0.95;
        patlicanFiyat = 5.0;

        // get data from user
        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo? : ");
        armut = input.nextDouble();

        System.out.print("Elma Kaç Kilo? : ");
        elma = input.nextDouble();

        System.out.print("Domates Kaç Kilo? : ");
        domates = input.nextDouble();

        System.out.print("Muz Kaç Kilo? : ");
        muz = input.nextDouble();

        System.out.print("Patlıcan Kaç Kilo? : ");
        patlican = input.nextDouble();

        // Total
        toplam = (armut * armutFiyat) + (elma * elmaFiyat) + (domates * domatesFiyat) + (muz * muzFiyat) + (patlican * patlicanFiyat);
        System.out.print("Toplam Tutar: " + toplam + " TL");
    }
}
