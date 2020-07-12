package week4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Week_4 {

	public static void main(String[] args) {
		
		//list of employee names
		List<String> employeeNames = new ArrayList<String>();
		employeeNames.add("Sarah");
		employeeNames.add("Noah");
		employeeNames.add("Maria");
		employeeNames.add("Evan");
		employeeNames.add("Monica");
		
		//set of employee ids
		Set<Integer> ids = new HashSet<Integer>();
		ids.add(1);
		ids.add(2);
		ids.add(3);
		ids.add(4);
		ids.add(5);
		
		//map of employee ids & names
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		
		int i = 0; 
		for(int id : ids) {
			employeeMap.put(id, employeeNames.get(i++));
		}
		System.out.println(employeeMap);
		
		int j = 0;
		for( int employee : employeeMap.keySet()) {
			String name = employeeNames.get(j++);
			System.out.println(employee + " = " + name);
		}
		
		StringBuilder idsBuilder = new StringBuilder();
		for(int id : ids) {
			idsBuilder.append(id + " - ");
		}
		
		System.out.println(idsBuilder.toString() );
		
		StringBuilder namesBuilder = new StringBuilder();
		for(String name : employeeNames) {
			namesBuilder.append(name + " ");
		}
		
		System.out.println(namesBuilder);
	}
}


//Notes:
// Lists - Allows duplicates, ordered
// Set - Does not allow duplicates, not ordered
// Map - Key Value pairs (dictionary)  key, value