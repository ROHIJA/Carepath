import java.util.HashMap;
import java.util.Map;

public class MapInterface {

	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap <Integer,String> ();
		map.put(101, "Rohit");
		map.put(102, "Atul");
		map.put(103, "Durgesh");
		map.put(104, "Avinash");
		
		for (Map.Entry m : map.entrySet()){
			System.out.println(m.getKey()  + " " + m.getValue());
			
		}
		//System.out.println(map.keySet());
		//System.out.println(map.entrySet());
		System.out.println(map.remove(103));
		System.out.println(map.values());
	}

}
