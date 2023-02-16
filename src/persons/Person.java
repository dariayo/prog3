package persons;

import enums.*;
import exceptions.*;

import java.util.Objects;

abstract class Person {
    protected String name;
    protected int health;
    protected int age;
    protected Places places;
    protected final Gender gender;
    public Status status;


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


    @Override
    public String toString() {
        return "Person{"
                + "Имя: '" + name + '\''
                + ", возраст: " + age
                + ", состояние: " + status
                + '}';

    }

    public Places getLocation(Places places) {
        return places;
    }

    public void setLocation(Places places) {
        this.places = places;
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
    
    @Override
    public int hashCode(){
        return Objects.hash(name,health,age,places,gender,status);
    }
    
    public void eat(Food food) throws IllegalFoodException, UnrealHealthException {
        if (food.calories >= 150 && food.calories <= 1000) {
            hthis.health += health / 2;
            this.caloriesEaten += food.calories;
            if (this.health > 100) {
                throw new UnrealHealthException("Здоровье не может быть больше 100");
            }
        } else if (food.calories > normOfCalories || this.caloriesEaten > normOfCalories) {
            this.health -= 10;
            if (this.health == 0) {
                this.toDie();
            }
            throw new IllegalFoodException("Нельзя столько есть");
        } else {
            this.health += health / 5;
            this.caloriesEaten += food.calories;
        }
    }
    
    public void toDie() {
        if (this.health == 0){
            class Die { // локальный класс
                final String die = "смерть";
                public void occured() {
                    System.out.println(die + " наступила у " + name);
                }
            }
            Die die = new Die();
            die.occured();
            this.status.setStatus(Status.DEAD);
        } else {
            System.out.println("Все в порядке");
        }
    }
    
    
}
