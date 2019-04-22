package uft.learn;

public class BinaryTree {
	int data;
	BinaryTree left;
	BinaryTree right;
	
	BinaryTree(int number){
		data = number;
	}
	
	void addLeaf(int number){
		if(number < data) {
			if(this.left == null) {
				this.left = new BinaryTree(number);
			} else {
				left.addLeaf(number);
			}
		} else if (number > data) {
			if(this.right == null) {
				this.right = new BinaryTree(number);
			} else {
				right.addLeaf(number);
			}
		} 
	}
	
	void printer() {
		if(left != null) {
			left.printer();
		}
		System.out.println(data);
		if(right != null) {
			right.printer();
		}
	}
	
	boolean finder(int number) {
		System.out.print("->"+data);
		if (data == number) {
			return true;
		} else if (number < data && left != null) {
			return left.finder(number);
		} else if (number > data && right != null) {
			return right.finder(number);
		}
		return false;
	}
}
