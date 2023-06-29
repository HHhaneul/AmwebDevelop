package exam07;

public class Order implements Buyer, Seller{
    @Override
    public void buy() {
        System.out.println("구매하다.");
    }

    @Override
    public void order() {
        //Buyer.super.order(); -> System.out.println("Buyer - 주문하다!")
        //Seller.super.order(); -> System.out.println("Seller - 주문하다!")
        System.out.println("Order - 주문하다!");
    // 하위 클래스가 Buyer의 order()를 호출할지 Seller의 order()를 호출할지 정한다.
    }

    @Override
    public void sell() {
        System.out.println("판매하다.");
    }
}
