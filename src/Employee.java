
public abstract class Employee {

	// initializing employee id variable

	int empId;

	// initializing employee name String variable

	String empName;

	// initializing total leaves data member for employee

	int total_leaves;

	// initializing total salary data member for employee

	double total_Salary;

	// initializing parameterized constructor

	Employee(int empId, String empName, int total_leaves, double total_Salary) {

		this.empId = empId;// setting employee id

		this.empName = empName;// setting employee name

		this.total_leaves = total_leaves;// setting total leaves

		this.total_Salary = total_Salary;// setting total salary

	}

	// declaring abstract method for calculating balance leaves

	abstract void calculate_balance_leaves();

	// declaring abstract method for checking available leaves

	abstract boolean avail_leave(int no_of_leaves, char type_of_leave);

	// declaring abstract method for calculating total salary

	abstract void calculate_salary();

}