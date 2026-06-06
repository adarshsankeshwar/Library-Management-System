import java.util.*;

class Book {
    private int id;
    private String title;
    private String author;
    private boolean issued;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.issued = false;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isIssued() {
        return issued;
    }

    public void issueBook() {
        issued = true;
    }

    public void returnBook() {
        issued = false;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Status: " + (issued ? "Issued" : "Available"));
        System.out.println("-------------------------");
    }
}

public class Library{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    books.add(new Book(id, title, author));
                    System.out.println("Book Added Successfully!");
                    break;

                case 2:
                    if (books.isEmpty()) {
                        System.out.println("No Books Available.");
                    } else {
                        for (Book b : books) {
                            b.display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID to Search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (Book b : books) {
                        if (b.getId() == searchId) {
                            b.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book Not Found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Book ID to Issue: ");
                    int issueId = sc.nextInt();

                    found = false;

                    for (Book b : books) {
                        if (b.getId() == issueId) {

                            if (!b.isIssued()) {
                                b.issueBook();
                                System.out.println("Book Issued Successfully!");
                            } else {
                                System.out.println("Book Already Issued!");
                            }

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book Not Found!");
                    }
                    break;

                case 5:
                    System.out.print("Enter Book ID to Return: ");
                    int returnId = sc.nextInt();

                    found = false;

                    for (Book b : books) {
                        if (b.getId() == returnId) {

                            if (b.isIssued()) {
                                b.returnBook();
                                System.out.println("Book Returned Successfully!");
                            } else {
                                System.out.println("Book is Already Available!");
                            }

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book Not Found!");
                    }
                    break;

                case 6:
                    System.out.println("Thank You!");
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}