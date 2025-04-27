package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLists {
	public static void main(String args[]) {
		System.out.println("hello world");
		List <String> list=new ArrayList();
		System.out.println(list);
		
		List <String> list1= Arrays.asList("monday","tuesday","wednessday");
		System.out.println(list1);
		//list1.add("sunday");//this will give error because the Arrays.asList will return fixed size list so we can't 
		//add add and remove   elements in the list
		//list1.remove(0);// unsported operatoin
		System.out.println(list1.set(0, "sunday"));//it will return deleted value and new value will be replaced here
		String [] strs= {"apple","banana","cherry"};
		List <String> list2 = Arrays.asList(strs);
		
		
		List li=List.of(2,3,4,5,9);//this will return immutable list
		System.out.println(li);
		//li.set(0, 100);//UnsupportedOperationException because li is immutable
		
		List li1 =new ArrayList(li);
		System.out.println("this is mutable list "+li1);
		li1.add(200);
		System.out.println(li1);
		
		
		
		
		
	}

}
