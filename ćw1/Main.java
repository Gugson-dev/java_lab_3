import java.util.Date;

public class Main {

    public static void main(String[] args) {
        System.out.println("Witam, dzięki tej możliwości kończąc ten tekst, kolejny wyświetli się w kolejnym wierszu");
        System.out.print("Jak widać ten tekst jest wiersz niżej, inny sposób na przejście do kolejnego wiersza to\n");
        System.out.printf("Dzięki tej %s możliwości %s formatować tekst i wstawiać nie %d, a wiele różnych zmiennych\n","ostatniej","możemy", 1);
        System.out.print("Aczkolwiek wszystkie zmienne oznaczają co innego: \n%s - zmienna tekstowa (string)\n%d - zmienna liczbowa (decimal integer)\nSą jeszcze inne jak np.:\n");
        System.out.print("%f");
        System.out.printf(" - liczba zmienno przecinkowa (floating-point number) np. %f\n", 12.5);
        Date date = new Date();
        System.out.print("%t");
        System.out.printf(" - wartości daty/czasu (date/time values) np. %tT %1$td.%1$tm.%1$tY"+"r.", date);
//        ćw.1 napisać po kilka przykładów wypisywania tekstu w konsoli,
//        Użyć każdej z opcji

    }
}
