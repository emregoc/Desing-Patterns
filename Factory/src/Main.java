public class Main {
    public static void main(String[] args) {

        // abstract factory pattern kullanildi. Cunku duz factoy patternda surekli if else yazmak gerekebilir

        AbstractFactory audiFactory = new AudiFactory();
        Car audiCar = audiFactory.createCar("Beyaz", 500000);

        AbstractFactory mercedesFactory = new MercedesFactory();
        Car mercedesCar  = mercedesFactory.createCar("Siyah", 420000);

        System.out.println(audiCar.getColor() + " " + audiCar.getPrice());
        System.out.println(mercedesCar.getColor() + " " + mercedesCar.getPrice());


    }
}