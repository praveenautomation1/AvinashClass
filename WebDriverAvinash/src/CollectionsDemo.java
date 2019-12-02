import java.util.ArrayList;
import java.util.Iterator;

public class CollectionsDemo {

public static void main(String[] args) {
	
	ArrayList<String> al = new ArrayList<String>();
	
	al.add("qap1");
	al.add("qap2");
	al.add("qap3");
	al.add("qap4");
	al.add("qap5");
	
/*	// to print values from arraylist 
	
	System.out.println(al.get(2));
	System.out.println(al.get(4));
	
	// to get size of the of al
	System.out.println(al.size());

*/	
	
// print all values using iterator
	
	Iterator <String> it =al.iterator();
	
	while(it.hasNext()){
		
		String value = it.next();
		System.out.println(value);
	}
	
	
	
	// using for each loop 
	for (String E:al){
		
		System.out.println(E);
	}
	
	// using for loop 
	
	for (int i=0;i<al.size();i++){
		
		System.out.println(al.get(i));
		
	}
		
	

	
}


}
