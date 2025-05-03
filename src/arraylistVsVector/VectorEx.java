package arraylistVsVector;


import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		System.out.println("this is vector");
		Vector<Integer> arr=new Vector<Integer>();
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

