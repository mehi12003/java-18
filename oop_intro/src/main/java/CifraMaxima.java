
public class CifraMaxima {


    public static void main(String [] args) {

       int nr = 6787;
       int maxim=0;

       while (nr>0) {
           int rest = nr%10;

           //calculam cifra maxima
           maxim = Math.max(rest, maxim);

           nr /= 10;
       }

        System.out.println("Cifra maxima din numar este: " + maxim);

    }
}
