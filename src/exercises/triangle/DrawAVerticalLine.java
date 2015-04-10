package exercises.triangle;

import exercises.util.Utils;

/**
 * Created by wbzhao on 15-4-10.
 * =============================
 * Draw a vertical line

 * Given a number n, print n lines, each with one asterisks
 * Example when n=3:
 * *
 * *
 * *
 * =============================
 */
public class DrawAVerticalLine {

    public static void main(String[] args) {
        int amount = 0;
        String output = "";
        amount = Utils.getInputInt();

        for (int i = 0; i < amount; i++) {
            output += "*\r\n";
        }
        System.out.print(output);
    }
}
