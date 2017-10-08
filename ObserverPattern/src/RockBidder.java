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
class RockBidder extends Bidder {
    
    public RockBidder(Auctioneer auctioneer, String name) {
        super(auctioneer, name);
    }
    
    public void bid() {
        if (!checkBid())
            return;
        if (auctioneer.getItemName().contains("Rock")) {
            auctioneer.addBid(currentBid + 200, this);
        }
    	else if (currentBid < 500){
    		auctioneer.addBid(currentBid + 10, this);
    	}
    }
}