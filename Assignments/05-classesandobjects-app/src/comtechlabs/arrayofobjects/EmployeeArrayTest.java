package comtechlabs.arrayofobjects;

public class EmployeeArrayTest {
	
	public static void main(String args[])
	{
		
		
		Employee employees[]=new Employee[5];
		
		for(int i=0;i<employees.length;i++)
		{
			employees[i]=new Employee(i+1,"AAA",10000 +(i*1000));
		
		}
		
		for(Employee employee:employees)
		{
			System.out.println(employee);
		}
	}

}
