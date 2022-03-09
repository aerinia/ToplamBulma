import java.util.Scanner;
public class Main {
/*
Tek sayı girilene kadar 4'e bölünen sayıların toplamını bulan program
 */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int toplam = 0;
        int n;
        do {
            System.out.print("Sayı giriniz:");
            n = s.nextInt();
            if (n % 4 == 0) {
                toplam += n;
            }
        } while (n % 2 == 0);
        System.out.print("Toplam: " + toplam);
    }
}