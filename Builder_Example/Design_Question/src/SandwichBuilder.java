/*Author: Christian Fusco and Robin Shafto
Class: CSI-480-01/02
Assignment: Builder Presentation
Date Assigned: ???
Due Date: 10/5/2017

Description:
Updated presentation with example code for a class assignment.  A hotdog is a sandwich. Builder example.

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