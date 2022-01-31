package cw5klasy;

public class Marka extends Produkcja
{
    // POLA
    protected int premiaMarki;

    // KONSTRUKTORY
    public Marka() 
    {
        super();
        this.premiaMarki = 0;
    }

    public Marka(int premiaMarki) 
    {
        this.premiaMarki = premiaMarki;
    }

    public Marka(int kosztProdukcji, int premiaMarki) 
    {
        super(kosztProdukcji);
        this.premiaMarki = premiaMarki;
    }

    public Marka(String rodzaj, String nazwa, int koszt, int kosztProdukcji) 
    {
        super(rodzaj, nazwa, koszt, kosztProdukcji);
    }

    public Marka(String rodzaj, String nazwa, int koszt, int kosztProdukcji, int premiaMarki) 
    {
        super(rodzaj, nazwa, koszt, kosztProdukcji);
        this.premiaMarki = premiaMarki;
    }

    // NADPISANA METODA
    @Override
    public int wyliczKoszta() 
    {
        return super.wyliczKoszta() + premiaMarki;
    }

    // NADPISANY toString()
    @Override
    public String toString() 
    {
        return 
            "======================= Marka =======================" +
            "\nPremia za markę = " + premiaMarki +
            "\n" + super.toString();

    }

    // SETTERY I GETTERY
    public int getPremiaMarki()
    {
        return premiaMarki;
    }

    public int setPremiaMarki(int premiaMarki)
    {
        return this.premiaMarki = premiaMarki;
    }
    
}
