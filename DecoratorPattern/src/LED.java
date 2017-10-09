public class LED extends TreeDecorator {

	public LED(TreeDecorator decoratedTree) {
		super(decoratedTree);
	}

	public int getPrice() {
		return decoratedTree.getPrice() + 10;
	}
}