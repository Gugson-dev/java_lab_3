package cw5klasy;

public class Produkcja extends Samochod 
{
    // POLA
    protected int kosztProdukcji;

    // KONSTRUKTORY
    public Produkcja() 
    {
        super();
        this.kosztProdukcji = 0;
    }

    public Produkcja(int kosztProdukcji) 
    {
        this.kosztProdukcji = kosztProdukcji;
    }

    public Produkcja(String rodzaj, String nazwa, int koszt, int kosztProdukcji) 
    {
        super(rodzaj, nazwa, koszt);
        this.kosztProdukcji = kosztProdukcji;
    }

    // NADPISANA METODA
    @Override
    public int wyliczKoszta() 
    {
        return super.wyliczKoszta() + kosztProdukcji;
    }

    // NADPISANY toString()
    @Override
    public String toString() 
    {
        return 
            "===================== Produkcja =====================" +
            "\nKoszty produkcji = " + kosztProdukcji +
            "\n" + super.toString();

    }

    // SETTERY I GETTERY
    public int getKosztProdukcji()
    {
        return kosztProdukcji;
    }

    public int setKosztProdukcji(int kosztProdukcji)
    {
        return this.kosztProdukcji = kosztProdukcji;
    }

    
}
