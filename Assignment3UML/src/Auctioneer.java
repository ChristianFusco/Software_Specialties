import java.util.ArrayList;
class Auctioneer implements Subject {
    private Item item;
    private double highestBid;
    private int maxCounter;
    private int counter;
    private Bidder highestBidder;
    private ArrayList<Observer> observers;
    
    Auctioneer() {
        observers = new ArrayList<>();
        counter = 0;
        maxCounter = 0;
        highestBid = 0;
        highestBidder = null;
        item = null;
    }

    public double getCounter() {
        return counter;
    }
    
    public void setMaxCounter (int maxCounter) {
        this.maxCounter = maxCounter;
    }
    
    public void setItem(Item item) {
        this.item = item;
        highestBid = item.getInitialPrice();
    }
    
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    
    private boolean checkBid(double bid) {
        return (bid > item.getInitialPrice());
    }
    
    public void addBid(double bid, Bidder bidder) {
        if (checkBid(bid)) {
            counter ++;
            if (bid > highestBid) {
                highestBid = bid;
                highestBidder = bidder;
                notifyObservers();
            }
        }
        if (counter > maxCounter) {
            announceWinner();
        }
    }
    
    public void notifyObservers() {
        for (int count = 0; count < observers.size(); count++) {
            observers.get(count).update();
        }
    }
    
    public void announceWinner() {
        System.out.println(item.getName() + " was sold to " + highestBidder.getName() + " for $" + highestBid);
    }
    
    public double getHighestBid() {
        return highestBid;
    }
}