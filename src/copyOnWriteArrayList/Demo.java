package copyOnWriteArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Demo {
	public static void main(String[] args) {
		
	
//	List<String> list=new ArrayList<String>();//java.util.ConcurrentModificationException
		List<String> list=new CopyOnWriteArrayList<String>();
	list.add("item1");
	list.add("item2");
	list.add("item3");
	list.add("item4");
	
	Thread readerThread=new Thread(()->{
		try {
			while(true) {
				//iterate through list
				for(String item:list) {
					System.out.println("Reading item : "+item);
					Thread.sleep(100);//small delay to simulate work
				}
			}
		}catch (Exception e) {
			System.out.println("exception in reader thread "+e);
			// TODO: handle exception
		}
		
	});
	
	Thread writerThread=new Thread(()->{
			try {
				Thread.sleep(500);
				list.add("item4");
				System.out.println("Added item 4 to the list ");
				
				Thread.sleep(500);
				list.add("item1");
				System.out.println("Added item 1 to the list ");
				
			} catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}
		});
	readerThread.start();
	writerThread.start();
	}
	
	
	}	

