import java.util.Comparator;

public class VarstaComparator implements Comparator<Persoana> {


    public int compare(Persoana p1, Persoana p2) {

             if(p1.getVarsta() > p2.getVarsta()){
                return 1;
            } else {
                return -1;
            }
        }

}
