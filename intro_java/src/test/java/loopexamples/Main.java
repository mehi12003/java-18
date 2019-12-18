package loopexamples;

public class Main {
    public static void main(String[] args) {
        int[] arrayInt = {10, 20, 30, 40, 50};

        int numar = 1501;
        inversareNumar(numar);

        String propozitie = "Ana are mere   ";
        char [] arrayCaractere = propozitie.toCharArray();
        int nrVocale = 0;
        for (char element : arrayCaractere ) {

            System.out.print(element);
            if (element == 'a' || element == 'e' || element == 'i' || element == 'o' || element == 'u') {
                nrVocale++;

            }

        }
        System.out.println("Nr vocale e :" + nrVocale);
    }

    private static void inversareNumar(int numar) {
        int numarInversat = 0;
        while (numar > 0) {
            numarInversat = numarInversat * 10 + numar % 10;
            numar = numar / 10;
        }

        System.out.println("Numarul inversat este: " + numarInversat);
    }

}

