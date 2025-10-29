import java.util.Random;
import java.util.Scanner;

/**
 * Purpose: Emulate a math trick.
 *
 * @ author SaxbyMod
 * @ version 1.0.0 - Date 10/28/2025
 */
public class Main {
    // Define a Reader
    public static Scanner Reader = new Scanner(System.in);

    // Simple Function for reading Console Input
    public static String readInputStr() {
        return Reader.nextLine();
    }

    public static Random randy = new Random();

    public static int GetRandom(int start, int end) {
        return randy.nextInt(start, end);
    }

    public static int ReverseNumber (int Number) {
        int Length = String.valueOf(Number).toCharArray().length;
        String finalized = "";
        for (int i = 0; i < Length; i++) {
            finalized += String.valueOf(Number).substring(Length -i - 1, Length -i);
        }
        return Integer.parseInt(finalized);
    }

    public static String ReverseString (String ChangeMe) {
        int Length = ChangeMe.toCharArray().length;
        String finalized = "";
        for (int i = 0; i < Length; i++) {
            finalized += ChangeMe.substring(Length -i - 1, Length -i);
        }
        return finalized;
    }

    public static String NumTOString (int Number) {
        String toParse = String.valueOf(Number);
        String PentUpStr = "";
        for (char Num : toParse.toCharArray()) {
            switch (Num) {
                case '0':
                    PentUpStr += 'Y';
                    break;
                case '1':
                    PentUpStr += 'M';
                    break;
                case '2':
                    PentUpStr += 'P';
                    break;
                case '3':
                    PentUpStr += 'L';
                    break;
                case '4':
                    PentUpStr += 'R';
                    break;
                case '5':
                    PentUpStr += 'O';
                    break;
                case '6':
                    PentUpStr += 'F';
                    break;
                case '7':
                    PentUpStr += 'A';
                    break;
                case '8':
                    PentUpStr += 'I';
                    break;
                case '9':
                    PentUpStr += 'B';
                    break;
            }
        }
        return  PentUpStr;
    }

    public static void main() {
        int RandomNumber = GetRandom(100, 999);
        System.out.println("Original: " + RandomNumber);
        int ReversedNumber = ReverseNumber(RandomNumber);
        System.out.println("Reversed: " + ReversedNumber);
        int SubtractedNumber = 0;
        if (ReversedNumber > RandomNumber) {
            SubtractedNumber = ReversedNumber - RandomNumber;
            System.out.println("Subtracted: " + SubtractedNumber);
        } else if (RandomNumber > ReversedNumber) {
            SubtractedNumber = RandomNumber - ReversedNumber;
            System.out.println("Subtracted: " + SubtractedNumber);
        } else {
            System.out.println("Restarting bear with us, we got a match.");
            Main.main();
            return;
        }
        int ReversedSubtractedNumber = ReverseNumber(SubtractedNumber);
        System.out.println("Reversed: " + ReversedSubtractedNumber);
        if (ReversedSubtractedNumber == SubtractedNumber) {
            System.out.println("Restarting bear with us, we got a match.");
            Main.main();
            return;
        }
        int AddedToNumber = SubtractedNumber + ReversedSubtractedNumber;
        System.out.println("Added: " + AddedToNumber);
        int MultipliedNumber = AddedToNumber * 1000000;
        System.out.println("Multipled: " + MultipliedNumber);
        int SubtractedNumber2 = MultipliedNumber - 733361573;
        System.out.println("Subtracted: " + SubtractedNumber2);
        String ConvertedNumber = NumTOString(SubtractedNumber2);
        System.out.println("Converted: " + ConvertedNumber);
        String ReveresedConvertedNumber = ReverseString(ConvertedNumber);
        System.out.println("Reversed: " + ReveresedConvertedNumber);
    }
}