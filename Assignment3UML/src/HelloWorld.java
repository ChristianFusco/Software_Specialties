import java.util.ArrayList;

public class HelloWorld{
    public static void main(String args[]){
        int totalRounds = 10;

        Item rock = new Item(3.5, "Pet Rock");
        Auctioneer auctioneer = new Auctioneer();
        auctioneer.setMaxCounter(totalRounds);
        auctioneer.setItem(rock);
        
        ArrayList<Bidder> bidders = new ArrayList<>();
        bidders.add(new WealthyBidder(auctioneer, "Chauncy"));
        bidders.add(new CheapBidder(auctioneer, "Steve"));
        bidders.add(new RockBidder(auctioneer, "Rocko"));

        for (Bidder bidder : bidders) {
            auctioneer.addObserver(bidder);
        }

        while (auctioneer.getCounter() < totalRounds) {
            for (Bidder bidder : bidders) {
                bidder.bid();
            }
        }
        totalRounds = 15;
        Item thing = new Item(50, "Really Shiny Thing");
        auctioneer = new Auctioneer();
        auctioneer.setMaxCounter(totalRounds);
        auctioneer.setItem(thing);
        bidders = new ArrayList<>();
        bidders.add(new WealthyBidder(auctioneer, "Chauncy"));
        bidders.add(new CheapBidder(auctioneer, "Steve"));
        bidders.add(new RockBidder(auctioneer, "Rocko"));

        for (Bidder bidder : bidders) {
            auctioneer.addObserver(bidder);
        }
        
        while (auctioneer.getCounter() < totalRounds) {
            for (Bidder bidder : bidders) {
                bidder.bid();
            }
        }

        totalRounds = 17;
        Item shinyRock = new Item(80, "Really Shiny Rock");
        auctioneer = new Auctioneer();
        auctioneer.setMaxCounter(totalRounds);
        auctioneer.setItem(shinyRock);
        bidders = new ArrayList<>();
        bidders.add(new WealthyBidder(auctioneer, "Chauncy"));
        bidders.add(new CheapBidder(auctioneer, "Steve"));
        bidders.add(new RockBidder(auctioneer, "Rocko"));

        for (Bidder bidder : bidders) {
            auctioneer.addObserver(bidder);
        }
        
        while (auctioneer.getCounter() < totalRounds) {
            for (Bidder bidder : bidders) {
                bidder.bid();
            }
        }      
    }
}
