package com.gl.week2_1;

import java.util.PriorityQueue;

public class PriorityQueuePra {

	public static void main(String[] args) {
// FIFO
		PriorityQueue<Integer> prQueue = new PriorityQueue<>();
		prQueue.add(12);
		prQueue.add(17);
		prQueue.add(17);
		prQueue.add(11);
		// prQueue.add(null); null not allowed in priority queue
		prQueue.add(20);

		System.out.println(prQueue.toString());
		System.out.println(prQueue.peek());
	}

}
