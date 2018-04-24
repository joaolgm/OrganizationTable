package organizationTable;

import java.util.Comparator;

public class Activity implements Comparator {
	
	String name;
	int duration, priority;
	
	public Activity(String name, int duration, int priority) {
		this.name = name;
		this.duration = duration;
		this.priority = priority;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public int comparePriority(Activity atv, Activity atv1) {
		if (atv.getPriority() > atv1.getPriority())
			return 1;
		else if (atv.getPriority() < atv1.getPriority())
			return 0;
		else {
			if(atv.getDuration() > atv1.getDuration())
				return 0;
			else
				return 1;
		}
	}
	
	public int compareDuration(Activity atv, Activity atv1) {
		if (atv.getDuration() > atv1.getDuration())
			return 0;
		else if (atv.getDuration() < atv1.getDuration())
			return 1;
		else {
			if(atv.getPriority() > atv1.getPriority())
				return 1;
			else
				return 0;
		}
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
