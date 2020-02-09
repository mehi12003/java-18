package composition;

public class Masina {

    private int putere;
    private double capacitate;

    public Motor() {
        this.capacitate = 0.8;
        this.putere = 75;
    }

    public void setPutere(int putere) {
        if (putere < 75) {
            System.out.println("Nu puteti introd o val < 75");
        } else {
        this.putere = putere;
    }

    public double getCapacitate() {
        return capacitate;
    }

    public void setCapacitate(double capacitate) {
        if (capacitate < 0,8) {
            System.out.println("Nu puteti introduce o val mai mica decat 0,8 ptr capacitate ")
        } else {
            this.capacitate = capacitate;
        }
    }
}

