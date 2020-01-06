public class Suma100 {

    public static void main(String[] args) {

        int suma;
        int i;

           suma = 0;

            for (i = 1; i <= 100; i++) {
                suma += i;
            }
            System.out.println("Suma primelor 100 de numere naturale este: " + suma);
    }
}