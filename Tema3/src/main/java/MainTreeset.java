
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

    public class MainTreeset {

        public static void main(String[] args) {
            TreeSet<Persoana> numeComp = new TreeSet<Persoana>(new NumeComparator());
            numeComp.add(new Persoana("Marius", 31));
            numeComp.add(new Persoana("Dan", 33));
            numeComp.add(new Persoana("Marius", 31));
            numeComp.add(new Persoana("Lucian", 24));
            for (Persoana e : numeComp) {
                System.out.println(e);
            }
            System.out.println("===========================");

            TreeSet<Persoana> varstaComp = new TreeSet<Persoana>(new VarstaComparator());
            varstaComp.add(new Persoana("Marius", 31));
            varstaComp.add(new Persoana("Dan", 33));
            varstaComp.add(new Persoana("Cristian", 26));
            varstaComp.add(new Persoana("Lucian", 24));
            for (Persoana f : varstaComp) {
                System.out.println(f);

            }

            ArrayList<Adresa> lista1adrese = new ArrayList<>();
            lista1adrese.add(new Adresa("Cluj"));
            lista1adrese.add(new Adresa("Bucuresti"));
            lista1adrese.add(new Adresa("Brasov"));

            ArrayList<Adresa> lista2adrese = new ArrayList<>();
            lista2adrese.add(new Adresa("Iasi"));
            lista2adrese.add(new Adresa("Oradea"));
            lista2adrese.add(new Adresa("Arad"));

            ArrayList<Hobby> list1 = new ArrayList<Hobby>();
            list1.add(new Hobby("Cycling", 2, lista1adrese));
            list1.add(new Hobby("Singing", 3, lista2adrese));
            list1.add(new Hobby("Dancing", 1, lista1adrese));

            ArrayList<Hobby> list2 = new ArrayList<Hobby>();
            list2.add(new Hobby("cooking", 1, lista2adrese));
            list2.add(new Hobby("skating", 2, lista2adrese));
            list2.add(new Hobby("swimming", 2, lista1adrese));

            System.out.println("===========================");

            HashMap<Persoana, ArrayList<Hobby>> hashmap = new HashMap<Persoana, ArrayList<Hobby>>();
            hashmap.put(new Persoana("Marius", 31), list1);
            hashmap.put(new Persoana("Cosmin", 30), list2);
            hashmap.put(new Persoana("Lucian", 31), list1);

            for (Persoana p : hashmap.keySet()) {
                System.out.println(p.toString());
                for(int i=0; i< hashmap.get(p).size(); i++) {
                    System.out.println(hashmap.get(p).get(i).toString());
                }

            }
        }
    }

