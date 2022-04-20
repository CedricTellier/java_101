public class Main {

    public static void main(String[] args) {
        Person myObj = new Person("Cédric");
        System.out.println(myObj.getName());
        Person lPerson = new Person();
        if (lPerson.getName() == null) {
            System.out.println("Age is null");
        } else {
            System.out.println(myObj.getName());
        }
    }
}