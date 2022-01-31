package cw4klasy;

public class Student 
{
    /* zad.2
        a) Stworzyć klasę Student z polami prywatnymi
        - Osoba osoba,
        - WydzialEnum wydzial;
        c) stworzyc konstruktory, gettery i settery
        d) nadpisać metodę toString aby zwracała wszystkie elementy ładnie przedstawione :)
    */

    // POLA PRYWATNE
    private Osoba osoba;
    private WydzialEnum wydzial;

    // KONSTRUKTORY
    public Student(Osoba osoba)
    {
        this.osoba = osoba;
    }

    public Student(WydzialEnum wydzial)
    {
        this.wydzial = wydzial;
    }

    public Student(Osoba osoba, WydzialEnum wydzial)
    {
        this.osoba = osoba;
        this.wydzial = wydzial;
    }

    public Student(WydzialEnum wydzial, Osoba osoba)
    {
        this.osoba = osoba;
        this.wydzial = wydzial;
    }

    // NADPISANIE toString()
    @Override
    public String toString()
    {
        return 
        "Informacje o studencie: " +
        osoba.toString() +
        "\nWydział: " + wydzial;
    }

    // GETTER I SETTERY
    public Osoba getOsoba() 
    {
        return osoba;
    }

    public void setOsoba(Osoba osoba) 
    {
        this.osoba = osoba;
    }

    public WydzialEnum getWydzial() 
    {
        return wydzial;
    }

    public void setWydzial(WydzialEnum wydzial) 
    {
        this.wydzial = wydzial;
    }

}
