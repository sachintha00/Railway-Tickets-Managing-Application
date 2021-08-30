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
            if(ticket.getDesignation() == data.getId())
                ticket.setPrice(data.getPrice());
        }
        System.out.println("\n\n"+emp.getId()+"\n"+cstmr.getNic()+"\n"+ticket.getDesignation()+"\n"+ticket.getNoOfTickets()+"\n"+ticket.getPrice());

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
