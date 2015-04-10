package exercises.diamond;

import exercises.util.Utils;

/**
 * Created by wbzhao on 15-4-10.
 * =============================
 * Diamond
 *
 * Given a number n, print a centered diamond. Example for n=3:
 *   *
 *  ***
 * *****
 *  ***
 *   *
 * =============================
 */
public class Diamond {

    public static void main(String[] args) {
        int amount = Utils.getInputInt();
        String output = "";

        int line;
        for (line = 0; line < amount; line++) {
            output += Utils.composeDiamondLine(line, amount);
        }
        for (; --line > 0;) {
            output += Utils.composeDiamondLine(line - 1, amount);
        }
        System.out.print(output);
    }
}
