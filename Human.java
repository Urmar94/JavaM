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
}
