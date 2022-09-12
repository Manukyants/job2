public class Main {
    public static void main(String[] args) {
        Car car = new Car("Porshe",4);
        Truck truck = new Truck("MAN", 6);
        Bicycle bicycle = new Bicycle("Zvezda", 1);


        ServiceStation station = new ServiceStation();
        station.check(car);
        station.check(bicycle);
        station.check(truck);
    }
}