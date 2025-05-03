package stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Main {
public static void main(String[] args) {
	System.out.println("hey Hello stack follows LIFO ");
	Stack<Integer> stack=new Stack<Integer>();
	stack.push(3);
	stack.push(5);
	stack.push(8);
	stack.push(8);
	stack.push(45);
	System.out.println(stack);//[3, 5, 8, 8, 45]
	System.out.println(stack.pop());//45 it will return removed element
	System.out.println(stack);//[3, 5, 8, 8]
	System.out.println(stack.peek());//it will return element at the top is 8
	System.out.println(stack.size());//4
	System.out.println(stack.isEmpty());//false
	
	stack.add(5);//this because stack internally inherits Vector thats why we can use methods of Vector  list and Collections
	System.out.println(stack);//[3, 5, 8, 8, 5]
	stack.add(1,56);//it will add the element in given index i.e 1 from bottom (left)
	System.out.println(stack);
	System.out.println(stack.search(56));//it will return the index of element from the top and 
	//search   start indexing from 1 not 0 so here it output will be 5 not 4
	
	
	
	// using linkedlist as a stack
	LinkedList<Integer> linkedList=new LinkedList<Integer>();
	linkedList.addLast(1);
	linkedList.addLast(4);
	linkedList.addLast(14);
	linkedList.addLast(43);
	System.out.println(linkedList);//[1, 4, 14, 43]
	System.out.println(linkedList.getLast());// 43 is equalant to peek that will give element at top(last)
	System.out.println(linkedList);//[1, 4, 14, 43]
	System.out.println(linkedList.removeLast());//43 is equalant to pop it will remove last(top) element and return removed element 
	System.out.println(linkedList);//[1, 4, 14, 43]
	//arraylist as stack
	ArrayList<Integer> arrayList=new ArrayList<Integer>();
	arrayList.add(1);//push
	arrayList.add(4);
	arrayList.add(45);
	arrayList.add(32);
	System.out.println(arrayList);//[1, 4, 45, 32]
	System.out.println(arrayList.get(arrayList.size()-1));//peek 32
	System.out.println(arrayList);//[1, 4, 45, 32]
	System.out.println(arrayList.removeLast());//32 pop
	System.out.println(arrayList);//[1, 4, 45]
	
	
	
	
	
}
}
