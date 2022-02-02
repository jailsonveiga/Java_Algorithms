package day_2_hackerrank;

public class Operators {
    public static void main(String[] args) {
        solve(12, 20, 8);
    }

    public static void solve(double meal_cost, int tip_percent,int tax_percent) {
        double tip = (double)meal_cost / 100 * tip_percent; //2.4

        double tax = (double)tax_percent / 100 * meal_cost; //

        double total_cost = meal_cost + tip + tax; // 1.6

        System.out.println(Math.round(total_cost));
    }
}
