import java.util.ArrayList;
import java.util.List;

public class RailwayManagementSystem{
    public static void main(String[] args) {
        addRailwayData();
    }

    public static void menuDesign(List<RailwayDataTable> list){
        List<RailwayDataTable> list2 =list;

        System.out.println("----------------------------------------------------------------------------");
        System.out.print("\tDestination\t\t");
        System.out.print("Destination ID\t\t");
        System.out.println("Ticket Price");
        System.out.println("----------------------------------------------------------------------------");

        for(RailwayDataTable data : list2){
            System.out.print("\t"+data.getDesignation()+"\t\t\t");
            System.out.print(data.getId()+"\t\t");
            System.out.println(" "+data.getPrice());
        }
        System.out.println("----------------------------------------------------------------------------");
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
