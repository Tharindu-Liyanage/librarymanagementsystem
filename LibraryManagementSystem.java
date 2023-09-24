/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.librarymanagementsystem;

/**
 *
 * @author thari
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Date;

public class LibraryManagementSystem {
    
    private List<Book> books;
    private List<Member> members;
    private List<Transaction> transactions;
    private int bookIDCounter;
    private int memberIDCounter;
    private int transactionIDCounter;
    
    

    public LibraryManagementSystem() {
        books = new ArrayList<>();
        members = new ArrayList<>();
        transactions = new ArrayList<>();
        bookIDCounter = 0;
        memberIDCounter = 0;
        transactionIDCounter=0;
        
        
    }
    
    /*============== Main section ======================*/

    public static void main(String[] args) {
        
        LibraryManagementSystem lib = new LibraryManagementSystem();
        
        lib.addBook();
       if(lib.searchBook()) {
          System.out.println("Book Found");
       }else{
           System.out.println("Book Not Found");
       }
        lib.displayBookNames();
        lib.removeBook();
        
    }
    
    /*============== book section ======================*/
    
    public void addBook(){
        
        Scanner scanner = new Scanner(System.in);
        
         System.out.println("====== Add Book======");

        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();
        
        System.out.print("Enter Author: ");
        String author = scanner.nextLine();

        
        int bookId = ++this.bookIDCounter;

        
        Book newBook = new Book(bookId, title, author);
        books.add(newBook);
        
    }
    
    public void removeBook(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("====== Remove Book======");
        
        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();
        
        System.out.print("Enter Book Author: ");
        String author = scanner.nextLine();
        
         
    for (Iterator<Book> iterator = books.iterator(); iterator.hasNext();) {
        Book book = iterator.next();
        if (book.getTitle().equals(title) && book.getAuthor().equals(author)) {
            iterator.remove();
            System.out.println("Book removed successfully!");
            return;
        }
    }
    
    
    System.out.println("Book with title '" + title + "' by author '" + author + "' not found in the library.");
        
    }
    
    public boolean searchBook(){
        
          Scanner scanner = new Scanner(System.in);
        
         System.out.println("====== Search Book======");
        
        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();
        
        System.out.print("Enter Book Author: ");
        String author = scanner.nextLine();
    
           
        for(Book book : books){

            if(book.getTitle().equals(title) && book.getAuthor().equals(author)){
               
                return true;
            }
            
        }

            
        return false;
    }
    
    
    public void displayBookNames(){
         System.out.println("====== Book Details======");
         
         for(Book book : books){
             
             System.out.println("<<<<Book " + book.getId() +">>>>");
         
             System.out.println("Book ID : " + book.getId());
             System.out.println("Book Title : " + book.getTitle());
             System.out.println("Book Author : " + book.getAuthor());
         }
         
        
        
    }
    
    /*============== member section  ======================*/
    
    public void addMember(){
    
    }
    
    public void removeMember(){
    
    }
    
    
    public boolean searchMember(){
        
        Scanner scanner = new Scanner(System.in);
        
         System.out.println("====== Search Member======");
        
        System.out.print("Enter Member NIC: ");
        String nic = scanner.nextLine();
        
        
        
        for(Member member : members){

            if(member.getNic().equals(nic)){
               
                return true;
            }
            
        }

            
        return false;
    }
    
    
    public void displayMemberNames(){
    
    }
    
    /*============== lend section  ======================*/
    
    public void lendBook(){
             
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("====== Lend Book ======");
    
    // Take input for member NIC
    System.out.print("Enter Member NIC: ");
    String nic = scanner.nextLine();
    
    // Take input for title and aithor
    System.out.print("Enter Book title: ");
    String title = scanner.nextLine();
    
    System.out.print("Enter Book author: ");
    String author = scanner.nextLine();
    
   
    Member member = findMemberByNic(nic);
    Book book = findBookByTitleAndAuthor(title,author);
    
    
    if (member == null || book == null) {
        System.out.println("Member or book not found. Please check the NIC or Book details.");
        return;
    }
    
    if (!book.isAvailable()) {
        System.out.println("The book is not available for lending.");
        return;
    }
    
    // Generate a unique transaction ID
    int transactionId = ++transactionIDCounter;
    
    // Get current Date
    Date currentDate = new Date();
    
    Date dueDate = getDueDateFromUser();
    
    // Create a new transaction and add it to the list
    Transaction transaction = new Transaction(transactionId, book, member, currentDate, dueDate);
    transactions.add(transaction);
    
    // Update the book's availability
    book.setAvailable(false);
    
    }
    
    public Member findMemberByNic(String nic) {
    for (Member member : members) {
        if (member.getNic().equals(nic)) {
            return member; // Member with the specified NIC found
        }
    }
    return null; // Member with the specified NIC not found
}

public Book findBookByTitleAndAuthor(String title, String author) {
    for (Book book : books) {
        if (book.getTitle().equals(title) && book.getAuthor().equals(author)) {
            return book; // Book with the specified title and author found
        }
    }
    return null; // Book with the specified title and author not found
}

public Date getDueDateFromUser() {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Define your desired date format
        
        System.out.print("Enter Due Date (yyyy-MM-dd): ");
        String dueDateStr = scanner.nextLine();
        
        try {
            Date dueDate = dateFormat.parse(dueDateStr);
            return dueDate;
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please enter the date in yyyy-MM-dd format.");
            return null;
        }
    }

    
     
    
    
    
    public void returnBook(){
        
         Scanner scanner = new Scanner(System.in);
    
    System.out.println("====== Return Book ======");
    
    // Take input for member NIC
    System.out.print("Enter Member NIC: ");
    String nic = scanner.nextLine();
    
    // Take input for title and aithor
    System.out.print("Enter Book title: ");
    String title = scanner.nextLine();
    
    System.out.print("Enter Book author: ");
    String author = scanner.nextLine();
    
        
        
       Book book = findBookByTitleAndAuthor(title,author);
        Transaction transaction = findTransactionByMemberAndBook(nic,title,author);
        
        if (transaction.getReturnDate() != null) {
            System.out.println("The book has already been returned.");
            return;
        }
        
         if (transaction == null) {
            System.out.println("Transaction not found. Please check again.");
            return;
        }
        
        
        Date returnDate = new Date();
        transaction.setReturnDate(returnDate);
        
        // Update the book's availability
        book.setAvailable(true);
        
        
        
        
    }
    
     private Transaction findTransactionByMemberAndBook(String nic, String title, String author) {
        for (Transaction transaction : transactions) {
            if (transaction.getMember().getNic().equals(nic) && transaction.getBook().getTitle().equals(title) && transaction.getBook().getAuthor().equals(author)) {
                return transaction;
            }
        }
        return null;
    }
    
    
}
