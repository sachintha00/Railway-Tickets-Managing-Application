public class RailwayDataTable {
    private String designation;
    private int id;
    private double price;

    public RailwayDataTable(String designation, int id, double price){
        this.designation = designation;
        this.id = id;
        this.price = price;
    }

    public String getDesignation(){
        return this.designation;
    }
    public int getId(){
        return this.id;
    }
    public double getPrice(){
        return this.price;
    }
}
