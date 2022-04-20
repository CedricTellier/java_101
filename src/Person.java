

final class Person {
    final private String x; // Create a class attribute

    // Create a class constructor for the Main class
    public Person(String name) {
        this.x = name; // Set the initial value for the class attribute x
    }

    public Person() {
        this.x = null; // Set the initial value for the class attribute x
    }

    public String getName() {
        return this.x;
    }

    // public void SetName(String name) {
    // this.x = name;
    // }
}
