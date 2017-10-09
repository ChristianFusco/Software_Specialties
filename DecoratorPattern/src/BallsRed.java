public class BallsRed extends TreeDecorator {

	public BallsRed(TreeDecorator decoratedTree) {
		super(decoratedTree);
	}

	public int getPrice() {
		return decoratedTree.getPrice() + 1;
	}
}