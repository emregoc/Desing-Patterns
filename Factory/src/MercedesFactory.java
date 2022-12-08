class MercedesFactory implements AbstractFactory{

    @Override
    public Car createCar(String color, double price) {
        return new Mercedes(color, price);
    }

}