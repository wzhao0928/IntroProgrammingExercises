package exercises.triangle;

import exercises.util.Utils;

/**
 * Created by wbzhao on 15-4-10.
 * =============================
 * Given a number n, print n lines, each with one more asterisk than the last (i.e. one on the first line, two on the second,etc.)
 * Example when n=3:
 * *
 * **
 * ***
 * =============================
 */
public class DrawARightTriangle {

    public static void main(String[] args) {
        int amount = 0;
        String output = "";
        amount = Utils.getInputInt();

        for (int line = 0; line < amount; line++) {
            for (int column = 0; column <= line; column++) {
                output += "*";
            }
            output += "\r\n";
        }
        System.out.print(output);
    }
}
