/**
 * Created by Zolee on 2016. 09. 23..
 */
public class Multi_Tap_Keypad {

    public static int presses(String phrase) {
      //  phrase = phrase.toLowerCase();
        char[] letter = phrase.toCharArray();
        int sum = 0;

        sum = logic(phrase, letter, sum);

        return sum;
    }

    private static int logic(String phrase, char[] letter, int sum) {
        if (phrase.equals(phrase.toLowerCase()))
            sum = letterCountingLogicLower(letter, sum);
        else sum = letterCountingLogicUpper(letter, sum);

        return sum;
    }

    private static int letterCountingLogicUpper(char[] letter, int sum) {
        for (char c : letter) {
            switch (c) {
                case 'A':
                case 'D':
                case 'G':
                case 'J':
                case 'M':
                case 'P':
                case 'T':
                case 'W':
                case ' ':
                    sum += 1;
                    break;
                case 'B':
                case 'E':
                case 'K':
                case 'H':
                case 'N':
                case 'Q':
                case 'U':
                case 'X':
                    sum += 2;
                    break;
                case 'C':
                case 'F':
                case 'I':
                case 'L':
                case 'O':
                case 'R':
                case 'V':
                case 'Y':
                    sum += 3;
                    break;
                case 'S':
                case 'Z':
                    sum += 4;
                    break;
            }
        }
        //sum = lower(letter, sum);
        return sum;
    }

    private static int letterCountingLogicLower(char[] letter, int sum) {
        for (char d : letter) {
            switch (d) {
                case 'a':
                case 'd':
                case 'g':
                case 'j':
                case 'm':
                case 'p':
                case 't':
                case 'w':
                case ' ':
                    sum += 1;
                    break;
                case 'b':
                case 'e':
                case 'k':
                case 'h':
                case 'n':
                case 'q':
                case 'u':
                case 'x':
                    sum += 2;
                case 'c':
                case 'f':
                case 'i':
                case 'l':
                case 'o':
                case 'r':
                case 'v':
                case 'y':
                    sum += 3;
                    break;
                case 's':
                case 'z':
                    sum += 4;
                    break;
            }
        }
        return sum;
    }
}
