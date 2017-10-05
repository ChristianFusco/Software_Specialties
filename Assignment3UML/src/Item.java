class Item {
    private double initialPrice;
    private String name;
    
    
    public Item(double initialPrice, String name) {
        this.initialPrice = initialPrice;
        this.name = name;
    }
    
    public double getInitialPrice() {
        return initialPrice;
    }
    
    public String getName() {
        return name;
    }
}