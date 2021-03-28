import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Kot","polska","pies");
        Animal animal2 = new Animal("Pies","polska","kanarek");

        Car car1 = new Car("ccc",Marka.Kia,1999,5);

        Human human1= new Human("Anna", "Kowalska","Nikt",55,animal1,car1);
        Human human2= new Human("Jan", "Kowal","Nikt",22, animal2);
        Human human3= new Human("Jan", "Kowal","Nikt",22, animal2);


        Phon phon1 = new Phon("12312312","anna","Kowalska");
        Phon phon2 = new Phon("23121312","Jan","Kowal");



        System.out.println(phon1);
        System.out.println(phon2);
        System.out.println(human1);
        System.out.println(human2);
        System.out.println(animal1);
        System.out.println(animal2);

        if (animal1.getWeight()> animal2.getWeight())
            System.out.println("cieższy jest"+ animal1.name + ". Jego waga:" + animal1.getWeight());
        else System.out.println("cieższy jest"+ animal2.name + ". Jego waga:" + animal2.getWeight());

        animal1.takeForAWalk();
        animal1.feed();
        animal2.takeForAWalk();
        animal2.takeForAWalk();

        ArrayList<Human> humansList= new ArrayList<>();
        humansList.add(human1);
        humansList.add(human2);
        for (Human human : humansList){
            System.out.println(human.lastName );

        }

        System.out.println("\n_________________________________\n");
        System.out.println("wynik porównania  "+ human2.equals(human3));
    }
}
