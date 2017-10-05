class CheapBidder extends Bidder {
    
    public CheapBidder(Auctioneer auctioneer, String name) {
        super(auctioneer, name);
    }
    
    public void bid() {
        if (checkBid() && currentBid < 500) {
       		auctioneer.addBid(currentBid + 10, this);
        }
    }
}