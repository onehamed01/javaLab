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
