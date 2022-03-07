package java_algorithms;

public class MultipleOf100 {
    public static void main(String[] args) {
        System.out.println( multipleOf100(1));
        System.out.println( multipleOf100(1000));
        System.out.println( multipleOf100(100));
    }
    public static boolean multipleOf100(int num) {
        return num % 100 == 0;
    }
}
