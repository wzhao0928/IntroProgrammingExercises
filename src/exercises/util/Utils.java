package exercises.util;

import java.util.Scanner;

/**
 * Created by wbzhao on 15-4-10.
 */
public class Utils {

    public static int getInputInt() {
        System.out.print("Input a integer number: ");
        return Integer.parseInt(new Scanner(System.in).next());
    }

    public static String composeDiamondLine(int line, int amount) {
        int column;
        String result = "";
        for (column = 0; column < amount - line - 1; column++) {
            result += " ";
        }
        int lineLength = column + line * 2;
        for (; column <= lineLength; column++) {
            result += "*";
        }
        result += "\r\n";
        return result;
    }
}
