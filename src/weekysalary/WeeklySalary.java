package weekysalary;

public class WeeklySalary {
    public static void main(String[] args) {
        System.out.println(WeeklySalary(new int[]{8,8,8,8,8,0,0}));
        System.out.println(WeeklySalary(new int[]{10, 10, 10, 0, 8, 0, 0}));
        System.out.println(WeeklySalary(new int[]{0,0,0,0,0,12,0}));
    }

        public static int WeeklySalary ( int[] hours){
            int resultTotal = 0, result = 0;
            for (int i = 0; i < hours.length; i++) {
                if (hours[i] > 8) {
                    result = 80 + ((hours[i] - 8) * 15);
                } else {
                    result = 10 * hours[i];
                }
                if (i >= 5) {
                    result *= 2;
                }
                resultTotal += result;
            }

            return resultTotal;
        }
    }

