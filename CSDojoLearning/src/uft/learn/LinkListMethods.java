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
	
	public int fib(int number) {
		if (number <= 1) return number;
		return fib(number-1) + fib(number-2);
	}
	
	public int frogSteps(int number) {
		if (number <= 2) return number;
		return fib(number-1) + fib(number-2);
	}
	
	public int fibo(int number) {
		if (number >= 3) {
			return fib(number-1) + fib(number-2);
		} else {
			return 1;
		}
	}
	
	public static void main(String[] args) {
		LinkListMethods methods = new LinkListMethods();
		
		Link head = null;
		Link current = head;
		for (int i = 0; i < 10; i++) {
			if(head == null) {
				head = new Link(i*2);
				current = head;
			} else {
				current.next = new Link(i*2);
				current = current.next;
			}
		}
		
//		current = null;
//		Link current2 = head;
//		while (current2 != null) {
//			if (current == null) {
//				current2.next = current;
//				current = current2;
//				current2 = head.next.next;
//			} else {
//			System.out.println(current.data);
//			current.next.next = current;
//			current = current2;
//			current2 = current2.next;
//			}
//		}
//		head = current;
		
		current = head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
		
		Link front = null;
		current = head;
		Link back;
		
		while(current != null) {
			back = current.next;
			current.next = front;
			front = current;
			if (back == null) {
				head = current;
				break;
			}
			current = back;
		}
		
		
		
		current = head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
		
		
		
		System.out.println(methods.fact(10));
		System.out.println(methods.facto(10));
		System.out.println(methods.fib(5));
		System.out.println(methods.frogSteps(5));
		
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
