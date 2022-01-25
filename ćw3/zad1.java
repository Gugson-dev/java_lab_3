import java.util.Scanner;

public class zad1 {

    public static void main(String[] args) {
        /* zad.1 napisać program który przyjmuje jedną liczbę od użytkownika z klawiatury
          i za pomocą switch case default ma określić czy:
          a) ta liczba jest parzysta --> podpowiedz switch(a % 2) {
          b) program który określi czy liczba jest podzielna przez 7
         */

         Scanner input = new Scanner(System.in);

         System.out.print("Podaj liczbe aby sprawdzić czy jest podzielna przez 2 i 7: ");
         int liczba = input.nextInt();
         
         input.close();
         String dziel = (liczba % 7 == 0) ? "\nLiczba " + liczba + " jest podzielna przez 7" : "\nLiczba " + liczba + " nie jest podzielna przez 7";

         switch (liczba % 2) {
             case 0:
                 System.out.printf("Liczba %d jest podzielna przez 2%s", liczba, dziel);
                 
                 break;
         
             default:
                 System.out.printf("Liczba %d nie jest podzielna przez 2%s", liczba, dziel);
                 break;
         }
    }
}
