package exercises.diamond;

import exercises.util.Utils;

/**
 * Created by wbzhao on 15-4-10.
 * =============================
 * Diamond with Name
 *
 * Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
 *
 *  *
 * ***
 * Bill
 * ***
 *  *
 * =============================
 */
public class DiamondWithName {

    public static void main(String[] args) {
        int amount = Utils.getInputInt();
        String output = "";
        String name = "Wenbo";
        int line;
        for (line = 0; line < amount - 1; line++) {
            output += Utils.composeDiamondLine(line, amount);
        }
        output += name + "\r\n";
        for (; line > 0; line--) {
            output += Utils.composeDiamondLine(line - 1, amount);
        }
        System.out.print(output);
    }
}
