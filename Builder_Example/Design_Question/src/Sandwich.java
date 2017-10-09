import java.util.ArrayList;

class Sandwich {
    protected String name;
    protected String bread;
    protected ArrayList<String> contents;
    
    public Sandwich(String name, String bread, ArrayList<String> contents) {
        this.name = name;
        this.bread = bread;
        this.contents = contents;
    }
    
    public String toString() {
        String out = "A " + name + " Sandwich with ";
        if (contents.size() == 0) {
            out += "nothing ";
        }
        for(int i = 0; i < contents.size() - 1; i++) {
            out += contents.get(i) + ", ";
        }
        if (contents.size() > 0) 
            out += "and " + contents.get(contents.size() - 1) + " ";
        return out + "on a " + bread + ".";
    }
}
