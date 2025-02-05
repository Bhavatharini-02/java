package wipro_java_project_oops_library_management;
public class LibrarySystem {
    public static void main(String[] args) {
        // Creating objects (Polymorphism at work)
        LibraryItem book1 = new Book("The Alchemist", "Paulo Coelho", 101, 200);
        LibraryItem magazine1 = new Magazine("National Geographic", "John Smith", 201, "February 2025");

        // Calling overridden methods
        book1.displayDetails();
        magazine1.displayDetails();
    }
}