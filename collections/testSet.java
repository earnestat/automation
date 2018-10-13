import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class testSet {


	public static void main(String[] args) {


		Set<Integer> set = new HashSet<Integer>();
		
		set.add(1);
		set.add(1);
		set.add(3);
		
		Iterator<Integer> itrate = set.iterator();
		
		while(itrate.hasNext()){
			
			System.out.println(itrate.next());
			
		}
		
	}

}
