import java.util.ArrayList;

class SandwichBuilder {
    protected String name;
    protected String bread;
    protected ArrayList<String> contents;

    public SandwichBuilder() {
        name = "unnamed";
        bread = "white bread";
        contents = new ArrayList<>();
    }

    public SandwichBuilder setName(String name) {
        this.name = name;
        return this;
    }
    
    public SandwichBuilder setBread(String bread) {
        this.bread = bread;
        return this;
    }

    public SandwichBuilder setContents(ArrayList<String> contents) {
        this.contents = contents;
        return this;
    }

    public SandwichBuilder addContents(String content) {
        contents.add(content);
        return this;
    }

    public Sandwich build() {
    	return new Sandwich(name, bread, contents);
    }
}