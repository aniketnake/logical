
package LogicalProgramming;

import java.lang.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ElectoralVotingBallot {

	public static void findWinner(String votes[]) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String str : votes) {
			if (map.keySet().contains(str))
				map.put(str, map.get(str) + 1);
			else
				map.put(str, 1);
		}

		int maxValueInMap = 0;
		String winner = " ";
		Map.Entry<String, Integer> entry;
		for (Entry<String, Integer> entry1 : map.entrySet()) {
			String key = entry1.getKey();
			Integer val = entry1.getValue();
			if (val > maxValueInMap) {
				maxValueInMap = val;
				winner = key;
			}

			else if (val == maxValueInMap && winner.compareTo(key) > 0)
				winner = key;
		}
		System.out.println("Winning Candidate is :" + winner);
	}

	public static void main(String[] args) {
		String[] votes = { "john", "johnny", "jackie", "johnny", "john", "jackie", "jamie", "jamie", "john", "johnny",
				"jamie", "johnny", "john" };
		findWinner(votes);
	}

}
