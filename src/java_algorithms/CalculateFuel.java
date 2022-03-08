package java_algorithms;

public class CalculateFuel {
    public static void main(String[] args) {
        System.out.println(calculateFuel(15));
        System.out.println(calculateFuel(23.5));
        System.out.println(calculateFuel(3));
    }
    public static double calculateFuel(double n) {
        return Math.max(100, n*10);
    }
}
