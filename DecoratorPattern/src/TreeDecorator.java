public abstract class TreeDecorator {
	TreeDecorator decoratedTree;

	public TreeDecorator(TreeDecorator decoratedTree) {
		this.decoratedTree = decoratedTree;
	}

	public abstract int getPrice();

	public TreeDecorator getParent() {
		return decoratedTree;
	}
}