class AudiFactory implements AbstractFactory{

    @Override
    public Car createCar(String color, double price) {
        return new Audi(color, price);
    }

}