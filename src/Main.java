public class Main {
    public static int multiplyTwoNumbers(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }
    public static int multiplyThreeNumbers(int numberOne, int numberTwo, int numberThree) {
        int multiply = numberOne * numberTwo * numberThree;
        return multiply;

    }

    public static void getCurrentDateTime() {
        Date date = new Date();
        System.out.println(getCurrentDateTime);
    }
    public static void main(String[] args) {
        int sum = multiplyThreeNumbers(3, 5,8);
        int sum2 = multiplyTwoNumbers(6, 9);
        int sum3 = multiplyTwoNumbers (10,72);
        System.out.println(sum);
        System.out.println(sum3);

        getCurrentDateTime();
    }
}