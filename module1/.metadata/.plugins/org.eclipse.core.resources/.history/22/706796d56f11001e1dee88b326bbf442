package com.day7.session2.queue_examples;

import java.util.Comparator;
import java.util.PriorityQueue;

public class UserDefineObject {
	
	public static void main(String[] args) {
		PriorityQueue<JobWork> queue=new PriorityQueue<>(new Comparator<JobWork>() {

			@Override
			public int compare(JobWork o1, JobWork o2) {
				return Integer.compare(o2.getPriority(), o1.getPriority());
			}
		});
		queue.offer(new JobWork(12, "making die of tyre", 2));
		queue.offer(new JobWork(120, "making die of break", 1));
		queue.offer(new JobWork(12, "making die of head light", 4));
		
		
		System.out.println("--------------");
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}
	

}
