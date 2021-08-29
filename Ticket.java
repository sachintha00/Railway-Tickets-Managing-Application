public class Ticket {
    private int destination;
    private int noOfTickets;
    private double price;
    private double totalCost;

    public Ticket(){
        destination = 0;
        noOfTickets = 0;
        price = 0;
        totalCost = 0;
    }

    public void setDesignation(int destination){
        this.destination = destination;
    }
    public int getDesignation(){
        return this.destination;
    }
    public void setNoOfTickets(int noOfTickets){
        this.noOfTickets = noOfTickets;
    }
    public int getNoOfTickets(){
        return this.noOfTickets;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return this.price;
    }
    public void setTotalCost(double totalCost){
        this.totalCost = totalCost;
    }
    public double getTotalCost(){
        return this.totalCost;
    }
}
