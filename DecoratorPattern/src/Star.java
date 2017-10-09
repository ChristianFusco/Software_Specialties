public class Star extends TreeDecorator {

	public Star(TreeDecorator decoratedTree) {
		super(decoratedTree);
		if (hasStarParent())
			System.out.println("!!Warning!!  A star already exists" +
							   " on this tree!  It will not be added.");
	}

	public int getPrice() {
		int price = 4;
		if(hasStarParent())
			price = 0;
		return decoratedTree.getPrice() + price;
	}

	private boolean hasStarParent() {
		TreeDecorator runner = decoratedTree;
		while(runner != null) {
			if(runner instanceof Star)
				return true;
			runner = runner.getParent();
		}
		return false;
	}
}