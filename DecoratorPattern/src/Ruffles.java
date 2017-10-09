public class Ruffles extends TreeDecorator {

	public Ruffles(TreeDecorator decoratedTree) {
		super(decoratedTree);
	}

	public int getPrice() {
		return decoratedTree.getPrice() + 1;
	}
}