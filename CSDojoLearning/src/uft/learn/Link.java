package uft.learn;

public class Link {
	int data;
	Link next;
	Link(int d){
		data = d;
	}
	
	public int LinkCount() {
		int number = 0;
		Link current = this;
		while (current != null) {
			number += 1;
			current = current.next;
		}
		return number;
	}
}
