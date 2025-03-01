package wipro_java_project_oops;
/**NO constructor
* Getters have return value
* setters have no return value
* properties are determined using private fileds
* values are behaviors are determined through setters
* toString will convert the entire animal class with properties and behaviors
*/

public class Animal {
	private String name;
	private String species;
	private int age;

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = "Tiger";
	}

	
	public String getSpecies() {
		return species;
	}

	
	public void setSpecies(String species) {
		this.species = "Mammal";
	}

	
	public int getAge() {
		return age;
	}

	
	public void setAge(int age) {
		this.age = 5;
	}

	

	public String toString() {
		return "Animal{" +
        "name='" + name + '\'' +
        ", species='" + species + '\'' +
        ", age=" + age +
        '}';
	}
	public static void main(String[] args) {
	        Animal animal = new Animal();

	   
	        animal.setName("Tiger");
	        animal.setSpecies("Mammal");
	        animal.setAge(5);

	        System.out.println(animal.toString());
	        System.out.println(animal);
	    }
	}
