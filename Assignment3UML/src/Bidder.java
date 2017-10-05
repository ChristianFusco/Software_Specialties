abstract class Bidder extends Observer{
    protected double lastBid;
    protected double currentBid;
    protected Auctioneer auctioneer;
    private String name;
    
    public Bidder(Auctioneer auctioneer, String name) {
        this.auctioneer = auctioneer;
        this.name = name;
    }
    
    public void update() {
        this.currentBid = auctioneer.getHighestBid();
    }
    
    public boolean checkBid() {
        return lastBid != currentBid;
    }
    
    abstract void bid();
    
    public String getName() {
        return name;
    }
}