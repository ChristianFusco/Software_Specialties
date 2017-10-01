/*Author: Christian Fusco and Robin Shafto
Class: CSI-480-01/02
Assignment: Builder Pattern Pres
Date Assigned: xxx
Due Date: 10/5/2017

Description:
Sample builder code for our presentation.  Done by Robin.'

Certification of Authenticity: 
I certify that this is entirely my own work, except where I have given 
fully-documented references to the work of others. I understand the definition 
and consequences of plagiarism and acknowledge that the assessor of this 
assignment may, for the purpose of assessing this assignment:
- Reproduce this assignment and provide a copy to another member of academic
- staff; and/or Communicate a copy of this assignment to a plagiarism checking
- service (which may then retain a copy of this assignment on its database for
- the purpose of future plagiarism checking)
*/
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