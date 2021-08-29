import java.util.HashMap;
import java.util.List;

public class RilwayTable {
    private String destination;
    private int id;
    private double price;
    
    public RilwayTable(String destination, int id, double price){
        this.destination = destination;
        this.id = id;
        this.price = price;
    }

    public String getDesignation(){
        return this.destination;
    }
    public int getId(){
        return this.id;
    }
    public double getPrice(){
        return this.price;
    }
}