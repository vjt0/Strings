package manau;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class Mapping {

	public static void main(String[] args) {
		String [] str= {"vijay","piyush","piyush","kalu"};
		Map<String,Integer>map=new HashMap<String,Integer>();
		for(String s:str) {
			Integer count=map.get(s);
			if(count==null) {
				map.put(s, 1);
			}else {
				map.put(s, count+1);
			} 
		}
		
		Set<Entry<String,Integer>>display=map.entrySet();
		for(Entry<String,Integer> entry :display) {
		if (entry.getValue()>1) {
			System.out.println("Repating string is "+entry.getKey());
			
		}
			
		}

	}

}
