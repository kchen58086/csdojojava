package uft.learn;

public class TreeTester {

	public static void main(String[] args) {
		BinaryTree root = new BinaryTree(50);
		
		for (int i = 1; i <= 30; i++) {
			int randNum = (int) (Math.random() * 100) + 1;
			
			root.addLeaf(randNum);
		}
		
		root.printer();
		
		System.out.print(root.finder(10));
	}

}
