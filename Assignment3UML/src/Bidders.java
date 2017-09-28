import java.util.ArrayList;

public class Auctioneer implements Subject {  
  
  public Auctioneer () {
    observers = new ArrayList<Observer>();
  }

  /* bidders invoke this method when they submit a bid */ 
  public void submitBid(int latestBid) {
    //TODO VALIDATE
    this.set_state(latestBid);
  }
}
