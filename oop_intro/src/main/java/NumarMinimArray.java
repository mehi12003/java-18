public class NumarMinimArray {

    public static void main (String[] args) {

        int sir[] = {3, 5, 1, 9};
        int min = sir[0];
        for(int i = 0; i<sir.length; i++) {
            if(sir[i]<min) {
                min=sir[i];
            }
        }
        System.out.println("Numarul minim din sir este: " + min);
    }
}
