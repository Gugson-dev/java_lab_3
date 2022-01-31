package cw3klasy;

public class Punkt 
{
    /* stworzyć zmienne prywatne pX, pY, pZ */

    /* stworzyć
        a) pusty konstruktor,
        b) konstruktor inicjalizujacy zmienną pX,
        c) konstruktor inicjalizujący wszystkie zmienne,
        d) stworzyć settery i gettery,
        e) getter do zmiennej pZ niech zwraca return pZ * 10;
        podpowiedz ALT + INSERT można wybrać generowanie automatyczne
        konstruktora, getterów, setterów, nadpisywanie metody toString() i inne ...
    */

    /* Stworzyć metody
        a) suma - sumująca wszystkie wartości w klasie
        b) różnica - metody przeciążone roznica(){} i roznica(int x, int y, int z){}
        c) metody różnica mają wykonwywać dzialania :
            roznica(){ return pX - pY - pZ} i roznica(int x, int y, int z){ return pX*x - pY*y - pZ*z }
        d) nadpisać metodę toString(), aby zwracała wszystkie wartości pól, analogicznie jak w przykładzie
    */

    // ZMIENNE/POLA
    private int pX, pZ, pY;

    // KONSTRUKTORY
    public Punkt(){}

    public Punkt(int pX)
    {
        this.pX = pX;
    }

    public Punkt(int pX, int pY, int pZ)
    {
        this.pX = pX;
        this.pY = pY;
        this.pZ = pZ;
    }

    // METODY
    public int suma()
    {
        return pX + pZ + pY;
    }

    public int roznica()
    {
        return pX - pY - pZ;
    }

    public int roznica(int x, int y, int z)
    {
        return pX*x - pY*y - pZ*z;
    }

    // NADPISANY toString()
    @Override
    public String toString() 
    {
        return 
            "Punkt{" +
            "pX = " + pX +
            ", pY = " + pY +
            ", pZ = " + pZ +
            '}';
    }

    // SETTERY I GETTERY
    public int getPX() 
    {
        return pX;
    }

    public void setPX(int pX) 
    {
        this.pX = pX;
    }

    public int getPZ() 
    {
        return pZ * 10;
    }

    public void setPZ(int pZ) 
    {
        this.pZ = pZ;
    }

    public int getPY() 
    {
        return pY;
    }

    public void setPY(int pY) 
    {
        this.pY = pY;
    }

}