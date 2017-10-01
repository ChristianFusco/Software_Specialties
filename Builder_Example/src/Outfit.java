class Outfit {
    private String top;
    private String bottom;
    private String socks;
    private String shoes;
    private String jacket;
    
    public Outfit(String top, String bottom, String socks, String shoes, String jacket) {
        this.top = top;
        this.bottom = bottom;
        this.socks = socks;
        this.shoes = shoes;
        this.jacket = jacket;
    }
    
    public String toString() {
        return "Outfit:\n" + top + "\n" + bottom + "\n" + socks + "\n" + shoes + "\n" + jacket + "\n";
    }
}