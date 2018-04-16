package pl.edu.ur.oopl6.zad1;

import java.util.Scanner;

public class SkladoweStatyczne {

    public static void main(String[] args) {
        // TODO zad 3
        double a, b, c, d;
        System.out.println(Figury.PoleKola(0.5));
        System.out.println(Figury.ObwodKola(0.5));
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj część rzeczywistą");
        a = odczyt.nextInt();
        System.out.println("Podaj część urojoną");
        b = odczyt.nextInt();
        System.out.println("Moduł wynosi " + Complex.Moduł(a, b));
        System.out.println("Wartośc sprężona wynosi " + Complex.Sprężenie(a, b));
        System.out.println("Wartośc wykładnicza wynosi " + Complex.Wykładnicza(a, b));
        System.out.println("Wartośc algebraiczna wynosi " + Complex.algebraiczna(a, b));
        System.out.println("Podaj część rzeczywistą ");
        a = odczyt.nextInt();
        System.out.println("Podaj część urojoną");
        b = odczyt.nextInt();
        System.out.println("Podaj część rzeczywistą drugiej liczby");
        c = odczyt.nextInt();
        System.out.println("Podaj część urojoną drugiej liczby");
        d = odczyt.nextInt();
        System.out.println(Complex.dodawanie_alg(a, b, c, d));
        System.out.println(Complex.odejmowanie(a, b, c, d));
        System.out.println(Complex.dzielenie(a, b, c, d));
        System.out.println(Complex.mnożenie(a, b, c, d));
        System.out.println("Podaj Moduł 1 liczby zespolonej");
        a = odczyt.nextInt();
        System.out.println("Podaj kąt 1 liczby zespolonej");
        b = odczyt.nextInt();
        System.out.println("Podaj Moduł 2 liczby zespolonej");
        c = odczyt.nextInt();
        System.out.println("Podaj kąt 2 liczby zespolonej");
        d = odczyt.nextInt();
        System.out.println("z1+z2="+Complex.dodawanie_wyk(a, b, c, d));
        System.out.println(Complex.dzielenie_wyk(a, b, c, d));
        System.out.println("Podaj część rzeczywistą");
        a = odczyt.nextInt();
        System.out.println("Podaj część urojoną");
        b = odczyt.nextInt();
        System.out.println(Complex.trzy_postacie(a, b));
    }

}
