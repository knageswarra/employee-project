package employee;

public class Employee {
    
	String ename;
	int esal;
	String eid;
	Department dept;
	
	void createEmployee(String ename,int esal,String eid,Department dept)
	{
		this.ename=ename;
		this.esal=esal;
		this.eid=eid;
		this.dept=dept;
		
	}
	void getDetails()
	{
		System.out.println("the details of the employee are :" + "Name:"+ename + " ,salary is :"+esal+", Employeeid :"+eid +",department details:"+dept.getDetails());
	}

}
