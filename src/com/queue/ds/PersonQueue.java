package com.queue.ds;

import com.stack.ds.Person;

public class PersonQueue { 
	int front, rear, size; 
	int capacity; 
	Person array[]; 
	
	public PersonQueue(int capacity) { 
		this.capacity = capacity; 
		front = this.size = 0; 
		rear = capacity - 1; 
		array = new Person[this.capacity]; 
			
	} 
	
	// Queue is full when size becomes equal to 
	// the capacity 
	boolean isFull(PersonQueue queue) 
	{ return (queue.size == queue.capacity); 
	} 
	
	// Queue is empty when size is 0 
	boolean isEmpty(PersonQueue queue) 
	{ return (queue.size == 0); } 
	
	// Method to add an item to the queue. 
	// It changes rear and size 
	void enqueue( Person item) 
	{ 
		if (isFull(this)) 
			return; 
		this.rear = (this.rear + 1)%this.capacity; 
		this.array[this.rear] = item; 
		this.size = this.size + 1; 
		System.out.println(item+ " enqueued to queue"); 
	} 
	
	// Method to remove an item from queue. 
	// It changes front and size 
	Person dequeue() 
	{ 
		if (isEmpty(this)) 
			return null; 
		
		Person item = this.array[this.front]; 
		this.front = (this.front + 1)%this.capacity; 
		this.size = this.size - 1; 
		return item; 
	} 
	
	// Method to get front of queue 
	Person front() 
	{ 
		if (isEmpty(this)) 
			return null; 
		
		return this.array[this.front]; 
	} 
		
	// Method to get rear of queue 
	Person rear() 
	{ 
		if (isEmpty(this)) 
			return null; 
		
		return this.array[this.rear]; 
	} 
}
