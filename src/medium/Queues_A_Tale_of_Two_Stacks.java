package medium;

import java.util.Scanner;
import java.util.Stack;

public class Queues_A_Tale_of_Two_Stacks {
	
	public static void main(String[] args) {
		MyQueue<Integer> queue = new MyQueue<>();
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for (int i = 0; i < n; i++) {
			int operation = scan.nextInt();
			if (operation == 1) { // enqueue
				queue.enqueue(scan.nextInt());
			} else if (operation == 2) { // dequeue
				queue.dequeue();
			} else if (operation == 3) { // print/peek
				System.out.println(queue.peek());
			}
		}
		scan.close();
	}
	
	private static class MyQueue<T> {
		private Stack<T> reverse = new Stack<>();
		private Stack<T> normal = new Stack<>();
		
		public void enqueue(T nextInt) {
			reverse.push(nextInt);
		}
		
		public void dequeue() {
			if (normal.isEmpty()) {
				reverseToNormal();
			}
			normal.pop();
		}
		
		
		public T peek() {
			if (normal.isEmpty()) {
				reverseToNormal();
			}
			return normal.peek();
		}
		
		private void reverseToNormal() {
			while (!reverse.isEmpty()) {
				normal.push(reverse.pop());
			}
		}
	}
}
