import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    public static void main(String[] args) throws IOException {

        MyArithmeticLibrary myArithmeticLibrary = new MyArithmeticLibrary();
        ArithmeticFunctions arithmeticFunctions = new ArithmeticFunctions();
        System.out.println("What arithmetic operation do you want to perform : \n 1 - add, 2 - subtraction, 3 - multiply, 4 - power, 5 - divide," +
                " 6 - percentage of a number, 7 - factorial");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int inputNum = Integer.parseInt(reader.readLine());
        if (inputNum == 1) {
            System.out.println(" Enter 2 numbers: \n1) ");
            int firstNum = Integer.parseInt(reader.readLine());
            System.out.println("2) ");
            int secondNum = Integer.parseInt(reader.readLine());
            System.out.println("Sum = " + myArithmeticLibrary.sum(firstNum, secondNum));
        }
        if (inputNum == 2) {
            System.out.println(" Enter 2 numbers: \n1) ");
            int firstNum = Integer.parseInt(reader.readLine());
            System.out.println("2) ");
            int secondNum = Integer.parseInt(reader.readLine());
            System.out.println("Subtract = " + myArithmeticLibrary.subtract(firstNum, secondNum));
        }
        if (inputNum == 3) {
            System.out.println(" Enter 2 numbers: \n1) ");
            int firstNum = Integer.parseInt(reader.readLine());
            System.out.println("2) ");
            int secondNum = Integer.parseInt(reader.readLine());
            System.out.println("Multiply = " + myArithmeticLibrary.multiply(firstNum, secondNum));
        }
        if (inputNum == 4) {
            System.out.println(" Enter 2 numbers: \n1) ");
            int firstNum = Integer.parseInt(reader.readLine());
            System.out.println("2) ");
            int secondNum = Integer.parseInt(reader.readLine());
            System.out.println("Power = " + arithmeticFunctions.power(firstNum, secondNum));
        }
        if (inputNum == 5) {
            System.out.println(" Enter 2 numbers: \n1) ");
            int firstNum = Integer.parseInt(reader.readLine());
            System.out.println("2) ");
            int secondNum = Integer.parseInt(reader.readLine());
            System.out.println("Division Of Two Numbers = " + arithmeticFunctions.divide(firstNum, secondNum));
        }
        if (inputNum == 6) {
            System.out.println(" Enter 2 numbers: \n1) Percentage % ");
            int firstNum = Integer.parseInt(reader.readLine());
            System.out.println("2) Of a number : ");
            int secondNum = Integer.parseInt(reader.readLine());
            int obtainedMultiply = myArithmeticLibrary.multiply(firstNum, 100);
            System.out.println("% = " + arithmeticFunctions.divide(obtainedMultiply, secondNum));
        }
        if (inputNum == 7) {
            System.out.println("Factorial of ");
            int factorialNum = Integer.parseInt(reader.readLine());
            System.out.println("Factorial = " + arithmeticFunctions.factorial(factorialNum));
        }


    }
}
