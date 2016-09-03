package example;

import java.util.Date;

public class QueryBuilder2 {
    
    private Query query;
    
    private QueryBuilder2(){
        query = new Query();
    }
    
    public static QueryBuilder2 getBuilder(){
        return new QueryBuilder2();
    }
    
    public QueryBuilder2 from(String from){
        query.from = from;
        return this;
    }
        
    public QueryBuilder2 to(String to){
        query.to = to;
        return this;
    }
    
    public QueryBuilder2 departure(Date departOn){
        query.departureOn = departOn;
        return this;
    }
    
    public QueryBuilder2 arrive(Date arriveOn){
        query.arriveOn = arriveOn;
        return this;
    }
    
    public QueryBuilder2 count(int count){
        query.count = count;
        return this;
    }
    
    public IQuery build(){
        
        if(query.from == null || query.to == null
        || query.departureOn == null || query.arriveOn == null || query.count == 0)
        {
            // Validation exception
        }
        
        return query;
    }
    
    // Query Inner class
    
    class Query implements IQuery{
        
        private String from;
        private String to;
        private Date departureOn;
        private Date arriveOn;
        private int count;
        
        public String getFrom(){
            return from;
        }
        
        public String getTo(){
            return to;
        }
        
        public Date getDepartureDate(){
            return departureOn;
        }
        
        public Date getArrivalDate(){
            return arriveOn;
        }
        
        public int getTravelersCount(){
            return count;
        }
        
    }
}
