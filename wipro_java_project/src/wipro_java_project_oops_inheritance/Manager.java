/**
 * 
 */
package wipro_java_project_oops_inheritance;

/**
 * 
 */
public class Manager extends Employee {

	/**
	 * 
	 */
	public Manager() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee=new Manager();
		employee.setEmpId(2345);
		employee.setEmpName("Raja");
		employee.setAge(45);
		
		System.out.println(employee.getEmpId());
		System.out.println(employee.getEmpName());
		System.out.println(employee.getAge());
	
		

	}

}
