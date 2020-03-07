package com.stack.ds;

public class PersonStack {
	
	private Person [] stack;
	private int top;
	private int size;
	
	public PersonStack() {
		top = -1;
		size = 50;
		stack = new Person [50];
	}

	public PersonStack(int size) {
		top = -1;
		this.size = size;
		stack = new Person [size];
	}
	
	public boolean push(Person item) {
		if(!isFull()) {
			top++;
			stack[top] = item;
			return true;
		} else {
			return false;
		}
			
		
	}
	
	public boolean isFull() {
		return (top == stack.length - 1);
	}
	
	
	public Person pop() {
		return stack[top--];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	Person peek() 
    { 
        if (top < 0) { 
            System.out.println("Stack Underflow"); 
            return null; 
        } 
        else { 
            Person x = stack[top]; 
            return x; 
        } 
    }

}
