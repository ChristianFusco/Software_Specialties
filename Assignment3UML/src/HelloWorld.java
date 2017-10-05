public class HelloWorld{
    public static void main(String args[]){
        int totalRounds;
        Item rock = new Item(3.5, "pet rock");
        Auctioneer auctioneer = new Auctioneer();
        Observer chauncy = new WealthyBidder(auctioneer, "Chauncy");
        auctioneer.addObserver(chauncy);
        auctioneer.setMaxCounter(totalRounds);
        while (auctioneer.getCounter() < totalRounds) {
            chauncy.bid();
        }
    }
    
}
