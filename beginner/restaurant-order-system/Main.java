import java.util.ArrayList;

class MenuItem{
    private String itemName;
    private double itemPrice;

    MenuItem(String itemName, double itemPrice){
        this.itemName = itemName;
        this.itemPrice = itemPrice;

    }
    String getItemName(){
        return this.itemName;
    }
    double getItemPrice(){
        return this.itemPrice;
    }


}
class Drink extends MenuItem{
    Drink(String itemName, double itemPrice){
        super(itemName, itemPrice);
    }
}
class Food extends MenuItem{
    Food(String itemName, double itemPrice){
        super(itemName, itemPrice);
    }
}

class Order{
    private String customerName;
    private ArrayList<MenuItem> orderList;
    private boolean orderStatus;

    Order(String customerName){
        this.customerName = customerName;
        this.orderList = new ArrayList<MenuItem>();
        this.orderStatus = false;
    }
    void addItem(MenuItem item){
        this.orderList.add(item);
    }
    double calculateTotalPrice(){
        double totalPrice = 0.00;
        for (MenuItem item: orderList){
            totalPrice += item.getItemPrice();
        }
        return totalPrice;
    }
    boolean completeOrder(){
        return orderStatus = true;
    }
    void showOrder(){
        System.out.println("Customer Name: "+ customerName);
        System.out.println("Orders: ");
        for (MenuItem itemName: orderList){
            System.out.println(itemName.getItemName());
        }
        System.out.println("Total Price: £"+calculateTotalPrice());
        String status;
        if (orderStatus == false){
            status = "Preparing";
        }
        else{
            status = "Complete";
        } 
        System.out.println("Status: "+status);
    }   
}


class Main{
    public static void main(String[] args){
        Drink passionFruite = new Drink("Passion Fruite", 4.05);
        Drink latte = new Drink("Latte", 3.50);
        Drink cappuccino = new Drink("Cappuccino", 3.80);
        Drink orangeJuice = new Drink("Orange Juice", 2.95);
        Drink icedTea = new Drink("Iced Tea", 3.25);
        
        Food crosunts = new Food("Crosunts", 2.10);
        Food sandwich = new Food("Sandwich", 5.40);
        Food muffin = new Food("Muffin", 2.75);
        Food salad = new Food("Salad", 6.20);
        Food cookies = new Food("Cookies", 1.95);

        Order mat = new Order("Mat");
        mat.addItem(passionFruite);
        mat.addItem(icedTea);
        mat.addItem(sandwich);

        mat.completeOrder();
        mat.showOrder();
        
    }

}