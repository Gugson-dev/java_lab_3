import java.util.Scanner;

public class zad1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj imie: ");
        String imie = input.next();

        System.out.print("Podaj nazwisko: ");
        String nazwisko = input.next();

        System.out.print("Podaj wiek: ");
        int wiek = input.nextInt();

        System.out.print("Podaj numer indeksu: ");
        int nrIndeksu = input.nextInt();

        input.close();
        
        System.out.print(
        "\nTwoje dane:" + 
        "\nImię - " + imie + 
        "\nNazwisko - " + nazwisko + 
        "\nWiek - " + wiek + 
        "\nNumer indeksu - " + nrIndeksu
        );
    }
}
