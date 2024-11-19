import java.util.Scanner;

public class Switch {

    
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter car model: ");
        String enteredModel = scanner.nextLine();

        System.out.println("Enter car price: ");
        double enteredPrice = scanner.nextDouble();
        System.out.println("Car Model:" + enteredModel );
        System.out.println("Car Price (RM):" + enteredPrice );
  
    int buyerStatus = (enteredPrice > 100000) ? 1 : 2;
    switch(buyerStatus){
        case 1:
            System.out.println("The buyer is VIP");
            break;
        case 2:
            System.out.println("The buyer is not VIP");
            break;
        default:
        System.out.println("Invalid input");
            break;
    }
    }
}