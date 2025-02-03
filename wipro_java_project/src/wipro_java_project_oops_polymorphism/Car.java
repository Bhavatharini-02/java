package wipro_java_project_oops_polymorphism;

public class Car {
	private String brandName;
	private int year;
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void show() {
		System.out.println("Car brand name is: " + brandName);
	}
}
