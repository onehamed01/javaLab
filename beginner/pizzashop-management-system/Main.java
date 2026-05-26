import java.util.ArrayList;

class Pizza{
    private String pizzaName;
    private double pizzaPrice; 

    Pizza(String pizzaName, double pizzaPrice){
        this.pizzaName = pizzaName;
        this.pizzaPrice = pizzaPrice;
    }

    String getPizzaName(){
        return this.pizzaName;
    }
    double getPizzaPrice(){
        return this.pizzaPrice;
    }
}

class Order{
    private String customerName;
    private ArrayList<Pizza> orderList;
    private double totalPrice;
    private boolean statusOrder;

    Order(String customerName){
        this.customerName = customerName;
        this.orderList = new ArrayList<Pizza>();
        this.totalPrice = 0.00;
        this.statusOrder = false;
    }
     void addOrder(Pizza pizza){
        this.orderList.add(pizza);
    }
    double totalPriceCalculator(){
        for (Pizza pizzaPrice: orderList){
            this.totalPrice += pizzaPrice.getPizzaPrice();
        }
        return this.totalPrice;
    }
    String orderCompleted(){
        this.statusOrder = true;
        return "Completed";
    }
    void showOrder(){
        System.out.println("Customer Name: "+this.customerName);
        System.out.println("Orders:");
        for (Pizza pizzas: orderList){
            System.out.println(pizzas.getPizzaName());
        }
        System.out.println("Total Price"+ totalPriceCalculator());
        System.out.println("Order Status: "+orderCompleted());

    }

}