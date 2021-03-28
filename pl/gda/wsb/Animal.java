package pl.gda.wsb;

public class Animal {

    String name;
    String from;
    final String species;
    private double weight;


    public Animal(String name, String from, String species) {
        this.name = name;
        this.from = from;
        this.species= species;
        if (this.species=="pies"){
        this.weight = 10;
        }
        else if(this.species=="kot"){
            this.weight=6;
        }
        else if(this.species=="mysz"){
            this.weight=2;
        }
        else this.weight=1;
    }

    public double getWeight() {
        return weight;
    }

    void feed(){
        if(this.weight==0) {
            System.out.println("Za pozno! [*]");
        }
        else {
            this.weight++;
            System.out.println("Dzięki! Moja waga:" + this.weight);
        }
    }

    void takeForAWalk(){
        if(this.weight==0) {
            System.out.println("Za pozno! [*]");
        }
        else {
            this.weight--;
            System.out.println("Dzięki! Moja waga:" + this.weight);
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", from='" + from + '\'' +
                ", species='" + species + '\'' +
                ", weight=" + weight +
                '}';
    }
}
