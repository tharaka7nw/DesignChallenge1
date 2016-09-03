package example;

import java.util.Date;

public class QueryBuilder1 implements IQueryBuilder{
    
    private Query query;
    
    public QueryBuilder1(){
        query = new Query();
    }
    
    public void setFrom(String from){
        query.from = from;
    }
        
    public void setTo(String to){
        query.to = to;
    }
    
    public void setDepartureDate(Date departOn){
        query.departureOn = departOn;
    }
    
    public void setArrivalDate(Date arriveOn){
        query.arriveOn = arriveOn;
    }
    
    public void setTravelersCount(int count){
        query.count = count;
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
