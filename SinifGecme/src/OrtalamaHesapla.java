import java.util.Scanner;

public class OrtalamaHesapla {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mat,fizik,turkce,kimya,muzik;
        System.out.print("Lütfen matematik notunuzu giriniz :");
        mat = scan.nextInt();
        System.out.print("Lütfen fizik notunuzu giriniz :");
        fizik = scan.nextInt();
        System.out.print("Lütfen turkce notunuzu giriniz :");
        turkce =scan.nextInt();
        System.out.print("Lütfen kimya notunuzu giriniz :");
        kimya = scan.nextInt();
        System.out.print("Lütfen muzik notunuzu giriniz :");
        muzik = scan.nextInt();
       double ortalama =(mat+fizik+turkce+kimya+muzik)/5;
        if( ortalama > 55) {
            System.out.println("Sınıfı geçtiniz..");

        } else {
            System.out.println("Kaldınız..");
        }


    }
}
