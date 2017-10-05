abstract class Bidder extends Observer{
    protected double lastBid;
    protected double currentBid;
    protected Auctioneer auctioneer;
    private String name;
    
    public Bidder(Auctioneer auctioneer, String name) {
        this.auctioneeer = auctioneer;
        this.name = name;
    }
    
    public void update() {
        this.currentBid = auctioneer.getHighestBid();
    }
    
    public boolean checkBid() {
        return lastBid != currentBid;
    }
    
    public void bid();
    
    public String getName() {
        return name;
    }
}