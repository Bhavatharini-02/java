package wipro_java_project_oops_polymorphism;

public class Circle extends Polygon {
    @Override
    public void show() {
        System.out.println("This is a polygon: " + getArea() + ", " + "Length is" + ", " + getLength());
    }

    public static void main(String a[]) {
        Polygon Circle1 = new Circle();
        Circle1.setArea(200);
        Circle1.setLength(10);
        Circle1.setBreadth(20);
        Circle1.show();
    }
}
