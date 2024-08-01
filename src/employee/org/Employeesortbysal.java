package employee.org;
import java.util.*;

public class Employeesortbysal implements Comparator {
	

	@Override
	public int compare(Object o1, Object o2) {
		employeeinfo e1 = (employeeinfo) o1;
		employeeinfo e2 = (employeeinfo) o2;
		if (e1.getSal() > e2.getSal()) {
			return 1;
		} else if (e1.getSal() < e2.getSal()) {
			return -1;
		} else {
			return 0;
		}

	}
}

