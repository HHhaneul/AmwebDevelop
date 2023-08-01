package exam03;

public class Box {
    private Object item;
    public void put(Object item){
        this.item = item;
    }
    public Object get(){
        return item;
    }
}
