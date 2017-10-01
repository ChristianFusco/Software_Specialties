class OutfitBuilder {
    protected String top;
    protected String bottom;
    protected String socks;
    protected String shoes;
    protected String jacket;
    
    public OutfitBuilder() {
        top = "no top";
        bottom = "no bottom";
        socks = "no socks";
        shoes = "no shoes";
        jacket = "no jacket";
    }

    public OutfitBuilder setTop(String top) {
        this.top = top;
        return this;
    }
    
    public OutfitBuilder setBottom(String bottom) {
        this.bottom = bottom;
        return this;
    }
    
    public OutfitBuilder setSocks(String socks) {
        this.socks = socks;
        return this;
    }

    public OutfitBuilder setShoes(String shoes) {
        this.shoes = shoes;
        return this;
    }
    
    public OutfitBuilder setJacket(String jacket) {
        this.jacket = jacket;
        return this;
    }
    
    public Outfit buildOutfit() {
        return new Outfit(top, bottom, socks, shoes, jacket);
    }
}