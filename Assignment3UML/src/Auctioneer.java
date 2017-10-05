import java.util.ArrayList;
class Auctioneer implements Subject {
    private Item item;
    private double higestBid;
    private int maxCounter;
    private int counter = 0;
    private Bidder highestBidder;
    private ArrayList<Observer> observers;
    
    public double getCounter() {
        return counter;
    }
    
    public void setMaxCounter (int maxCounter) {
        this.maxCounter = maxCounter;
    }
    
    public void setItem(Item item) {
        this.item = item;
    }
    
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    
    private boolean checkBid(double bid) {
        return (bid > item.getInitialPrice());
    }
    
    public void addBid(double bid, Observer bidder) {
        if (checkBid(bid)) {
            counter ++;
            if (bid > higestBid) {
                highestBid = bid;
                highestBidder = bidder;
                notifyObservers();
            }
        }
        if (counter > maxCounter) {
            announceWinner();
        }
    }
    
    private void notifyObservers() {
        for (int count = 0; count < observers.size(); count++) {
            observer.get(count).update();
        }
    }
    
    private void announceWinner() {
        System.out.println(item.getName() + " was sold to " + highestBidder.getName() + " for $" + highestBid);
    }
    
    public double getHighestBid() {
        return highestBid;
    }
}