public class BallsSilver extends TreeDecorator {

	public BallsSilver(TreeDecorator decoratedTree) {
		super(decoratedTree);
	}

	public int getPrice() {
		return decoratedTree.getPrice() + 3;
	}
}