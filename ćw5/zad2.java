import java.util.Scanner;

public class zad2 {

    public static void main(String[] args) {
        /* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj prosze swój numer indeksu: ");
        int indeks = input.nextInt();
        input.close();

        String sprawdz = (indeks % 2 == 0) ? "parzysty" : "nieparzysty";
        System.out.println("Twój indeks jest " + sprawdz);
    }
}
