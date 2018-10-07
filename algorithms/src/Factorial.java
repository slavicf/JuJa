/**
 * Created by Intellij IDEA.
 * User: Jaroslav Frunt
 * Date: 05.10.2018
 */
public class Factorial {

    static int factorial(int number) {
        return number <= 1 ? 1 : number * factorial(number - 1);
    }

    public static void main(String[] args) {

        for (int i = 0; i <= 12; i++) {
            System.out.println("Factorial of " + i + " is " + factorial(i));
        }
    }
}
