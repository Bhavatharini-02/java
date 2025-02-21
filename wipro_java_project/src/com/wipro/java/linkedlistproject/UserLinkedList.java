package com.wipro.java.linkedlistproject;

import java.util.Scanner;

//Node class representing each element in the linked list
class Node {
 int data;
 Node next;

 // Constructor
 public Node(int data) {
     this.data = data;
     this.next = null;
 }
}

//Linked List class
class LinkedList {
 private Node head;

 // Method to add a new node at the end
 public void insert(int data) {
     Node newNode = new Node(data);
     if (head == null) {
         head = newNode;
     } else {
         Node temp = head;
         while (temp.next != null) {
             temp = temp.next;
         }
         temp.next = newNode;
     }
     System.out.println("Inserted: " + data);
 }

 // Method to display all elements in the list
 public void display() {
     if (head == null) {
         System.out.println("The linked list is empty.");
         return;
     }
     Node temp = head;
     System.out.print("Linked List: ");
     while (temp != null) {
         System.out.print(temp.data + " -> ");
         temp = temp.next;
     }
     System.out.println("NULL");
 }

 // Method to delete a node by value
 public void delete(int key) {
     if (head == null) {
         System.out.println("List is empty, nothing to delete.");
         return;
     }

     if (head.data == key) {
         head = head.next;
         System.out.println("Deleted: " + key);
         return;
     }

     Node temp = head;
     Node prev = null;
     while (temp != null && temp.data != key) {
         prev = temp;
         temp = temp.next;
     }

     if (temp == null) {
         System.out.println("Element not found.");
         return;
     }

     prev.next = temp.next;
     System.out.println("Deleted: " + key);
 }
}

//Main class
public class UserLinkedList {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     LinkedList linkedList = new LinkedList();

     while (true) {
         System.out.println("\nLinked List Operations:");
         System.out.println("1. Insert");
         System.out.println("2. Display");
         System.out.println("3. Delete");
         System.out.println("4. Exit");
         System.out.print("Enter your choice: ");

         int choice = scanner.nextInt();

         switch (choice) {
             case 1:
                 System.out.print("Enter value to insert: ");
                 int value = scanner.nextInt();
                 linkedList.insert(value);
                 break;
             case 2:
                 linkedList.display();
                 break;
             case 3:
                 System.out.print("Enter value to delete: ");
                 int key = scanner.nextInt();
                 linkedList.delete(key);
                 break;
             case 4:
                 System.out.println("Exiting... Thank you!");
                 scanner.close();
                 System.exit(0);
             default:
                 System.out.println("Invalid choice! Try again.");
         }
     }
 }
}

