import java.util.ArrayList;
import java.util.HashMap;

public class RailwayManagementSystem{
    public static void main(String[] args) {
        List<RailwayTable> railwayData = new ArrayList<>();

        railwayData.add(new RailwayTable("Matara", 1, 100.00));
        railwayData.add(new RailwayTable("Ambalangoda", 2, 150.00));
        railwayData.add(new RailwayTable("Kaluthara", 3, 200.00));
        railwayData.add(new RailwayTable("Colombo", 4, 300.00));

        // Map<Integer,String> map = new HashMap<>();
        // for(RailwayTable data: railwayData){
        //     // map.put()
        //     System.out.println(data.getDesignation());
        // }
    }
}
