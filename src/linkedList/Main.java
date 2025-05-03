package linkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		LinkedList<Integer> linkedList=new LinkedList<Integer>();
		linkedList.add(20);
		linkedList.add(30);
		linkedList.add(50);
		System.out.println(linkedList);//[20, 30, 50]
		System.out.println(linkedList.get(2));//will give element at 2nd index 50
		linkedList.addFirst(100);
		System.out.println(linkedList);//[100, 20, 30, 50]
		linkedList.addLast(501);
		System.out.println(linkedList);//[100, 20, 30, 50, 501]
		System.out.println(linkedList.add(456));//true
		System.out.println(linkedList);//[100, 20, 30, 50, 501, 456]
		linkedList.add(2,243);
		System.out.println(linkedList);//[100, 20, 243, 30, 50, 501, 456]
		linkedList.remove(2);
		System.out.println(linkedList);//[100, 20, 30, 50, 501, 456]
		linkedList.remove();//removes first element in linkedlist
		System.out.println(linkedList);//[20, 30, 50, 501, 456]
		System.out.println(linkedList.removeIf(x-> x%2==0));//true
		System.out.println(linkedList);//[501]
		
		LinkedList<String> animals=new LinkedList<String>(Arrays.asList("Cat","dog","elephant","tiger"));
		System.out.println(animals);//[Cat, dog, elephant, tiger]
		
		LinkedList<String> animalsToRemove=new LinkedList<String>(Arrays.asList("Cat","dog"));
		System.out.println(animalsToRemove);//[Cat, dog]
		System.out.println(animals.removeAll(animalsToRemove));//true
		System.out.println(animals);//[elephant, tiger]
		
		
		System.out.println(animals.isEmpty());//false
		animals.clear();
		System.out.println(animals);//[]
		System.out.println(animals.isEmpty());//true
	}
}
