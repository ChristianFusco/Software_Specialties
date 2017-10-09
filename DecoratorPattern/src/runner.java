public class runner {
	public static void main(String[] args) {
		TreeDecorator myTree = new ColoradoBlueSpruce();
		myTree = new Star(myTree);		
		myTree = new Ruffles(myTree);
		myTree = new Star(myTree);
		myTree = new Ruffles(myTree);

		System.out.println(myTree.getPrice());
	}
}