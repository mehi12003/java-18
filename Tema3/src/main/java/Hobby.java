import java.util.ArrayList;

public class Hobby {
    String hobbyname;
    int frecventa;
    ArrayList<Adresa> listaAdrese = new ArrayList<>();

    public Hobby(String hobbyname, int frecventa, ArrayList<Adresa> listaAdrese) {
        this.hobbyname = hobbyname;
        this.frecventa = frecventa;
        this.listaAdrese = listaAdrese;
    }

    public String toString() {
        String s = "Hobby Name: " + this.hobbyname + ", Frecventa: " + this.frecventa + ", ";
        for (int i = 0; i < listaAdrese.size(); i++) {
            s += listaAdrese.get(i).toString() + ", ";
        }
        return s;
    }


}


