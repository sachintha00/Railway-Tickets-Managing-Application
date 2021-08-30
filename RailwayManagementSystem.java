import java.util.ArrayList;
import java.util.List;

public class RailwayManagementSystem{
    public static void main(String[] args) {
        List<RailwayDataTable> list = new ArrayList<>();
        list.add(new RailwayDataTable("Matara",1,100.00));
        list.add(new RailwayDataTable("Matara",2,200.00));
        list.add(new RailwayDataTable("Matara",3,300.00));

        for(RailwayDataTable data : list){
            if(data.getId() == 1){
                System.out.println((double)data.getPrice()*2);
            }
        }
    }
}
