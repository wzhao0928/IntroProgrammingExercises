package exercises.triangle;

import java.util.Scanner;

/**
 * Created by wbzhao on 15-4-10.
 * =============================
 * Draw a horizontal line
 *
 * Given a number n, print n asterisks on one line.
 * Example when n=8:
 * ********
 * =============================
 */
public class DrawAHorizontalLine {

    public static void main(String[] args) {
        int amount = 0;
        String output = "";
        System.out.print("Input the amount of asterisks: ");
        amount = Integer.parseInt(new Scanner(System.in).next());

        for (int i = 0; i < amount; i++) {
            output += "*";
        }
        System.out.println(output);
    }
}
