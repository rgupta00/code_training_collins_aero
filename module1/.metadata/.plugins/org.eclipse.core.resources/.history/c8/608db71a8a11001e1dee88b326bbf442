package com.day7.session2.queue_examples;
import java.util.*;
public class A_DemoQueue {
	
	public static void main(String[] args) {
		PriorityQueue<Integer> queue=new PriorityQueue<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return Integer.compare(o2, o1);
			}
		});
		//System.out.println(queue.isEmpty());
		queue.offer(555);
		queue.offer(-5);
		queue.offer(5);
		queue.offer(95);
		//System.out.println(queue.isEmpty());
		//System.out.println(queue.peek());
		
		
//		System.out.println(queue.poll());
//		System.out.println(queue.poll());
//		System.out.println(queue.poll());
//		System.out.println(queue.poll());
		
		//dont iterate like this
		
//		Iterator<Integer> it=queue.iterator();
//		while(it.hasNext()) {
//			System.out.print(it.next()+"=>");
//		}
//		
		//how to iterate through queue if u want data sorted
		
		PriorityQueue<Integer> queue2=new PriorityQueue<>(queue);
		
		while(!queue.isEmpty()) {
			System.out.print(queue.poll()+"==>");
		}
		

	}

}
