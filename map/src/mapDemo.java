import java.util.*;
public class mapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"raj");    
	      hm.put(2,"gan");    
	      hm.put(3,"anju");   
	       
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry m:hm.entrySet()) {    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }

	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"manju");  
	      ht.put(5,"akhil");  
	      ht.put(6,"nehru");  
	      ht.put(7,"sita");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"brad");    
	      map.put(9,"ben");    
	      map.put(10,"chotu");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    


}

}
