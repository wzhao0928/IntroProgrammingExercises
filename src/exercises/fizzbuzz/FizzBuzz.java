package exercises.fizzbuzz;

/**
 * Created by wbzhao on 15-4-11.
 * =============================
 * FizzBuzz Exercise
 *
 * FizzBuzz is a simple number game where you count, but say "Fizz" and/or "Buzz" instead of numbers adhering to certain rules.
 *
 * Create a FizzBuzz() method that prints out the numbers 1 through 100.
 * Instead of numbers divisible by three print "Fizz".
 * Instead of numbers divisible by five print "Buzz".
 * Instead of numbers divisible by three and five print "FizzBuzz".
 * =============================
 */
public class FizzBuzz {

    private static void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzBuzzANumber(i));
        }
    }

    private static String fizzBuzzANumber(int i) {
        String result = "";
        if (i % 3 == 0) {
            result += "Fizz";
        }
        if (i % 5 == 0) {
            result += "Buzz";
        }
        if (result.equals("")) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        fizzBuzz();
    }
}
