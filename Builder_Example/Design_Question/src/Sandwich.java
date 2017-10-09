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
        String out = "A " + name + " sandwich with ";
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
