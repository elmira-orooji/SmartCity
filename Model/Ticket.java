package Model;

public class Ticket {
    private int id;
    private double price;
    private double cost;

    public Ticket(int id, double price, double cost){
        this.id = id;
        this.price = price;
        this.cost = cost;
    }
    public int getId(){
        return id;
    }
    public double getPrice(){
        return price;
    }
    public double getCost(){
        return cost;
    }

    public void setId(int id){
        this.id=id;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setCost(double cost){
        this.cost = cost;
    }
}
