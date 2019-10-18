package Oct_thirteen;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurence {

	public static void main(String[] args) {

		String str = "shivaji";

		Map<Object, Object> map = new HashMap<>();
		for (char ch : str.toCharArray()) {
			
			if(map.containsKey(ch))
			{
			  Integer i = (Integer) map.get(ch);
			  map.put(ch, ++i);
			}
			else {
				map.put(ch,1);
			}
		}
		System.out.println(map);
	}
}