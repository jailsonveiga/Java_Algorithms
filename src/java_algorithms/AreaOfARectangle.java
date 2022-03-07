package java_algorithms;

public class AreaOfARectangle {
    public static void main(String[] args) {
        System.out.println(areaOfARectangle(3, 4));
        System.out.println(areaOfARectangle(10, 11));
        System.out.println(areaOfARectangle(-1, 5));
        System.out.println(areaOfARectangle(0, 2));
    }
    public static int areaOfARectangle(int h, int w) {
        return h > 0 && w > 0 ? h * w : -1;
    }
}
