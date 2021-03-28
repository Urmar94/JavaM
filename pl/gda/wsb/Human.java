package pl.gda.wsb;

import pl.gda.wsb.devices.Car;
import java.util.Objects;

public class Human {

    String firstName;
    String lastName;
    String position;
    Integer age;
    Animal pet;
    Car car;

    public Human(String firstName, String lastName, String position, Integer age, Animal pet, Car car) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.age = age;
        this.pet = pet;
        this.car = car;
    }
    public Human(String firstName, String lastName, String position, Integer age, Animal pet) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.age = age;
        this.pet = pet;
        this.car = null;
    }

    public Human(String anna, String kowalska, String nikt, int age, Animal animal1, Car car1) {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(firstName, human.firstName) && Objects.equals(lastName, human.lastName) && Objects.equals(position, human.position) && Objects.equals(age, human.age) && Objects.equals(pet, human.pet) && Objects.equals(car, human.car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, position, age, pet, car);
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", age=" + age +
                ", pet=" + pet +
                ", car=" + car +
                '}';
    }
}
