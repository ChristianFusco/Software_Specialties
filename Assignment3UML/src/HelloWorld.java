public class HelloWorld{
    public static void main(String args[]){
        int totalRounds = 10;
        Item rock = new Item(3.5, "pet rock");
        Auctioneer auctioneer = new Auctioneer();
        WealthyBidder chauncy = new WealthyBidder(auctioneer, "Chauncy");
        auctioneer.addObserver(chauncy);
        auctioneer.setMaxCounter(totalRounds);
        auctioneer.setItem(rock);
        while (auctioneer.getCounter() < totalRounds) {
            chauncy.bid();
        }
        auctioneer.announceWinner();
    }
    
}
