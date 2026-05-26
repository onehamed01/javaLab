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
    private boolean statusOrder;

    Order(String customerName){
        this.customerName = customerName;
        this.orderList = new ArrayList<Pizza>();
        this.statusOrder = false;
    }
     void addOrder(Pizza pizza){
        this.orderList.add(pizza);
    }
    double totalPriceCalculator(){
        double total = 0.00;
        for (Pizza pizzaPrice: orderList){
            total += pizzaPrice.getPizzaPrice();
        }
        return total;
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
        System.out.println("Total Price £"+ totalPriceCalculator());
        String orderMessage;
        if (this.statusOrder == false){
            orderMessage = "Not ready";
        }
        else{
            orderMessage = "Completed";
        }
        System.out.println("Order Status: "+orderMessage);

    }

}

class Main{
    public static void main(String[] args){
        Pizza kebabPizza = new Pizza("Kebab Pizza", 8.80);
        Pizza bbqChicken = new Pizza("BBQ Chicken Pizza", 13.80);
        Pizza alfangi = new Pizza("Alfangi Pizza", 8.80);

        Order maty = new Order("Maty");
        maty.addOrder(kebabPizza);
        maty.addOrder(bbqChicken);
        maty.addOrder(alfangi);
        maty.showOrder();
        maty.showOrder();


    }
}