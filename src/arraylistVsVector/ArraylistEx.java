package arraylistVsVector;

import java.util.ArrayList;

public class ArraylistEx {
	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		Thread t1 =new Thread(()->{
			for(int i=0;i<1000;i++) {
				arr.add(i);
				
			}
		});
		Thread t2 =new Thread(()->{
			for(int i=0;i<1000;i++) {
				arr.add(i);
				
			}
		});
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("size of arr : "+arr.size());//size of arr : 1242 here output will  vary 
	}
}
