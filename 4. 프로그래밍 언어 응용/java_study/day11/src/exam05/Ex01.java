package exam05;

public class Ex01 {
    public static void main(String[] args) {
        FruitBasket<Apple> appleBasket = new FruitBasket<>();
        appleBasket.add(new Apple());
        appleBasket.add(new Apple());
        appleBasket.add(new Apple());

        Juicer.make(appleBasket);

        FruitBasket<Melon> melonBasket = new FruitBasket<>();
        melonBasket.add(new Melon());
        melonBasket.add(new Melon());
        melonBasket.add(new Melon());

        Juicer.make(melonBasket);

        Juicer.make(melonBasket);

        Juicer.make3(appleBasket);
    }
}
