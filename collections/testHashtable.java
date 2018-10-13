import java.util.Hashtable;


public class testHashtable {


	public static void main(String[] args) {


		Hashtable<String,String> ht = new Hashtable<String,String>();
		ht.put("name", "Raman");
		ht.put("location", "Delhi");
		ht.put("course", "Selenium");
		
		System.out.println(ht.get("location"));
		
		ht.put("course", "QTP");
		
		System.out.println(ht.get("course"));
		
		
	}

}
