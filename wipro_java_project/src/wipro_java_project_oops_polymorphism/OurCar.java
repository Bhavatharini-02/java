package wipro_java_project_oops_polymorphism;

public class OurCar extends Car {
    @Override
    public void show() {
        System.out.println("This is a car: " + getBrandName() + ", " + "Manufacture year is" + ", " + getYear());
    }

    public static void main(String a[]) {
        Car ourcar = new MyCar();
        ourcar.setBrandName("Audi");
        ourcar.setYear(2024);
        ourcar.show();
    }
}
