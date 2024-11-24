package com.practice;
class Book
{
    String title;
    String author;
    double price;
    public Book(String title, String author, double price)
    {
        super();
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void getDetails()
    {
        System.out.println("Title :"+title);
        System.out.println("Author :"+author);
        System.out.println("Price :"+price);
    }
    void applyDiscount(double percentage)
    {
        System.out.println("Price with Discount :"+(price*percentage/100));
    }


}

class EBook extends Book
{
    double fileSize;
    String format;

    public EBook(String title, String author, double price, double fileSize, String format)
    {
        super(title, author, price);
        this.fileSize = fileSize;
        this.format = format;
    }
    void getDetails()
    {
        super.getDetails();
        System.out.println("FileSize :"+fileSize +"MB");
        System.out.println("Format :"+format );
    }

}

class AudioBook extends Book
{
    double duration;
    String narrator;
    public AudioBook(String title, String author, double price, double duration, String narrator)
    {
         super(title, author, price);
         this.duration = duration;
         this.narrator =narrator;
    }
    void getDetails()
    {
        super.getDetails();
        System.out.println("Duration :"+duration+"hours");
         System.out.println("Narrator :"+narrator);

    }
    
}


public class EBookSystemTester{

public static void main(String [] args)
{
    EBook eBook =new EBook("ABCD", "AB", 1000, 4.5, "PDF");
    AudioBook audioBook = new AudioBook("ABCD", "AB", 1000,4.5,"Narrator");

    eBook.getDetails();
    System.out.println("------------------------");
    audioBook.getDetails();

}

}


/* EBookSystemTester
Base Class: Book
The Book class represents the common properties and behavior of all books.

Attributes:

String title: Represents the title of the book.
String author: Represents the author of the book.
double price: Represents the price of the book.
Constructor:

A parameterized constructor to initialize the title, author, and price attributes.
Methods:

void getDetails(): Prints the details of the book, including title, author, and price.
void applyDiscount(double percentage): Applies a discount on the book's price based on the given percentage.

Subclass: EBook
The EBook class extends the Book class and represents electronic books.

Additional Attributes:

double fileSize: Represents the size of the eBook file in megabytes (MB).
String format: Represents the file format of the eBook (e.g., PDF, EPUB).
Constructor:

A parameterized constructor to initialize the attributes of both the parent class (Book) and the subclass (EBook).
 Methods:

void getDetails(): Displays all the details of the book, including the fileSize and format.
Subclass: AudioBook

The AudioBook class extends the Book class and represents audiobooks.

Additional Attributes:

double duration: Represents the duration of the audiobook in hours.
String narrator: Represents the name of the audiobook's narrator.
Constructor:

A parameterized constructor to initialize the attributes of both the parent class (Book) and the subclass (AudioBook).
 Methods:

void getDetails(): Displays all the details of the book, including the duration and narrator.
Requirements:
Define the class hierarchy as described above.
Create a EBookSystemTester class to demonstrate the functionality of the system:
Create at least one instance of Book, EBook, and AudioBook.
Call the getDetails() method on each instance to display their details.
Apply a discount on one of the books using the applyDiscount() method and verify that the price is updated correctly.
  */



