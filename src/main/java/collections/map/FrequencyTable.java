package collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FrequencyTable {

	
	
	public static void main(String[] args) {
		frequencyByHashMap();
		frequencyByTreeMap();
	}

	

	private static void frequencyByHashMap() {
		Map<String, Integer> m = new HashMap<String, Integer>();

		String line="if it is to be it is up to me to delegate";
		String[] list = line.split(" ");
		
		// Initialize frequency table from command line
		for (String a : list) {
			Integer freq = m.get(a);
			m.put(a, (freq == null) ? 1 : freq + 1);
		}

		System.out.println(m.size() + " distinct words:");
		System.out.println(m);
	}

	private static void frequencyByTreeMap() {
		Map<String, Integer> m = new TreeMap<String, Integer>();

		String line="if it is to be it is up to me to delegate";
		String[] list = line.split(" ");
		
		// Initialize frequency table from command line
		for (String a : list) {
			Integer freq = m.get(a);
			m.put(a, (freq == null) ? 1 : freq + 1);
		}

		System.out.println(m.size() + " distinct words:");
		System.out.println(m);
	}

	
}
