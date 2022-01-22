import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj liczbe A: ");
        int a = input.nextInt();

        System.out.print("Podaj liczbe B: ");
        int b = input.nextInt();

        input.close();

        int dodawanie = a + b;
        int odejmowanie = a - b;
        int mnozenie = a * b;
        int dzielenie = a / b;
        int modulo = a % b;

        System.out.println("\nDziałania na podanych liczbach:\n");
        System.out.printf("%d + %d = " + dodawanie + "\n", a, b);
        System.out.printf("%d - %d = " + odejmowanie + "\n", a, b);
        System.out.printf("%d * %d = " + mnozenie + "\n", a, b);
        System.out.printf("%d / %d = " + dzielenie + "\n", a, b);
        System.out.printf("%d modulo %d = " + modulo + "\n", a, b);
    }
}
