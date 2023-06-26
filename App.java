package employee;

public class App {
  public static void main(String args[])
  {
	  Employee e=new Employee();
	  e.createEmployee("Nageswar",5000,"ABC123",new Department());
	  e.getDetails();
	  
  }
}
