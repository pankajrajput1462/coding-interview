package practice;

import java.util.HashMap;
import java.util.Map;

class Employe{
	
	private  String emp_name;
	private int emp_id;
	public Employe(String emp_name, int emp_id) {
		super();
		this.emp_name = emp_name;
		this.emp_id = emp_id;
	}
/*	@Override
	public int hashCode() {
	
		return 1;
	}
*/
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return true;
	}

}

public class CollectionPractice {

	public static void main(String[] args) {
		
	/*	Employe employe1 = new Employe("Pankaj", 23);
		Employe employe2 = new Employe("Panka", 23);
		Employe employe3 = new Employe("Pank", 33);
		
		Map<Employe, String> map = new HashMap<>();
		map.put(employe1,"New Employe One");
		//System.out.println(employe1.hashCode());
		map.put(employe2,"New  One");
		//System.out.println(employe2.hashCode());
		map.put(employe3," Employe One");
		//System.out.println(employe3.hashCode());
		
		System.out.println(map.size());*/

		String string = "abfghsherolll";
		String pattern = "hero";
		int i = bruteForeStringMatch(string, pattern);
		System.out.println(i);
	}

	private static int bruteForeStringMatch(String string, String pattern) {
		int strlen = string.length();
		int patlen = pattern.length();
		for (int i = 0; i < strlen-patlen ; i++) {
			int j=0;
			while (j<patlen&&pattern.charAt(i)!=string.charAt(i+j))
			{
				j++;
			}
			if (j==patlen)
				return i;

		}
		return -1;
	}


}
