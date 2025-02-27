import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {
    
        // Create the Item class with name and price
        class Item {
            public String name;
            public double price;
            
            // Constructor
            public Item(String name, double price) {
                this.name = name;
                this.price = price;
            }
        }
    
        // Create the Order class with name, total, ready and items
        class Order {
            public String name;
            public double total;
            public boolean ready;
            public ArrayList<Item> items;
            
            // Constructor
            public Order(String name) {
                this.name = name;
                this.total = 0.0;
                this.ready = false;
                this.items = new ArrayList<Item>();
            }
            
            // Method to add an item to the order
            public void addItem(Item item) {
                this.items.add(item);
                this.total += item.price;
            }
        }
        
        // Create 4 item variables
        Item item1 = new Item("mocha", 3.50);
        Item item2 = new Item("latte", 4.00);
        Item item3 = new Item("drip coffee", 2.50);
        Item item4 = new Item("cappuccino", 4.50);
        
        // Create 4 order variables
        Order order1 = new Order("Cindhuri");
        Order order2 = new Order("Jimmy");
        Order order3 = new Order("Noah");
        Order order4 = new Order("Sam");
        
        // Print order1 variable to see what happens
        System.out.println(order1);
        
        // Print order1.total (prediction: will print 0.0 as no items added yet)
        System.out.println(order1.total);
        
        // Add item1 to order2's item list and increment the order's total
        order2.addItem(item1);
        
        // Noah ordered a cappuccino. Add to order and tab.
        order3.addItem(item4);
        
        // Sam added a latte. Update the order.
        order4.addItem(item2);
        
        // Cindhuri's order is now ready. Update status.
        order1.ready = true;
        
        // Sam ordered more drinks - 2 lattes. Update order.
        order4.addItem(item2);
        order4.addItem(item2);
        
        // Jimmy's order is now ready. Update status.
        order2.ready = true;
        
        // Print out order details to verify all requirements
        System.out.println("\n----- All Orders Status -----");
        
        System.out.printf("Order for %s\n", order1.name);
        System.out.printf("Total: $%.2f\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
        System.out.printf("Items: %d\n\n", order1.items.size());
        
        System.out.printf("Order for %s\n", order2.name);
        System.out.printf("Total: $%.2f\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);
        System.out.printf("Items: %d\n\n", order2.items.size());
        
        System.out.printf("Order for %s\n", order3.name);
        System.out.printf("Total: $%.2f\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);
        System.out.printf("Items: %d\n\n", order3.items.size());
        
        System.out.printf("Order for %s\n", order4.name);
        System.out.printf("Total: $%.2f\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);
        System.out.printf("Items: %d\n", order4.items.size());
    }
}