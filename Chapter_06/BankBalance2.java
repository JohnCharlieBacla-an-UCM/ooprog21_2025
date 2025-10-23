import java.util.Scanner;

public class DoublingMoney {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        
        int days;
        double money = 
        int day = 1; 
        
        System.out.print("Enter number of days >> "); 
        days = keyboard.nextInt();
        
       
        while(day <= days) {
            
            money = 2 * money; 
            
            
            ++day; 
        }
        
        
        double finalAmount = money / 2;
        
        System.out.printf("After %d days, you would have a total of $%.2f%n", days, finalAmount);
        
        keyboard.close();
    }
}
