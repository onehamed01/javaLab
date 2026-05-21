import java.util.ArrayList;

class Pizza{
    private String pizzaName;
    private double pizzaPrice;

    Pizza(String pizzaName, double pizzaPrice){
        this.pizzaName = pizzaName;
        this.pizzaPrice = pizzaPrice;
    }
    double getPizzaPrice(){
        return this.pizzaPrice;
    }
    String getPizzaName(){
        return this.pizzaName;
    }
}
class Order{
    private String customerName;
    private boolean orderStatus;
    private ArrayList<Pizza> orderList;
    private double totalPrice;

    Order(String customerName){

        this.customerName = customerName;
        this.orderList = new ArrayList<Pizza>();
        this.orderStatus = false;
        this.totalPrice = 0.00;
    }

    void addOrder(Pizza pizza){
        this.orderList.add(pizza);
    }
    double calculateTotalPrice(){
        double totalPrice = 0.00;

        for (Pizza pizzaPrice: orderList){
            this.totalPrice += pizzaPrice.getPizzaPrice();

        }
        return this.totalPrice;
    }
    void changeStatus(){
        this.orderStatus = true;
        System.out.println("order has been done. ");
    }
    void showInfo(){
        System.out.println("Customer Name: "+this.customerName);
        int i = 1;
        for(Pizza pizza: orderList){
            System.out.println(i+". "+pizza.getPizzaName());
        }
        System.out.println("Total Price: £"+calculateTotalPrice());
        changeStatus();
    }
}

class Main{
    public static void main(String[] args) {
        Pizza margaritta = new Pizza("Margaritta", 22.00);
        Pizza bbqChicken = new Pizza("BBQ Chicken", 43.00);
        Pizza kiev = new Pizza("Chicken Kiev", 32.00);
        Order danielOrder = new Order("Daniel");

        danielOrder.addOrder(kiev);
        danielOrder.addOrder(bbqChicken);
        danielOrder.showInfo();


    }
}