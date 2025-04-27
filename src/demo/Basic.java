package demo;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Basic {
public static void main(String[] args)  {
	ArrayList<Integer> arr=new ArrayList();
	arr.add(2);
	arr.add(4);
	arr.add(23);
	arr.add(9);
	System.out.println(arr);
	System.out.println(arr.size());
	System.out.println(arr.remove(1));//it will return removed element
	System.out.println("arr = "+arr);
	List <Integer> li= new ArrayList<Integer>();;
	li.add(11);
	li.add(12);
	li.add(13);
	li.add(14);
	li.add(2);
	System.out.println("li = "+li);
	System.out.println(li.contains(11));
	System.out.println(li.get(3));
	li.add(2,400);//this will add elements at 2nd index and increse the size by 1
	System.out.println(li);
	li.set(3,600);//this will replace the element at 3rd index size will remain the same

	System.out.println("li = "+li);
	
	li.addAll( arr);
	System.out.println("li = "+li);
	
	Integer [] arr1=li.toArray(new Integer[0]);
	for(int i:arr1) {
		System.out.print(i +" ");
	}
	System.out.println();
	Collections.sort(li);
	System.out.println("li sorted"+li);
	
	
	  	 
}
}
