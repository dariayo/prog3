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
    
    public String eat(Item food) throws IllegalFoodException, UnrealHealthException {
        if (health < 50) {
            health = health + 10;
            return name + " съел " + food.getTitle();
        } else if (this.health < 0) {
            throw new UnrealHealthException("Здоровье ниже нуля!");
        } else if (food == Item.TABLE || food == Item.CASE || food == Item.TRASH) {
            throw new IllegalFoodException("Человек не может есть несъедобные предметы");
        }
        return "Я не голодный";
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
    
    public static class Guarantee {
        private String guarantee = "гарантия";

        public void give() {
            System.out.println("дать " + guarantee);
        }

        public void notGive() {
            System.out.println("нельзя дать " + guarantee);
        }
    }

    public void giveGuarantee(int period) {
        Guarantee guarantee = new Guarantee();
        if (period < 1) {
            guarantee.give();
        } else {
            guarantee.notGive();
        }
    }
}
