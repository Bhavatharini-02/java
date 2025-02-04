package wipro_java_project_oops_polymorphism;

public class Square extends Polygon {
    @Override
    public void show() {
        System.out.println("This is a polygon: " + getArea() + ", " + "Length is" + ", " + getLength());
    }

    public static void main(String a[]) {
        Polygon Square1 = new Square();
        Square1.setArea(200);
        Square1.setLength(10);
        Square1.setBreadth(20);
        Square1.show();
    }
}
