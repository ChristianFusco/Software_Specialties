public class Ribbons extends TreeDecorator {

	public Ribbons(TreeDecorator decoratedTree) {
		super(decoratedTree);
	}

	public int getPrice() {
		return decoratedTree.getPrice() + 2;
	}
}