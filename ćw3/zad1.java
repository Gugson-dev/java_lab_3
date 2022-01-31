import cw3klasy.*;

public class zad1 
{
    public static void main(String[] args) 
    {
        /*  zad.1 - Najpierw należy uzupełnić kod w klasie Punkt.java,
            a) stworzyć objekt punktA typu Punkt,
            w konstruktorze zainicjować zmienną pX --> np. new Punkt(7), wykonać metodę punktA.toString();
            b) następnie ponownie wywopać konstruktor inicjalizujący wszystkie pola z klasy
            --> np. punkt = new Punkt(1, 2, 3);, wykonać metodę punktA.toString();
            c) nadpisać wartości pól z objektu punktA za pomocą setterów i
            ponownie wywołać metodę toString();
            d) wypisać wartości pól (za pomocą getterów),
            e) wywołać metody suma i róznica (obie wersje) z klasy punkt
        */

        // Podpunkt A
        Punkt punktA = new Punkt(7);
        System.out.println(punktA.toString());

        // Podpunkt B
        punktA = new Punkt(1, 2, 3);
        System.out.println(punktA.toString());

        // Podpunkt C
        punktA.setPX(4);
        punktA.setPY(5);
        punktA.setPZ(6);
        System.out.println(punktA.toString());

        // Podpunkt D
        System.out.println("\nWypisane getami:");
        System.out.println("pX = " + punktA.getPX());
        System.out.println("pY = " + punktA.getPY());
        System.out.println("pZ = " + punktA.getPZ());

        // Podpunkt E
        System.out.println("\nMetody:");
        System.out.println("suma() = " + punktA.suma());
        System.out.println("roznica() = " + punktA.roznica());
        System.out.println("roznica(x, y, z) = " + punktA.roznica(7, 8, 9));
    }
}
