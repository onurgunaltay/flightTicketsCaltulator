import java.util.Scanner;

/*
 * Kullanıcıdan gideceği mesafeyi km cinsinden alalım.
 * Kullanıcının yaşını öğrenelim.
 * Kullanıcının tercih ettiği yolculuk tipini öğrenelim.
 * Kişi 12 yaşından küçükse Total * %50
 * Kişi 12-24 yaşları arasındaysa Total * %10
 * Kişi 65 yaşından büyük ise  Total * %30
 * Kişi yolculuk tipini 2 seçerse Total * %20
 */

public class flightTicket {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Gideceğiniz mesafeyi KM cinsinden giriniz:");
        int distance = input.nextInt();

        System.out.print("Yaşınızı giriniz:");
        int age = input.nextInt();

        //Kullanıcıdan yolculuk tipini girmesini isteyelim.
        System.out.print("Yolculuk tipini seçiniz (1 => Tek Yon, 2 => Gidis Donus ) : ");
        int travelType = input.nextInt();


        if (distance > 0 && age > 0) {

            double total = distance * (0.10);

            if (age <= 12) {
                if (travelType == 2) {
                    double ageDiscount = (total - (total * (0.50)));
                    double directionDiscount = (ageDiscount - (ageDiscount * (0.20))) * 2;
                    System.out.println(directionDiscount);

                } else {
                    double ageDiscount = (total - (total * (0.50)));
                    System.out.println(ageDiscount);
                }
            } else if (age > 12 && age <= 24) {
                if (travelType == 2) {
                    double ageDiscount = (total - (total * (0.10)));
                    double directionDiscount = (ageDiscount - (ageDiscount * (0.20))) * 2;
                    System.out.println(directionDiscount);
                } else {
                    double ageDiscount = (total - (total * (0.10)));
                    System.out.println(ageDiscount);
                }
            } else if (age >= 65) {
                if (travelType == 2) {
                    double ageDiscount = (total - (total * (0.30)));
                    double directionDiscount = (ageDiscount - (ageDiscount * 0.20)) * 2;
                    System.out.println(directionDiscount);
                }
            } else {
                double ageDiscount = (total - (total * (0.30)));
                System.out.println(ageDiscount);
            }
        } else {
            System.out.println("Geçersiz sayı girdiniz");
        }
    }
}

