package test;

public class Ex05 {
    public static void main(String[] args){
        for (int i = 2; i<10; i++){
            System.out.printf("-------------%d단-------------%n", i);
            for (int j = 1; j < 10; ++j){
                if (i <= j) {
                    System.out.printf("%d X %d = %d%n", i, j, i*j);
                }
            }
        }
    }
}
