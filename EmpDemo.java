
public class EmpDemo {
	
	public static void main(String[] args) 
	{
		EmpObject1 emp = new EmpObject1();
		emp.name = "kiran";
		emp.age = 21;
		emp.salary = 200000;
		
		EmpObject1 emp1 = new EmpObject1();
		emp1.name = "Deepu";
		emp1.age = 15;
		emp1.salary = 300000;
		
		
		emp.show();
		emp1.show();
		
	}

}
