import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class testArraylist {


	public static void main(String[] args) {


		ArrayList<String> myList = new ArrayList<String>();
		
		myList.add("first"); //0
		myList.add("first"); //1
		myList.add("third"); //2
		
		System.out.println(myList.get(2));
		System.out.println(myList.size());
		
		for(int i=0; i<myList.size(); i++){
			
			
			System.out.println(myList.get(i));
			
		}
		
		
		

		
		
		

	}

}
