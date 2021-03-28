package pl.gda.wsb.devices;

public class Phon {

    String number;
    String name;
    String lastName;

    public Phon(String number, String name, String lastName) {
        this.number = number;
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Phon{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
