package wipro_java_project_oops_polymorphism;

public class MyCar extends Car {
    @Override
    public void show() {
        System.out.println("This is a car: " + getBrandName() + ", " + "Manufacture year is" + ", " + getYear());
    }

    public static void main(String a[]) {
        Car mycar1 = new MyCar();
        mycar1.setBrandName("BMW");
        mycar1.setYear(2018);
        mycar1.show();
    }
}
