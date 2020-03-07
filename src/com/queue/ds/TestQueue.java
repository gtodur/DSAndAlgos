package com.queue.ds;

import com.stack.ds.Person;

public class TestQueue {

	public static void main(String[] args) {
		IntQueue intQueue = new IntQueue(50);
		intQueue.enqueue(2);
		intQueue.enqueue(4);
		intQueue.enqueue(6);
		intQueue.enqueue(8);
		
//		System.out.println("Item dequeued : " + intQueue.dequeue());
//		System.out.println("Item dequeued : " + intQueue.dequeue());
//		System.out.println("Item dequeued : " + intQueue.dequeue());;
		
		PersonQueue personqueue = new PersonQueue(50);
		personqueue.enqueue(new Person("Guru", "123"));
		personqueue.enqueue(new Person("Prasad", "456"));
		personqueue.enqueue(new Person("Todur", "789"));
		
		System.out.println("Person popped from queue : " + personqueue.dequeue());
	}

}
