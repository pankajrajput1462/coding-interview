package designPattern.create.singleton;

public class SingletonStaticBlock {

	private static SingletonStaticBlock singletonStaticBlock;

	private SingletonStaticBlock() {
	}

	static {
		singletonStaticBlock = new SingletonStaticBlock();
	}

	public static SingletonStaticBlock getInSingletonStaticBlock() {
		return singletonStaticBlock;

	}

}
