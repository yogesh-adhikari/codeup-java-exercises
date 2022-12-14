
import java.util.Scanner;
import java.lang.Math;
public class MethodExercise {
    public static void main(String[] args) {

        addition(5, 7);
        subtraction(7, 5);
        multiplication(5, 7);
        division(10, 5);
        modulus(7, 5);
//        getInteger(1,10);
        System.out.println(getFactorial(5));


        //simulating dice rolling
        System.out.println("How many sides are on your two dice?");
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();
        System.out.println("Enter the number of the sides of dice:");
        randomize(5);
    }

    public static void randomize(int sides) {
        System.out.println((int) Math.floor(Math.random() * sides + 1));
        System.out.println((int) Math.floor(Math.random() * sides + 1));
    }

    //Addition method taking two parameters.
    public static void addition(int input1, int input2) {
        int additionInput = input1 + input2;
        System.out.printf("Your result for the addition is: %d%n", additionInput);
    }


    //Subtraction method taking two parameter as an input.
    public static void subtraction(int input1, int input2) {
        int subtraction = input1 - input2;
        System.out.printf("Your result for the subtraction is: %d %n", subtraction);
    }


    //Multiplication method taking two parameters.
    public static void multiplication(int input1, int input2) {
        int multiplication = input1 * input2;
        System.out.printf("Your result for the multiplication is: %d %n", multiplication);
    }


    //Division method taking two parameters.
    public static void division(int input1, int input2) {
        int division = input1 / input2;
        System.out.printf("Your result for the division is:%d %n", division);
    }


    //Modulus method taking two parameters.
    public static void modulus(int input1, int input2) {
        int modulus = input1 % input2;
        System.out.printf("Your remainder for the numbers provided is:%d %n", modulus);
    }


    //Method to validate user input is in given range.
//    public static int getInteger(int min, int max){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the integer between 1 to 10:");
//        int userInput = scanner.nextInt();
//        if (userInput < 1 || userInput > 10){
//            System.out.println("Invalid number please enter a number again");
//           userInput = getInteger(1, 10);
//        }
//        return userInput;
//
//    };

    //    Factorial of a number
    public static long getFactorial(int num) {
        System.out.println("Enter an integer from 1 to 10:");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        System.out.printf("%s is the number you entered %n", userInput);
        for (int i = 1; i <= 10; i++) {
            if (userInput == 1) {
                return userInput;
            } else {
                return userInput * getFactorial(userInput - 1);
            }

        }
        return userInput;


    }
}







