import java.util.Scanner;

public class zad3 {

    public static void main(String[] args) {
        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */
        Scanner input = new Scanner(System.in);
        
        System.out.print("Podaj liczbe z przecinkiem: ");
        double liczba = input.nextDouble();
        input.close();
        
        double polowa = liczba % 2;
        long sprawdzenie = Math.round(liczba);


        if (polowa == 0.5) {
            System.out.println("\nTwoja liczba po zaokrągleniu jest taka sama jak oryginał");
            System.out.printf("PRZED: %.1f\nPO: %.1f", liczba, sprawdzenie - polowa); 
        }
        else if (sprawdzenie > liczba) {
            System.out.println("\nTwoja liczba po zaokrągleniu jest większa od oryginału");
            System.out.printf("PRZED: %.1f\nPO: %d", liczba, sprawdzenie);            
        } 
        else {
            System.out.println("\nTwoja liczba po zaokrągleniu jest mniejsza od oryginału");
            System.out.printf("PRZED: %.1f\nPO: %d", liczba, sprawdzenie); 
        }
    }   
}
