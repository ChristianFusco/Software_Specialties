public class BallsBlue extends TreeDecorator {

	public BallsBlue(TreeDecorator decoratedTree) {
		super(decoratedTree);
	}

	public int getPrice() {
		return decoratedTree.getPrice() + 2;
	}
}