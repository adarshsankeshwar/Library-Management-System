# Library Management System

## Project Description

The Library Management System is a Java console-based mini project developed using Object-Oriented Programming (OOP) concepts and the Java Collections Framework. It allows users to manage library books by adding, viewing, searching, issuing, and returning books.

---

## Features

- Add a new book
- View all books
- Search a book by ID
- Issue a book
- Return a book
- Menu-driven console application

---

## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Java Collections Framework (ArrayList)

---

## OOP Concepts Implemented

### Class and Object
A `Book` class is used to represent book details, and objects are created for each book.

### Encapsulation
Book attributes are declared as private and accessed through public methods.

### Constructor
Constructors are used to initialize book objects.

### Methods
Methods are used to issue books, return books, and display book information.

---

## Collection Used

```java
ArrayList<Book> books = new ArrayList<>();
```

The `ArrayList` stores all book objects dynamically.

---

## Menu Options

```text
1. Add Book
2. View Books
3. Search Book
4. Issue Book
5. Return Book
6. Exit
```

---

## Sample Execution

```text
===== LIBRARY MANAGEMENT SYSTEM =====

1. Add Book
2. View Books
3. Search Book
4. Issue Book
5. Return Book
6. Exit

Enter Choice: 1

Enter Book ID: 101
Enter Title: Java Programming
Enter Author: James Gosling

Book Added Successfully!
```

---

## Time Complexity

| Operation | Complexity |
| ---------- | ---------- |
| Add Book | O(1) |
| View Books | O(n) |
| Search Book | O(n) |
| Issue Book | O(n) |
| Return Book | O(n) |

---

## Future Enhancements

- Use HashMap for faster book search
- Add Student and Librarian modules
- Store data in files or databases
- Maintain issue and return history
- Add fine calculation for late returns

---

## Learning Outcomes

Through this project, the following concepts were practiced:

- Classes and Objects
- Encapsulation
- Constructors
- Methods
- ArrayList Collection
- Menu-Driven Programming
- Searching and Updating Objects

---


