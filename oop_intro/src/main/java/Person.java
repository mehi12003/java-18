public class Person {
    public static final double PI = 3.14;
    String name; //atributes or instance variable
    int age;

    // constructor implicit
    public Person() {
        this.age = 0;
        System.out.println("Constructorul implicit a fost apelat");
        this.name = "no name";
    }

    // constructor explicit
    public Person(String name) {

        System.out.println("Constructorul explicit cu 1 parametru a fost apelat");
        this.name = name;

    }
}