import java.util.HashSet;

abstract class Person {
    protected String name;
    protected int health;
    protected int age;
    protected Places places;
    protected Gender gender;
    protected Status status;

    protected HashSet<String> knowledge;

    public Person(String name,int health,int age,Gender gender,Status status){
        this.name=name;
        this.health=health;
        this.age=age;
        this.gender=gender;
        this.status=status;
        this.knowledge = new HashSet<String>();
    }
    public String getName() {
        return name;
    }

    public String toString(){
        return "Персонаж " + this.getName();
    }
    public Places getLocation(Places places){
        return places;
    }
    public void toDie(){
        if (health == 0) {
            this.status=status.DEAD;
            System.out.println(name + " умер");
            this.name = "Dead " + this.getName();
        }
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
        return name.equals(person.name)&& super.equals(person);
    }

}