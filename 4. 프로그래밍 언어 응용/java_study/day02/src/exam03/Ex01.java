package exam03;

public class Ex01 {
    public static void main(String[] args){
        int[] students = new int[100];
        for (int i = 0; i < 100; i++){
            students[i] = i + 1000;
        }
        System.out.println(students[0]);

        /**
        int student1 = 1000;
        int student2 = 1001;
        int student3 = 1002;
        ...
        int student100 = 1099;
         */
    }
}
