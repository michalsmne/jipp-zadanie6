import java.io.IOException;
import java.util.Scanner;
import Exception.DenominatorZeroException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        double[] numbersArray = new double[2];
        char actionSign;

        System.out.println("Podaj pierwszą liczbę: ");
        numbersArray[0] = scanner.nextDouble();

        System.out.println("Podaj działanie (+, -, /, *):" );
        actionSign = scanner.next().charAt(0);

        System.out.println("Podaj drugą liczbę: ");
        numbersArray[1] = scanner.nextDouble();

        try {
            System.out.printf("Wynik działania: %f \n", calculator.calculate(numbersArray, actionSign));
        } catch (DenominatorZeroException e) {
            System.out.println("Nie wolno dzielić przez zero");
        }

        System.out.println("Naciśnij enter aby zamknąć program.");
        System.in.read();
    }
}
