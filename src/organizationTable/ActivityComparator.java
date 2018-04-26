package organizationTable;

import java.util.Comparator;

public class ActivityComparator implements Comparator {

	public int compare(Activity atv, Activity atv1) {
		
		return atv.getDuration().compareTo(atv1.getDuration());
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
