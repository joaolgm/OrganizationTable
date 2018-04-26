package organizationTable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Table implements Comparable{
	
	List<Activity> table = new ArrayList<Activity>();
	
	public Table() {
	}
	
	public void addActivity(String name, int duration, int priority) {
		Activity ex = new Activity(name, duration, priority);
		table.add(ex);
	}
	
	public ArrayList<Activity> orderPriority() {
		Collections.sort(table);
		
		return (ArrayList<Activity>) table;
	}
	
	public ArrayList<Activity> orderDuration() {
		Collections.sort(table);
		
		return (ArrayList<Activity>) table;
	}

	public int sizeTable() {
		return table.size();
	}
	
	public void printTable(ArrayList<Activity> table) {
		for (Activity activity : table) {
			System.out.println("Activity: " + activity.getName() + 
					"\nDuration: " + activity.getDuration() +
					"\nPriority: " + activity.getPriority() + 
					System.lineSeparator());
		}
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
