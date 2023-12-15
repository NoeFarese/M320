public class Main {
    public static void main(String[] args) {
        int resultatAdd = addTwoNumbers(5, 5);
        System.out.println(resultatAdd);

        int resultatSubtract = subtractTwoNumbers(5,5);
        System.out.println(resultatSubtract);

        int resultatMultiply = multiplyTwoNumbers(5,5);
        System.out.println(resultatMultiply);

        int resultatDivide = divideTwoNumbers(5,5);
        System.out.println(resultatDivide);
    }

    public static int addTwoNumbers(int numberOne, int numberTwo) {
        int resultat = numberOne + numberTwo;
        return resultat;
    }

    public static int subtractTwoNumbers(int numberOne, int numberTwo) {
        int result = numberOne - numberTwo;
        return result;
    }

    public static int multiplyTwoNumbers(int numberOne, int numberTwo) {
        int result = numberOne * numberTwo;
        return result;
    }

    public static int divideTwoNumbers(int numberOne, int numberTwo) {
        if (numberTwo != 0) {
            int result = numberOne / numberTwo;
            return result;
        } else {
            return 0;
        }
    }
}
