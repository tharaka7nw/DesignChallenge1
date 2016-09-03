package example;

import java.util.Date;


public class QueryBuilder3 implements IQueryBuilder, IFrom, ITo, IDeparture, IArrive, ICount{
    
    private Query query;
    
    private QueryBuilder3(){
        query = new Query();
    }
    
    public static IFrom getBuilder(){
        return new QueryBuilder3();
    }
    
    public ITo from(String from){
        query.from = from;
        return this;
    }
        
    public IDeparture to(String to){
        query.to = to;
        return this;
    }
    
    public IArrive departure(Date departOn){
        query.departureOn = departOn;
        return this;
    }
    
    public ICount arrive(Date arriveOn){
        query.arriveOn = arriveOn;
        return this;
    }
    
    public IQueryBuilder count(int count){
        query.count = count;
        return this;
    }
    
    public IQuery build(){
        
        return query;
    }
    
    
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
