public class Car {

    final String model;
    final Marka marka;
    final Integer rok;
    Integer iloscMiejsc;


    public Car(String model, Marka marka, Integer rok, Integer iloscMiejsc) {
        this.model = model;
        this.marka = marka;
        this.rok = rok;
        this.iloscMiejsc = iloscMiejsc;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", marka=" + marka +
                ", rok=" + rok +
                ", iloscMiejsc=" + iloscMiejsc +
                '}';
    }
}