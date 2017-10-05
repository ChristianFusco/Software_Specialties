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