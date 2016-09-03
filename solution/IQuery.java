package example;

import java.util.Date;

public interface IQuery {
    
    public String getFrom();
    public String getTo();
    public Date getDepartureDate();
    public Date getArrivalDate();
    public int getTravelersCount();
}
