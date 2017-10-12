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
public class Star extends TreeDecorator {

	public Star(Tree decoratedTree) {
		super(decoratedTree);
		name = "Star";
		if (hasStarParent()) {
			System.out.println("!!Warning!!  A star already exists" +
							   " on this tree!  It will not be added.");
			name = "";
		}
	}

	public double getPrice() {
		int price = 4;
		if(hasStarParent())
			price = 0;
		return decoratedTree.getPrice() + price;
	}

	private boolean hasStarParent() {
		Tree runner = decoratedTree;
		while(runner instanceof TreeDecorator) {
			if(runner instanceof Star)
				return true;
			runner = ((TreeDecorator)runner).getParent();
		}
		return false;
	}
}