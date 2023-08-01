package exam05;

public class Ex03 {

    public static void main(String[] args) {
        FruitBasket<Object> basket = new FruitBasket<>();
        basket.add(new Apple());
        basket.add(new Melon());
        basket.add(new Apple());

        Juicer.make2(basket); // Apple, Fruit, Object super Apple의 상위클래스<? super Fruit>
//        Juicer.make(basket); // Apple, Melon, Fruit <? extends Fruit>

    }
}
