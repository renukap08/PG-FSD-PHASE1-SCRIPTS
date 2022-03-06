package collections;

import java.util.Map;
//import java.util.Set;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> partList = new TreeMap<>();

		partList.put("s001", "Blue Polo Shirt");
		partList.put("s002", "Black Polo Shirt");
		partList.put("H001", "Duke Hat");

		partList.put("s002", "Black T-Shirt"); // overite value

//      Set<String> keys = partList.keySet();
//
//		for (String key : keys) {
//			System.out.println("Part#: " + key + " " + partList.get(key));
//		}

		for (Map.Entry<String, String> entry : partList.entrySet()) {
			System.out.println(entry.getKey() + "      " + entry.getValue());
		}
	}
 }
