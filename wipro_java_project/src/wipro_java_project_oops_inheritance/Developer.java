/**
 * 
 */
package wipro_java_project_oops_inheritance;

/**
 * 
 */
public class Developer extends Employee {

	/**
	 * 
	 */
	public Developer() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee=new Developer();
		employee.setEmpId(4567);
		employee.setEmpName("Mohan");
		employee.setAge(36);
		employee.setDesignation("Developer");
		
		System.out.println(employee.getEmpId());
		System.out.println(employee.getEmpName());
		System.out.println(employee.getAge());
	    System.out.println(employee.getDesignation());

	}

}
