package uft.learn;

public class LinkListMethods {
	
	public int fact(int number) {
		if (number > 1) {
			return number * fact(number - 1);
		} else {
			return 1;
		}
	}
	
	public int facto(int number) {
		int total = 1;
		for (int i = 1; i <= number; i++) {
			total *= i; 
		}
		return total;
	}
	
	public static void main(String[] args) {
		LinkListMethods methods = new LinkListMethods();
		
		System.out.println(methods.fact(10));
		System.out.println(methods.facto(10));
		
//		Link head = null;
//		Link current = head;
//		
//		for (int i =  0; i < 5; i++) {
//			if (current == null) {
//				head = new Link(i*2);
//				current = head;
//			} else {
//				current.next = new Link(i*2);
//				current = current.next;
//			}
//		}
//		
//		current = head;
//		while (current != null) {
//			System.out.print(current.data);
//			current = current.next;
//		}
//		System.out.println(head.LinkCount());
		
//		LinkLister head = new LinkLister(0);
//		LinkLister current = head;
//		
//		for(int i = 0; i < 5; i++) {
//			System.out.println("Please input a number");
//			number = input.nextInt();
//			current.next = new LinkLister(number);
//			current = current.next;
//		}
//
//		current = head.next;
//		while (current != null) {
//			System.out.println(current.data);
//			current = current.next;
//		}
	}
}
