package com.day5.ex7.queue_examples;
import java.util.*;
public class A_DemoQueue {
	
	public static void main(String[] args) {
		
		//Default works as min heap
		
		PriorityQueue<Integer> queue=new PriorityQueue<>();
		
		//u can pass Comparator so that it can works as max heap
		
//		PriorityQueue<Integer> queue=new PriorityQueue<>(new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return Integer.compare(o2, o1);
//			}
//		});
		
		//offer method is used to add data to the priorirty queue
		//what is the diff bw queue.add(5550) and queue.offer(5550)
		//Ans : in case of PriorityQueue no difference
		//but in case of BlockingQueue there is a difference
		
		queue.offer(555);
		queue.offer(-5);
		queue.offer(5);
		queue.offer(95);
		
		//poll() vs remove()
		
//		System.out.println(queue.remove());
//		System.out.println(queue.remove());
//		System.out.println(queue.remove());
//		System.out.println(queue.remove());
//		
//		System.out.println(queue.remove());

		
		
		//poll vs remove ? write it yourself
		
//		System.out.println(queue.poll());
//		System.out.println(queue.poll());
//		System.out.println(queue.poll());
//		System.out.println(queue.poll());
		//System.out.println(queue.poll());
		
	}

}
