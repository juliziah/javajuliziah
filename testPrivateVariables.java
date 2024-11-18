public class testPrivateVariables {
    private String car;
    private String make;
    private double price;



    public testPrivateVariables(String car, String make, double price) {
        this.car = car;
        this.make = make;
        this.price = price;
        

    }

    public void displayDetails(){
        String carShow = "car: ";
        String makeShow = "make: ";
        System.out.println(carShow + car);
        System.out.println(makeShow + make);
        System.out.println("Price:" + price);
      
    }

    public static void main(String[] args) {
        testPrivateVariables pv = new testPrivateVariables("Proton","2024",5000);
        pv.displayDetails();
    }
}