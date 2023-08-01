package exam05;

public class Ex02 {
    public static void main(String[] args) {
        FruitBasket<Fruit> fruitBasket = new FruitBasket<>();
        fruitBasket.add(new Melon());
        fruitBasket.add(new Apple());
        fruitBasket.add(new Melon());

        Juicer.make(fruitBasket);
    }
}
