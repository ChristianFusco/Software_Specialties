class WealthyBidder extends Bidder {
    
    public WealthyBidder(Auctioneer auctioneer, String name) {
        super(auctioneer, name);
    }
    
    public void bid() {
        if (checkBid()) {
            auctioneer.addBid(currentBid + 100, this);
        }
    }
}