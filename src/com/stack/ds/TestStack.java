package com.stack.ds;

public class TestStack {

	public static void main(String[] args) {
//		IntStack intStack = new IntStack();
//		if(!intStack.isFull()) {
//			intStack.push(2);
//			intStack.push(4);
//			intStack.push(6);
//			intStack.push(8);
//		}
//		
//		System.out.println("Item popped : " + intStack.pop());
//		System.out.println("Item popped : " + intStack.pop());
		
		Person p1 = new Person("Guru", "123");
		Person p2 = new Person("Prasad", "456");
		Person p3 = new Person("Todur", "789");
		
		PersonStack personStack = new PersonStack();
		personStack.push(p1);
		personStack.push(p2);
		personStack.push(p3);
		
		System.out.println("Person popped : " + personStack.pop());
		System.out.println("Person popped : " + personStack.pop());
	}

}
