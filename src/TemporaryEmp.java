public class TemporaryEmp extends Employee {

	// initializing number of leave variable

	int no_of_leaves;

	// initializing parameterized constructor

	TemporaryEmp(int empId, String empName, int total_leaves, double total_Salary) {

		super(empId, empName, total_leaves, total_Salary);
		// calling abstract parent class constructor

	}

	@Override
	void calculate_balance_leaves() {
		// initializing balance leave variable

		int balance_leaves = total_leaves - no_of_leaves;

		System.out.println("Balance leave for " + empName + " is " + balance_leaves);
		// prints Balance leave for employee name is balance leave

	}

	@Override
	boolean avail_leave(int no_of_leaves, char type_of_leave) {
		this.no_of_leaves = no_of_leaves;

		if (no_of_leaves > total_leaves) {
			return false;
		} else {
			return true;
		}

	}

	@Override
	void calculate_salary() {

		System.out.println("Total salary for " + empName + " is " + total_Salary);
		// prints Total salary for employee name is total salary

	}

}