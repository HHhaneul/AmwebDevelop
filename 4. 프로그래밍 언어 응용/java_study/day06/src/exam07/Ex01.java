package exam07;

public class Ex01 {
    public static void main(String[] args){
        Order order = new Order();

        order.buy();
        order.sell();

        Buyer buyer = new Order();
        buyer.buy();

        Seller seller = new Order();
        seller.sell();

        order.order();


        if (buyer instanceof Order){
            buyer.buy();
            ((Order) buyer).sell();
        }
    }
}
