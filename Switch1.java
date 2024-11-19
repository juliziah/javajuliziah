import java.util.Scanner;

public class Switch1 {

    
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
       
        System.out.println("Enter the number of your car. [1]Proton [2]BMW [3]Ferrari");
        int enteredModel = scanner.nextInt();
        
  
  
    switch(enteredModel){
        case 1:
            System.out.println("Proton, RM50,000");
            System.out.println("The buyer is not VIP");
            break;
        case 2:
            System.out.println("BMW, RM1,000,000");
            System.out.println("The buyer is VIP");
            break;
        case 3:
            System.out.println("Ferrari, RM10,000,000");
            System.out.println("The buyer is VIP");
            break;
        default:
        System.out.println("Invalid input");
            break;
    }
    }
}

