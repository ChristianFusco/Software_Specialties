/*Author: Christian Fusco and Robin Shafto
Class: CSI-480-01/02
Assignment: Decorator Design Pattern
Date Assigned: 10/5/2017
Due Date: 10/12/2017

Description:
An example of the decorator design pattern using a Christmas Tree.

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

public class HelloWorld {
	public static void main(String[] args) {
		Tree myTree = new ColoradoBlueSpruce();
		myTree = new Star(myTree);		
		myTree = new Ruffles(myTree);
		myTree = new Star(myTree);
		myTree = new Ruffles(myTree);

		printtree(myTree);
	}

	private static void printtree(Tree tree) {
		double totalCost = tree.getPrice();
		ArrayList<String> names = new ArrayList<>();
		while(tree instanceof TreeDecorator) {
			names.add(tree.getName());
			tree = ((TreeDecorator)tree).getParent();
		}
		System.out.print(tree.getName() + " tree decorated with, ");
		for(int i = names.size() - 1; i > 0; i--) {
			if("".equals(names.get(i)))
				continue;
			System.out.print(names.get(i) + ", ");
		}
		if(names.size() > 0) {
			System.out.print("and " + names.get(0));	
		}
		System.out.println(" costs $" + totalCost + ".");
	}
}