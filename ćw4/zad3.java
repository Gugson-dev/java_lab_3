import java.util.ArrayList;
import cw4klasy.*;

public class zad3 
{
    public static void main(String[] args) 
    {
        /* zad.3
            a) W klasie Main stworzyć 5 różnych studentów, (można za pomocą tego samego objektu)
            b) dodać studentów do Listy ArrayList,
            c) przeiterować listę za pomocą pętli forEach wywołując na każdym objekcie metodę toString() (w każdej iteracji);
        */

        // ZMIENNA POMOCNICZA
        int licz = 1;

        // LISTA STUDENTÓW
        ArrayList<Object> studentList = new ArrayList<Object>();

        // STUDENT 1
        Osoba osoba = new Osoba("Daniel", "Szypniewski", 61538);
        Student student = new Student(osoba, WydzialEnum.GDANSK);
        studentList.add(student);

        // STUDENT 2
        osoba = new Osoba("Martin", "Stepien", 85564);
        student = new Student(osoba, WydzialEnum.GDYNIA);
        studentList.add(student);

        // STUDENT 3
        osoba = new Osoba("Aleksander", "Nowak", 53519);
        student = new Student(osoba, WydzialEnum.POZNAN);
        studentList.add(student);

        // STUDENT 4
        osoba = new Osoba("Nikola", "Kaczmarczyk", 35857);
        student = new Student(osoba, WydzialEnum.WARSZAWA);
        studentList.add(student);

        // STUDENT 5
        osoba = new Osoba("Paulina", "Krajewska", 91990);
        student = new Student(osoba, WydzialEnum.KRAKOW);
        studentList.add(student);

        // WYPISANIE STUDENTÓW
        for (Object o : studentList) 
        {
            System.out.printf("============= Student %d =============\n", licz);
            System.out.println(o.toString());
            licz++;
        }
        System.out.print("=====================================");
    }
}
