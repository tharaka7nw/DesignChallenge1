package example;

import java.text.SimpleDateFormat;
import java.util.List;

public class Main {
    
    public static void main(String[] argvs) throws Exception {
        
        SimpleDateFormat ft = new SimpleDateFormat("yyyy/MM/dd");
        
        List<Flight> flights;
        
        //Example 1
        FlightFinder flightFinder =  new FlightFinder();
        flights = flightFinder.searchFlights("CMB", "SIN", ft.parse("2016/8/20"), ft.parse("2016/8/29"), 1);
        
        
        
        //Example 2
        QueryBuilder1 builder1 = new QueryBuilder1();
        builder1.setFrom("CMB");
        builder1.setTo("SIN");
        builder1.setDepartureDate(ft.parse("2016/8/20"));
        builder1.setArrivalDate(ft.parse("2016/8/29"));
        builder1.setTravelersCount(1);        
        IQuery query1 = builder1.build();
        
        flights = flightFinder.searchFlights(query1);
        
        
        
        //Example 3
        IQuery query2 = QueryBuilder2.getBuilder().from("CMB").to ("SIN")
                .departure(ft.parse("2016/8/20"))
                .arrive(ft.parse("2016/8/29"))
                .count(1).build();
                
        flights = flightFinder.searchFlights(query2);         
        
        
        
        //Example 4
        IQuery query3 = QueryBuilder3.getBuilder().from("CMB").to ("SIN")
                .departure(ft.parse("2016/8/20"))
                .arrive(ft.parse("2016/8/29"))
                .count(1).build();
                
        flights = flightFinder.searchFlights(query3);
    }
    
}
