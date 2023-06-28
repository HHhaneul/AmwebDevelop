package exam02;

public class Ex10 {
    public static void main(String[] args){
        int total = 0;
        for (int i = 1; i < 101; i++){
            if (i%2 == 0){
                continue;
            }
            total += i;

            /**
            if (i % 2 == 1){
                total += i;
            }
             */
        }
        System.out.println(total);
    }
}
