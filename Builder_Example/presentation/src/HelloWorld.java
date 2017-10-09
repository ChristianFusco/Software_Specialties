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
public class HelloWorld {
     public static void main(String []args) {
        //This is too hard and so inflexible. If only there were a better way!
        Outfit outfit1 = new Outfit("blue shirt", "jeans", "wooly socks", "boots", "leather jacket");
        System.out.println(outfit1);
        
        //Now with the builder pattern, I can enter the variables in any order!
        OutfitBuilder outfitBuilder = new OutfitBuilder();
        //Because the setters return the builder object, I can chain them!
        outfitBuilder.setTop("tank top").setShoes("sandals");
        Outfit outfit2 = outfitBuilder.buildOutfit();
        //It's that easy!
        System.out.println(outfit2);
        
        //I can even make different kinds of outfit builders that will generate objects according to their own instructions!
        OutfitBuilder winterBuilder = new WinterBuilder();
        Outfit outfit3 = winterBuilder.buildOutfit();
        //My life will never be the same!
        System.out.println(outfit3);
     }
}
