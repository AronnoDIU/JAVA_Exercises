package JavaCollectionFramework.Maps;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

/**
 * 
 * @author Yeasir Arafat Aronno
 *
 */
public class LinkedHashMapDemo extends LinkedHashMap<Integer, String> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int capacity = 3;
	
	@Override
	public boolean removeEldestEntry(Entry<Integer, String> eldest) {
		if (size() > this.capacity) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		LinkedHashMapDemo map = new LinkedHashMapDemo();
		
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		
		System.out.println(map);
	}
}