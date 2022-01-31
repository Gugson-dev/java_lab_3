package cw2klasy;

public class Student 
{
    // POLA
    private String poleS, poleS2;
    private int poleI;
    private boolean poleB;

    // KONSTRUKTOR
    public Student(String poleS, String poleS2, int poleI, boolean poleB)
    {
        this.poleS = poleS;
        this.poleS2 = poleS2;
        this.poleI = poleI;
        this.poleB = poleB;
    }
    
    //GETTER/SETTERY
    public String getPoleS() 
    {
        return poleS;
    }

    public void setPoleS(String poleS) 
    {
        this.poleS = poleS;
    }

    public String getPoleS2() {

        return poleS2;
    }

    public void setPoleS2(String poleS2) 
    {
        this.poleS2 = poleS2;
    }

    public int getPoleI() 
    {
        return poleI;
    }

    public void setPoleI(int poleI) 
    {
        this.poleI = poleI;
    }

    public boolean isPoleB() 
    {
        return poleB;
    }

    public void setPoleB(boolean poleB) 
    {
        this.poleB = poleB;
    }
}
