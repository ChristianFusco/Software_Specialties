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
public class HelloWorld {
    public static void main(String []args) {
        SandwichBuilder boring = new SandwichBuilder();
        Sandwich sandwich = boring.build();
        System.out.println("\n\n\n" + sandwich.toString() + "\n");

        SandwichBuilder moreFun = new SandwichBuilder();
        moreFun.setName("The Usual")
               .setBread("wheat roll")
               .addContents("ham")
               .addContents("mayo")
               .addContents("cheese");
        sandwich = moreFun.build();

        SandwichBuilder burger = new HamburgerBuilder();
        System.out.println(burger.build().toString() + "\n");

        SandwichBuilder cheeseBurger = new HamburgerBuilder();
        cheeseBurger.addContents("cheese");
        System.out.println(cheeseBurger.build().toString() + "\n");

        SandwichBuilder hotDog = new HotDogBuilder();
        System.out.println(hotDog.build().toString() + "\n");
    }
}