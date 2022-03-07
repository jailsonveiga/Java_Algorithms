package java_algorithms;

public class ReturnNegative {
    public static void main(String[] args) {
        System.out.println(returnNegative(4));
        System.out.println(returnNegative(5));
        System.out.println(returnNegative(-54));
        System.out.println(returnNegative(0));
    }
    public static int returnNegative(int n) {
        return -Math.abs(n);
    }
}
