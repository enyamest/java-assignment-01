/**
 * TryingMethods is a playground for practicing methods usage in Java
 */
public class TryingMethods {

    private final String EMPTY_STRING = "";

    public static void main(String[] args) {

    }

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

    private void discoverGender(String gender) {

        if (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("m")) {
            System.out.println("Your are a man");
        } else if (gender.equalsIgnoreCase("female") || gender.equalsIgnoreCase("f")){
            System.out.println("Your are a lady");
        } else {
            System.out.println("You are not human!");
        } 

    }

    private static int sumOneToNineHundred() {

        int sum = 0;
        int count = 0;

        while(count < 1000){
            count = count + 1;
            sum = sum + count;
        }

        return sum;
    }

    private static int sumOfEvenNumbersBetweenTwelveAndOneHundredAndThree() {

        return 0;
    }

}