import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RailwayManagementSystem{

    // ****************************
    //     Main Menu
    // ****************************
    public static void main(String[] args) {
        addRailwayData();
    }

    // **********************************************************
    //    Menu Design Function for the make an interface with
    //          railway data table and user menu
    // **********************************************************
    public static void menuDesign(List<RailwayDataTable> plist){

        // ***********************
        //     declare objects
        // ***********************
        Employee emp = new Employee();
        Passenger cstmr = new Passenger();
        Ticket ticket = new Ticket();

        String to="";

        Scanner sacnner = new Scanner(System.in);

        List<RailwayDataTable> list = plist;

        // **********************************************************
        //         Draw the table for the display railway data
        // **********************************************************
        System.out.println("\n\n");
        System.out.println("----------------------------------------------------------------------------");
        System.out.print("\tDestination\t\t");
        System.out.print("Destination ID\t\t");
        System.out.println("Ticket Price");
        System.out.println("----------------------------------------------------------------------------");

        for(RailwayDataTable data : list){
            System.out.print("\t"+data.getDesignation()+"\t\t\t");
            System.out.print(data.getId()+"\t\t");
            System.out.println(" Rs."+data.getPrice());
        }
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("\n\n\n");

        // *************************************
        //         Get inputs from user
        // *************************************
        System.out.print("Please Enter Your Employee Number: ");
        emp.seId(sacnner.nextInt());
        System.out.print("Please Enter Customer NIC: ");
        cstmr.setNic(sacnner.next());
        System.out.print("Please Enter Designation ID: ");
        ticket.setDesignation(sacnner.nextInt());
        System.out.print("Please Enter Number Of Tickets: ");
        ticket.setNoOfTickets(sacnner.nextInt());

        // **********************************************************
        //     check designation id with user input and set price
        // **********************************************************
        for(RailwayDataTable data : list){
            if(ticket.getDesignation() == data.getId()){
                ticket.setPrice(data.getPrice());
                to = data.getDesignation();
                break;
            }
        }
        // ***********************************************************
        //  Call to calculation function for the calculate total cost
        // ***********************************************************
        calculation(ticket);
        // **************************************************************
        //  call print Ticket function for the print a ticket with format
        // **************************************************************
        printTicket(emp.getId(), cstmr.getNic(), "Galle", to, ticket.getTotalCost());
    }

    // ******************************
    //     Calculation Function
    // ******************************
    public static void calculation(Ticket ticket){
        ticket.setTotalCost(ticket.getPrice()*ticket.getNoOfTickets());
    }

    // ***************************************
    //         Print Ticket Function
    // ***************************************
    public static void printTicket(int issueId, String passengerNic, String from, String to, double totalCost){
        System.out.println("\n\n\n****** TICKET ******\n");
        System.out.println("Issue By: "+issueId);
        System.out.println("Passenger NIC: "+passengerNic);
        System.out.println("From: "+from);
        System.out.println("To: "+to);
        System.out.println("Total: Rs."+totalCost);
        System.out.println("\n\n");
    }

    // **************************************************
    //    add railway data to the railway data table
    // **************************************************
    public static void addRailwayData(){
        List<RailwayDataTable> list = new ArrayList<>();
        list.add(new RailwayDataTable("Matara\t",1,100.00));
        list.add(new RailwayDataTable("Ambalangoda",2,150.00));
        list.add(new RailwayDataTable("Kaluthara",3,200.00));
        list.add(new RailwayDataTable("Colombo\t",4,300.00));
        menuDesign(list);
    }
}
