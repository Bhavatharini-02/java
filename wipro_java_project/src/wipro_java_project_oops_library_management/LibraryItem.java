
package wipro_java_project_oops_library_management;
abstract class LibraryItem {
    private String title;   // Encapsulation
    private String author;
    private int itemId;

    // Constructor
    public LibraryItem(String title, String author, int itemId) {
        this.title = title;
        this.author = author;
        this.itemId = itemId;
    }

    // Encapsulation: Getters and Setters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getItemId() {
        return itemId;
    }

    // Abstract method (to be implemented in subclasses)
    public abstract void displayDetails();
}

// Child class (Inheritance)
class Book extends LibraryItem {
    private int pageCount;

    public Book(String title, String author, int itemId, int pageCount) {
        super(title, author, itemId);
        this.pageCount = pageCount;
    }

    // Polymorphism: Overriding method
    @Override
    public void displayDetails() {
        System.out.println("Book ID: " + getItemId());
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Pages: " + pageCount);
        System.out.println("-----------------------------");
    }
}

// Another Child class (Inheritance)
class Magazine extends LibraryItem {
    private String issueMonth;

    public Magazine(String title, String author, int itemId, String issueMonth) {
        super(title, author, itemId);
        this.issueMonth = issueMonth;
    }

    // Polymorphism: Overriding method
    @Override
    public void displayDetails() {
        System.out.println("Magazine ID: " + getItemId());
        System.out.println("Title: " + getTitle());
        System.out.println("Editor: " + getAuthor());
        System.out.println("Issue Month: " + issueMonth);
        System.out.println("-----------------------------");
    }
}
