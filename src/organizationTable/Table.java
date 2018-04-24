package organizationTable;

import java.util.ArrayList;
import java.util.Collections;

public class Table {
	
	ArrayList<Activity> table = new ArrayList<Activity>();
	
	public Table() {
	}
	
	public void addActivity(String name, int duration, int priority) {
		Activity ex = new Activity(name, duration, priority);
		table.add(ex);
	}
	
	/*public ArrayList<Activity> orderPriority() {
		Collections.sort(table, (a,b) -> a.comparePriority(a, b));
		
		return table;
	}
	
	public ArrayList<Activity> orderDuration() {
		Collections.sort(table, (a,b) -> a.compareDuration(a, b));
		
		return table;
	}*/

	public int sizeTable() {
		return table.size();
	}
	
	public void printTable(ArrayList<Activity> table) {
		for (Activity activity : table) {
			System.out.println("Activity: " + activity.getName() + 
					"\nDuration: " + activity.getDuration() +
					"\nPriority: " + activity.getPriority());
		}
	}
}
