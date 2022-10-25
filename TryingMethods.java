import java.math.BigInteger;

/**
 * TryingMethods is a playground for practicing methods usage in Java
 */
public class TryingMethods {

    private final String EMPTY_STRING = "";

    public static void main(String[] args) {

        TryingMethods demoClass = new TryingMethods();

        System.out.println(demoClass.getDayOfWeek(4));
        demoClass.discoverGender("m");
        System.out.println(sumOneToNineHundred());
        System.out.println("Sum of even numbers = " + sumOfEvenNumbersBetweenTwelveAndOneHundredAndThree());
        System.out.println("Factorial of 20 = "+ findFactorial(20));

    }

    /*
     * returns the text representation of 
     * a day based on the argument passed
     */
    private String getDayOfWeek(int day) {

        String dayOfweek;

        switch (day) {
            case 1:
                dayOfweek = "Sunday";
                break;
            case 2:
                dayOfweek = "Monday";
                break;
            case 3:
                dayOfweek = "Tuesday";
                break;
            case 4:
                dayOfweek = "Wednesday";
                break;
            case 5:
                dayOfweek = "Thursday";
                break;
            case 6:
                dayOfweek = "Friday";
                break;
            case 7:
                dayOfweek = "Saturday";
                break;
            default:
                dayOfweek = EMPTY_STRING;
                break;
        }

        return dayOfweek;
    }

    /*
     * prints to console a person's gender, based on the argument
     */
    private void discoverGender(String gender) {

        if (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("m")) {
            System.out.println("Your are a man");
        } else if (gender.equalsIgnoreCase("female") || gender.equalsIgnoreCase("f")) {
            System.out.println("Your are a lady");
        } else {
            System.out.println("You are not human!");
        }

    }

    /*
     * calculate the sum of 1-999
     */
    private static int sumOneToNineHundred() {

        int sum = 0;
        int count = 0;

        while (count < 1000) {
            count = count + 1;
            sum = sum + count;
        }

        return sum;
    }

    /*
     * sum of even numbers from 13 - 103
     */
    private static int sumOfEvenNumbersBetweenTwelveAndOneHundredAndThree() {

        int sum = 0;

        for (int i = 12; i < 103; i += 2) {
            sum = sum + i;
        }

        return sum;
    }

    /*
     * find the factorial of any number
     */
    private static BigInteger findFactorial(int num) {

        BigInteger sum = new BigInteger("1");

        for (int i = 1; i <= num; i++) {
            sum = sum.multiply(BigInteger.valueOf(i));
        }

        return sum;

    }

}