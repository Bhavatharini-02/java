/**
 * 
 */
package wipro_java_project_oops;

/**Parent class=Employee
 * Child class=ProjectLead
 * Extends is a keyword
 * 
 */
public class ProjectLead extends Employee
{


	public ProjectLead() {
		// TODO Auto-generated constructor stub
	}


	public static void main(String a[]) {

		Employee employee=new ProjectLead();
		employee.setEmpId(1234);
		employee.setEmpName("Ravi");
		employee.setAge(23);
		employee.setDesignation("ProjectLead");
		
		System.out.println(employee.getEmpId());
		System.out.println(employee.getEmpName());
		System.out.println(employee.getAge());
		System.out.println(employee.getDesignation());
		;
	}

}
