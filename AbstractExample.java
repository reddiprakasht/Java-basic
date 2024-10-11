abstract class Car {
    abstract public void fuelType();
    public void color() {
        System.out.println("black color");
    }
}

class Tata extends Car {
    public void fuelType() {
        System.out.println("Diesel");
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        Tata nexon = new Tata();
        nexon.fuelType();
        nexon.color();
    }
}
