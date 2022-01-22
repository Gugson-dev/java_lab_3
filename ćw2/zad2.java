public class zad2 {

    public static void main(String[] args) {
        /*
        *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
        *    mnożenia, dziealenia i modulo na zmiennych:
        *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
        *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
        */
        int liczbaA = 3, liczbaB = 7;
        double liczbaX = 3.5, liczbaY = 1.5;
        
        System.out.println("===============\n      INT\n===============");
        System.out.printf("Wynik dodawania %d i %d: " + (liczbaA + liczbaB) + "\n",liczbaA,liczbaB);
        System.out.printf("Wynik odejmowania %d i %d: " + (liczbaA - liczbaB) + "\n",liczbaA,liczbaB);
        System.out.printf("Wynik mnożenia %d i %d: " + (liczbaA * liczbaB) + "\n",liczbaA,liczbaB);
        System.out.printf("Wynik dzielenia %d i %d: " + (liczbaA / liczbaB) + "\n",liczbaA,liczbaB);
        System.out.printf("Wynik modulo %d i %d: " + (liczbaA % liczbaB) + "\n",liczbaA,liczbaB);
        System.out.println("===============\n    DOUBLE\n===============");
        System.out.printf("Wynik dodawania %.2f i %.2f: " + (liczbaX + liczbaY) + "\n",liczbaX,liczbaY);
        System.out.printf("Wynik odejmowania %.2f i %.2f: " + (liczbaX - liczbaY) + "\n",liczbaX,liczbaY);
        System.out.printf("Wynik mnożenia %.2f i %.2f: " + (liczbaX * liczbaY) + "\n",liczbaX,liczbaY);
        System.out.printf("Wynik dzielenia %.2f i %.2f: " + (liczbaX / liczbaY) + "\n",liczbaX,liczbaY);
        System.out.printf("Wynik modulo %.2f i %.2f: " + (liczbaX % liczbaY) + "\n",liczbaX,liczbaY);
        System.out.print("===============");
    }
}