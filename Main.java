public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Kot","polska",123);
        Animal animal2 = new Animal("Pies","polska",12222);

        Human human1= new Human("Anna", "Kowalska","Nikt",55);
        Human human2= new Human("Jan", "Kowal","Nikt",22);

        Phon phon1 = new Phon("12312312","anna","Kowalska");
        Phon phon2 = new Phon("23121312","Jan","Kowal");

        System.out.println(phon1);
        System.out.println(phon2);
        System.out.println(human1);
        System.out.println(human2);
        System.out.println(animal1);
        System.out.println(animal2);
        
    }
}
