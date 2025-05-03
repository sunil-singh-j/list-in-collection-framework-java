package vector;

import java.util.LinkedList;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<Integer> vector=new Vector<Integer>();
		vector.add(56);
		vector.add(34);
		vector.add(12);
		System.out.println(vector);//[56, 34, 12]
		System.out.println(vector.capacity());//10
		System.out.println(vector.size());
		Vector<Integer> customCapcityVector=new Vector<Integer>(5,3);//this will create a vector with initial
		//capcity to 5 and as the size of vector reaches current capacity it is increased by 3 
		System.out.println(customCapcityVector.capacity());//5
		System.out.println(customCapcityVector.add(23));//true
		customCapcityVector.add(1);
		customCapcityVector.add(4);
		customCapcityVector.add(32);
		customCapcityVector.add(45);
		System.out.println(customCapcityVector);//[23, 1, 4, 32, 45]
		System.out.println(customCapcityVector.capacity());//5
		System.out.println(customCapcityVector.size());//5
		customCapcityVector.add(4654);
		System.out.println(customCapcityVector.capacity());//8
		System.out.println(customCapcityVector.size());//6
		
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(4);
		list.add(54);
		list.add(21);
		System.out.println(list);//[4, 54, 21]
		Vector<Integer> vectorFormCollection =new Vector<Integer>(list);
		System.out.println(vectorFormCollection);//[4, 54, 21]
		System.out.println(vectorFormCollection.isEmpty());//false
		vectorFormCollection.clear();
		System.out.println(vectorFormCollection);//[]
		System.out.println(vectorFormCollection.isEmpty());//true
		System.out.println(list.isEmpty());//false
		
		
	}

}
