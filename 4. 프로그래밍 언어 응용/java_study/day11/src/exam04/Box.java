package exam04;

public class Box<T extends Fruit> { // T -> Type // Apple, Fruit
    private T item;

/**
      private T[] nums = new T[3];
      private static T item2;
      Type 은 객체 생성 시 결정이 되기 때문에 정적인 메모리는 사용이 불가하며
      배열도 마찬가지로 명확한 자료형을 알아야하기 때문에 static 과 new 연산자는 사용이 불가하다.
*/

    public void put(T item){
        this.item = item;
    }
    public T get(){
        return item;
    }
    public void printInfo(){
        String itemNm = item.get(); // Object // Fruit apple = new Apple();
        System.out.println(itemNm);
    }
}
