import java.util.ArrayList;
import java.util.List;
import cw5klasy.*;

public class zad1 
{
   public static void main(String[] args) 
   {
      /* ćw 5 Dziedziczenie */

      /* zad.1 Proszę wybrać dowolny temat budowania struktur klas np. samochody, dom, biblioteka, nauka, zabawki, kosmetyki, biuro podróży ... .
               Będziemy budować podobną strukturę kodu jak w przykładzie 5,
         a) Proszę stworzyć układ klas dziedziczących po sobie,
         b) proszę użyć pól i metod protected jak i private,
         c) proszę stworzyć konstruktory, metody: toString(), settery i gettery,
         d) proszę używać super do wywołania konstruktorów i metod z klas nadrzędnych
         (można wygenerować je --> prawy przycisk myszki --> generate --> settery, gettery, ...),
         e) w klasie Main proszę stworzyć objekty podobnie jak w przykładzie 5,
         oraz stworzyć listę typu najbardziej generycznego np. List<Budynek>,
         f) wyświetlić dane
      */

      // OBJEKTY
      Samochod samochod = new Samochod("Osobowy", "Golf 4", 1250);
      Produkcja produkcja = new Produkcja("Osobowy", "Golf 4", 1250, 2000);
      Marka VW = new Marka("Osobowy", "Golf 4", 1250, 2000, 750);
      Marka bezpremiiVW = new Marka("Osobowy", "Golf 4", 1250, 2000);

      // LISTA
      List<Samochod> samochodLista = new ArrayList<>();
      samochodLista.add(samochod);
      samochodLista.add(produkcja);
      samochodLista.add(VW);
      samochodLista.add(bezpremiiVW);

      // WYPISZ DANE 
      for (Samochod s : samochodLista) 
      {
         System.out.println(s.toString());
         System.out.println("=====================================================");
         System.out.println("Całkowite koszta: " + s.wyliczKoszta() + "\n\n");
      }
   }
}
