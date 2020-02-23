import java.util.Objects;
import java.util.TreeSet;

public class Persoana {

    public String nume;
    public int varsta;

    public Persoana(String n, int a) {
        this.nume = n;
        this.varsta = a;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String toString() {
        return "Name: " + this.nume + "-- Age: " + this.varsta;
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Persoana persoana = (Persoana) o;
        return Objects.equals(nume, persoana.nume) &&
                Objects.equals(varsta, persoana.varsta);

    }
}