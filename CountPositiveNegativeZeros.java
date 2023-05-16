import java.util.Scanner;
public class CountPositiveNegativeZeros {


    public static void main(String[] args) {
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number (press 'q' to quit): ");
            String numStr = input.next();

            if (numStr.equals("q")) {
                break;
            }

            int num = Integer.parseInt(numStr);

            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }
        System.out.println("Positive count: " + positiveCount);
        System.out.println("Negative count: " + negativeCount);
        System.out.println("Zero count: " + zeroCount);
    }
}

