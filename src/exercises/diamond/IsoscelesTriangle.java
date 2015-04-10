package exercises.diamond;

import exercises.util.Utils;

/**
 * Created by wbzhao on 15-4-10.
 * =============================
 * Isosceles Triangle

 * Given a number n, print a centered triangle. Example for n=3:
 *   *
 *  ***
 * *****
 * =============================
 */
public class IsoscelesTriangle {

    public static void main(String[] args) {
        int amount = 0;
        String output = "";
        amount = Utils.getInputInt();
        for (int line = 0; line < amount; line++) {
            output += Utils.composeDiamondLine(line, amount);
        }
        System.out.print(output);
    }
}
