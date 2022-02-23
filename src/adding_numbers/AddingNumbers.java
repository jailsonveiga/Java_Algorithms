package adding_numbers;

public class AddingNumbers {
    public static void main(String[] args) {
        System.out.println(add("111", "111"));
        System.out.println(add("10", "80"));
        System.out.println(add("", "20"));
    }
    public static String add(String a, String b) {
        try{
            return Integer.toString(Integer.parseInt(a) + Integer.parseInt(b));
        }
        catch(Exception e) {
            return "Invalid Operation";
        }
    }
}
