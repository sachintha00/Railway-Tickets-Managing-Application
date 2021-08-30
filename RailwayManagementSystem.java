import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RailwayManagementSystem{
    public static void main(String[] args) {
        addRailwayData();
    }

    public static void menuDesign(List<RailwayDataTable> plist){

        Employee emp = new Employee();
        Passenger cstmr = new Passenger();
        Ticket ticket = new Ticket();

        String to="";

        Scanner sacnner = new Scanner(System.in);

        List<RailwayDataTable> list = plist;

        System.out.println("----------------------------------------------------------------------------");
        System.out.print("\tDestination\t\t");
        System.out.print("Destination ID\t\t");
        System.out.println("Ticket Price");
        System.out.println("----------------------------------------------------------------------------");

        for(RailwayDataTable data : list){
            System.out.print("\t"+data.getDesignation()+"\t\t\t");
            System.out.print(data.getId()+"\t\t");
            System.out.println(" "+data.getPrice());
        }
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("\n\n\n");

        System.out.print("Please Enter Your Employee Number: ");
        emp.seId(sacnner.nextInt());
        System.out.print("Please Enter Customer NIC: ");
        cstmr.setNic(sacnner.next());
        System.out.print("Please Enter Designation ID: ");
        ticket.setDesignation(sacnner.nextInt());
        System.out.print("Please Enter Number Of Tickets: ");
        ticket.setNoOfTickets(sacnner.nextInt());

        for(RailwayDataTable data : list){
            if(ticket.getDesignation() == data.getId()){
                ticket.setPrice(data.getPrice());
                to = "Matara";
                break;
            }
        }
        calculation(ticket);
        printTicket(emp.getId(), cstmr.getNic(), "Galle", to, ticket.getTotalCost());
    }

    public static void calculation(Ticket ticket){
        ticket.setTotalCost(ticket.getPrice()*ticket.getNoOfTickets());
    }

    public static void printTicket(int issueId, String passengerNic, String from, String to, double totalCost){
        System.out.println("\n\n\n****** TICKET ******\n");
        System.out.println("Issue By: "+issueId);
        System.out.println("Passenger NIC: "+passengerNic);
        System.out.println("From: "+from);
        System.out.println("To: "+to);
        System.out.println("****** TICKET ******");
    }

    public static void addRailwayData(){
        List<RailwayDataTable> list = new ArrayList<>();
        list.add(new RailwayDataTable("Matara\t",1,100.00));
        list.add(new RailwayDataTable("Ambalangoda",2,150.00));
        list.add(new RailwayDataTable("Kaluthara",3,200.00));
        list.add(new RailwayDataTable("Colombo\t",4,300.00));
        menuDesign(list);
    }
}
