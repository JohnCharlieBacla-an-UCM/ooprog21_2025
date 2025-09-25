public class DemoGrossPay {
    public static void main(String[] args) {
        double payRate = 22.75;
        
        double hours1 = 10.0;
        double hours2 = 25.0;
        double hours3 = 37.5;

        double pay1 = hours1 * payRate;
        double pay2 = hours2 * payRate;
        double pay3 = hours3 * payRate;

        System.out.println(hours1 + " hours at $" + payRate + " per hour is $" + pay1);
        System.out.println(hours2 + " hours at $" + payRate + " per hour is $" + pay2);
        System.out.println(hours3 + " hours at $" + payRate + " per hour is $" + pay3);
    }
}
