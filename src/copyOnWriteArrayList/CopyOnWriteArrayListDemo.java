package copyOnWriteArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
public static void main(String[] args) {
	CopyOnWriteArrayList<Integer> list= new CopyOnWriteArrayList<Integer>();
	// "Copy on Write" means that whenever a write operation
	// like adding or removing an element
	// instead of directly modifying the existing list
	// a new copy of the list is created, and the modification is applied to that copy
	// This ensures that other threads reading the list while it's being modified are unaffected.
	// Read Operations: Fast and direct, since they happen on a stable list without interference from modifications.
	
	//is used write operations are less read operation are more
	
	//List <String> shoppinglist=new ArrayList<String>();//with will get ConcurrentModificationException
	List <String> shoppinglist=new CopyOnWriteArrayList<String>();
	shoppinglist.add("milk");
	shoppinglist.add("eggs");
	shoppinglist.add("Bread");
	System.out.println("inital shoppling List  : "+shoppinglist);
	
	for(String item:shoppinglist) {
		System.out.println(item);
		if(item.equals("eggs")) {
			shoppinglist.add("butter");
			System.out.println("Added butter while Reading. ");
			
		}
		System.out.println("updated shopping list : "+shoppinglist);
	}
	
	
	
}
}
//output 
//inital shoppling List  : [milk, eggs, Bread]
//milk
//updated shopping list : [milk, eggs, Bread]
//eggs
//Added butter while Reading. 
//updated shopping list : [milk, eggs, Bread, butter]
//Bread
//updated shopping list : [milk, eggs, Bread, butter]




