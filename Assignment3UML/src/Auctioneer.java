/*Author: Robin Shafto and Christian Fusco
Class: CSI-480-01/02
Assignment: Assignment3 - Observer Pattern
Date Assigned: 9/28/2017
Due Date: 10/5/2017

Description:
An example of the observer/subject pattern using an auctioneer.  An auction is made and given an item, and then bidders try to win the item.  Each bidder has a unique strategy that either focuses on certain items, or stops bids past a certain point.

Certification of Authenticity: 
I certify that this is entirely my own work, except where I have given 
fully-documented references to the work of others. I understand the definition 
and consequences of plagiarism and acknowledge that the assessor of this 
assignment may, for the purpose of assessing this assignment:
- Reproduce this assignment and provide a copy to another member of academic
- staff; and/or Communicate a copy of this assignment to a plagiarism checking
- service (which may then retain a copy of this assignment on its database for
- the purpose of future plagiarism checking)
*/
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

    public String getItemName() {
        return item.getName();
    }
    
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    
    private boolean checkBid(double bid) {
        return (bid > item.getInitialPrice());
    }
    
    public void addBid(double bid, Bidder bidder) {
        counter++;
        if (checkBid(bid)) {
            if (bid > highestBid) {
                highestBid = bid;
                highestBidder = bidder;
                notifyObservers();
            }
        }
        if (counter == maxCounter) {
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