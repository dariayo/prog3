import static java.lang.Math.*;
abstract class Person {
    protected String name;
    protected int health;
    protected int age;
    protected Places places;
    protected final Gender gender;
    protected Status status;


    public Person(String name, int health, int age, Gender gender, Status status) {
        this.name = name;
        this.health = health;
        this.age = age;
        this.gender = gender;
        this.status = status;
    }


    public String getName() {
        return name;
    }

    public String toString() {
        return "Персонаж " + name;
    }

    public Places getLocation(Places places) {
        return this.places=places;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object.getClass() != this.getClass()) {
            return false;
        }
        Person person = (Person) object;
        return name.equals(person.name) && super.equals(person);
    }

}
