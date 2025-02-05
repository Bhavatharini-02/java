package wipro_java_project_oops_polymorphism;

public class Polygon {
	private int length;
	private int area;
	private int breadth;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	
	public void show() {
		System.out.println("Polygon area is:" + area);
	}
}
