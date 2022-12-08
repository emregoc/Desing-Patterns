public abstract class Burger implements Item{ // abstract class olunca implement edip ,
                                                // gövdeyi olusturmasak bile hata vermiyor

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();

}
