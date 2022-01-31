package cw4klasy;

public class Osoba 
{
    /* zad.1
        a) Stworzyć klasę Osoba z polami prywatnymi:
        - imie (String),
        - nazwisko (String),
        - indeks (Integer)
        b) stworzyc konstruktory, gettery i settery
        c) napisać metodę w klasie Osoba która zwróci informację o osobie,
    */

    // POLA PRYWATNE
    private String imie, nazwisko;
    private int indeks;
    
    // KONSTRUKTOR
    public Osoba(String imie, String nazwisko, int indeks)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.indeks = indeks;
    }

    // NADPISANY toString() JAKO METODA ZWRACAJĄCA INFORMACJE
    @Override
    public String toString()
    {
        return 
        "\nImie: " + imie + 
        "\nNazwisko: " + nazwisko + 
        "\nIndeks: " + indeks;
    }
    


    public String getImie() 
    {
        return imie;
    }

    public void setImie(String imie) 
    {
        this.imie = imie;
    }

    public String getNazwisko() 
    {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) 
    {
        this.nazwisko = nazwisko;
    }

    public int getIndeks() 
    {
        return indeks;
    }

    public void setIndeks(int indeks) 
    {
        this.indeks = indeks;
    }

}
