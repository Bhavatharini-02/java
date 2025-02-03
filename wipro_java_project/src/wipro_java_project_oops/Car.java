package wipro_java_project_oops;

public class Car {

    private String model;
    private int year;

    // Constructor
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Getter and Setter methods

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayCarDetails() {
        System.out.println("Car Details:  " + model + " (" + year + ")");
    }
}
