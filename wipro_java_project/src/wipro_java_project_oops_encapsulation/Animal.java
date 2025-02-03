/**
 * 
 */
package wipro_java_project_oops_encapsulation;

/**
 * 
 */
public class Animal {
	private String animalName;
	private int animalAge;
	private String animalColor;

	public Animal(String animalName, int animalAge, String animalColor) {
		super();
		this.animalName = animalName;
		this.animalAge = animalAge;
		this.animalColor = animalColor;
	}


	public String getanimalName() {
		return animalName;
	}


	public void setanimalName(String animalName) {
		if (animalName == null || animalName.isEmpty()) {
		    System.out.println("Animal name cannot be empty.");
		}
		else {
			this.animalName = animalName;
		}	
	}


	public int getanimalAge() {
		return animalAge;
	}


	public void setanimalAge(int animalAge) {
		if (animalAge>0) {
			this.animalAge = animalAge;
	    }
		else {
			System.out.println("Age need to be positive");
		}
	}


	public String getanimalColor() {
		return animalColor;
	}


	public void setanimalColor(String animalColor) {
		this.animalColor = animalColor;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal1 = new Animal("Lion", 5, "Orange");
		System.out.println(animal1.getanimalAge());
		System.out.println(animal1.getanimalName());
		animal1.setanimalAge(1);
		System.out.println(animal1.getanimalAge());
		System.out.println(animal1.getanimalName());
		animal1.setanimalAge(-1);
		System.out.println(animal1.getanimalAge());
		System.out.println(animal1.getanimalName());
		System.out.println(animal1.getanimalColor());
	}

}