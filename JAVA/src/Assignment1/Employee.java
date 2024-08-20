package Assignment1;

public class Employee {

	int empid;
	int salary;
	String department;
	Employee(int empid,int salary,String department){
		this.empid=empid;
		this.salary=salary;
		this.department=department;
	}
	public String toString() {
		return empid+" "+salary+" "+department;
	}

	public static void main(String[] args) 
	{
		Employee e1= new Employee(1,80000,"Testing");
		Employee e2= new Employee(2,90000,"developement");
		System.out.println(e1);
		System.out.println(e2);
		Employee e3=e2;
		System.out.println(e3.equals(e2));
	}
}


