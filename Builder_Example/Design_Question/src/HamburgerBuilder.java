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
class HamburgerBuilder extends SandwichBuilder{
    public HamburgerBuilder() {
        super();
        name = "hamburger";
        bread = "seeded bun";
        addContents("beef patty");
        addContents("lettuce");
        addContents("tomato");
        addContents("onion");
    }
}