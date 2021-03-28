package pl.gda.wsb;

import pl.gda.wsb.devices.Car;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Human {

    String firstName;
    String lastName;
    String position;
    Integer age;
    Animal pet;
    Car car;
    SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
    Date date = new Date(System.currentTimeMillis());
    private Double salary;

    public Human(String firstName, String lastName, String position, Integer age, Animal pet, Car car, Double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.age = age;
        this.pet = pet;
        this.car = car;
        this.salary=salary;
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

    public Double getSalary() {
        System.out.println( date +"Pobrano dane o wypałcie  " + this.firstName + " " + this.lastName);
        return salary;
    }

    public void setSalary(Double salary) {

        if(salary>0){
            System.out.println("Dane zostały wysłane do systemu księgowego!");
            System.out.println("Czeka na Ciebie nowy aneks do podpisania!");
            System.out.println("Nowe dane zostały wysłane i dostarczone do ZUS i US!");
            this.salary = salary;
        }
        else System.out.println("Wypłata nie może być ujemna!");
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
