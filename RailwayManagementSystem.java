import java.util.ArrayList;
import java.util.List;

public class RailwayManagementSystem{
    public static void main(String[] args) {
        List<RailwayDataTable> list = new ArrayList<>();
        list.add(new RailwayDataTable("Matara",1,100.00));
        list.add(new RailwayDataTable("Matara",2,200.00));
        list.add(new RailwayDataTable("Matara",3,300.00));
        dataTaleDesign(list);
    }

    public static void dataTaleDesign(List<RailwayDataTable> list){
        List<RailwayDataTable> list2 =list;
        // List<RailwayDataTable> list = new ArrayList<>();
        // list.add(new RailwayDataTable("Matara",1,100.00));
        // list.add(new RailwayDataTable("Matara",2,200.00));
        // list.add(new RailwayDataTable("Matara",3,300.00));



        System.out.println("----------------------------------------------------------------------------");
        System.out.print("\tDestination\t\t");
        System.out.print("Destination ID\t\t");
        System.out.println("Ticket Price");
        System.out.println("----------------------------------------------------------------------------");

        for(RailwayDataTable data : list2){
            System.out.print("\t"+data.getDesignation()+"\t\t\t\t");
            System.out.print(data.getId()+"\t\t");
            System.out.println(" "+data.getPrice());
        }
        System.out.println("----------------------------------------------------------------------------");
    }
}
