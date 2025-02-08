package com.wipro.java.oops.library;

abstract class BookItem {
    private String name;   
    private String creator;
    private int id;

    // Constructor
    public BookItem(String name, String creator, int id) {
        this.name = name;
        this.creator = creator;
        this.id = id;
    }

    // Encapsulation: Getters and Setters
    public String getName() {
        return name;
    }

    public String getCreator() {
        return creator;
    }

    public int getId() {
        return id;
    }

    // Abstract method
    public abstract void display();
}

// Child class (Inheritance)
class Novel extends BookItem {
    private int pageCount;

    public Novel(String name, String creator, int id, int pageCount) {
        super(name, creator, id);
        this.pageCount = pageCount;
    }

    @Override
    public void display() {
        System.out.println("Novel ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Creator: " + getCreator());
        System.out.println("Pages: " + pageCount);
    }
}

// Another Child class (Inheritance)
class Journal extends BookItem {
    private String releaseMonth;

    public Journal(String name, String creator, int id, String releaseMonth) {
        super(name, creator, id);
        this.releaseMonth = releaseMonth;
    }

    @Override
    public void display() {
        System.out.println("Journal ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Creator: " + getCreator());
        System.out.println("Release Month: " + releaseMonth);
    }
}

public class Library {
    public static void main(String[] args) {
        Novel novel = new Novel("Java", "Ram", 101, 500);
        Journal journal = new Journal("Novels", "John", 102, "March 2025");
        
        System.out.println("Novel Details:");
        novel.display();
        System.out.println();

        System.out.println("Journal Details:");
        journal.display();
    }
}