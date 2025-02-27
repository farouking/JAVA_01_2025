public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffee = 3.75;
        double latte = 2.5;
        double cappuccino = 4.0;

        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;

        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        
        // Cindhuri's order
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
        if (isReadyOrder1) {
            System.out.println(customer1 + readyMessage);
        } else {
            System.out.println(customer1 + pendingMessage);
        }

        // Noah's order
        System.out.println(generalGreeting + customer4);
        if (isReadyOrder4) {
            System.out.println(customer4 + readyMessage);
            System.out.println(displayTotalMessage + cappuccino);
        } else {
            System.out.println(customer4 + pendingMessage);
        }

        // Sam's order (2 lattes)
        System.out.println(generalGreeting + customer2);
        double samTotal = 2 * latte; // Sam ordered 2 lattes
        if (isReadyOrder2) {
            System.out.println(customer2 + readyMessage);
            System.out.println(displayTotalMessage + samTotal);
        } else {
            System.out.println(customer2 + pendingMessage);
        }

        // Jimmy's order (incorrect charge)
        System.out.println(generalGreeting + customer3);
        double jimmyTotal = dripCoffee; // Jimmy was charged for a coffee
        double correctTotal = latte; // Jimmy ordered a latte
        double difference = correctTotal - jimmyTotal; // Calculate the difference
        if (isReadyOrder3) {
            System.out.println(customer3 + readyMessage);
            System.out.println(displayTotalMessage + correctTotal);
            if (difference > 0) {
                System.out.println("You were undercharged by $" + difference);
            } else if (difference < 0) {
                System.out.println("You were overcharged by $" + Math.abs(difference));
            } else {
                System.out.println("Your charge is correct.");
            }
        } else {
            System.out.println(customer3 + pendingMessage);
        }

   
    }
}