/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.librarymanagementsystem;

/**
 *
 * @author thari
 */

import java.util.Calendar;
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
        
        Scanner scan = new Scanner(System.in);
        
    /*    lib.addBook();
       if(lib.searchBook()) {
          System.out.println("Book Found");
       }else{
           System.out.println("Book Not Found");
       }
        lib.displayBookNames();
        lib.removeBook();
     
     Date date = new Date();
      
     Calendar calendar = Calendar.getInstance(); // Get the current date and time
        calendar.add(Calendar.DAY_OF_MONTH, 8); // Add 14 days to the current date
        Date RDate = calendar.getTime(); // Convert the calendar object to a Date
        
        
       System.out.println("Date"+ RDate);
        
        System.out.println("Date diff"+ lib.calculateDaysDifference(RDate, date));
        
        long diff = lib.calculateDaysDifference(RDate, date);
        
        
        
        if( diff == 0){
            
            System.out.print("Book return on the DueDate");
        }else if (diff < 0){
            
            System.out.print("Book return on before the DueDate");
            
        }else if (diff > 0){
            
            System.out.println("Your Fee Rs." + lib.calculateFine(diff));
            
            
        }
        */
        
         int choice;
         int innerChoice1;
         int innerChoice2;
         int innerChoice3;

        do {
            
            System.out.println("==================================");
            
            System.out.println("          Menu:");
            System.out.println("1. Member section");
            System.out.println("2. Book section");
            System.out.println("3. Lend section");
            System.out.println("4. Exit");
            
            System.out.println("==================================");

            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            
            outerSwitch:
            switch (choice) {
                case 1:
                    System.out.println("==================================");
                    System.out.println("           Member Section:");
                    System.out.println("1. Add member");
                    System.out.println("2. Remove member");
                    System.out.println("3. Search member");
                    System.out.println("4. Display Member Names");
                    System.out.println("5. Back to menu");
                    System.out.println("==================================");
                    
                    System.out.print("Enter your choice: ");
                    innerChoice1 =scan.nextInt();

                    switch (innerChoice1) {
                    case 1:
                        System.out.println("1.Add member");
                        lib.addBook();
                        break; 
                    case 2:
                        System.out.println("2.Remove member");
                        lib.removeBook();
                        break;
                    case 3:
                        System.out.println("3.Search member");
                        
                         if(lib.searchBook()) {
                            System.out.println("Book Found");
                         }else{
                             System.out.println("Book Not Found");
                         }
                         
                        break;
                        
                    case 4:
                        System.out.println("4.Display Member Names");
                            lib.displayBookNames();
                        break;
                    case 5:
                        System.out.println("4.Exit Book Section");
                 
                        break outerSwitch; // Exit the outer switch and continue after it
                    default:
                        System.out.println("Unknown inner choice.");
                        break;
                }
                    break;
                   
                case 2:
                    
                    System.out.println("==================================");
                    System.out.println("           Book Section:");
                    System.out.println("1. Add book");
                    System.out.println("2. Remove book");
                    System.out.println("3. Search book");
                    System.out.println("4. Display Book Names");
                    System.out.println("5. Back to menu");
                    System.out.println("==================================");
                    
                    System.out.print("Enter your choice: ");
                    innerChoice2 =scan.nextInt();

                    switch (innerChoice2) {
                    case 1:
                        System.out.println("1.Book Add");
                        lib.addBook();
                        break; 
                    case 2:
                        System.out.println("2.Remove Book");
                        lib.removeBook();
                        break;
                    case 3:
                        System.out.println("3.Search Book");
                        
                         if(lib.searchBook()) {
                            System.out.println("Book Found");
                         }else{
                             System.out.println("Book Not Found");
                         }
                         
                        break;
                        
                    case 4:
                        System.out.println("4.Display Book Names");
                            lib.displayBookNames();
                        break;
                    case 5:
                        System.out.println("4.Exit Book Section");
                 
                        break outerSwitch; // Exit the outer switch and continue after it
                    default:
                        System.out.println("Unknown inner choice.");
                        break;
                }
                    break;
                case 3:
                     
                    System.out.println("==================================");
                    System.out.println("           Lend Section:");
                    System.out.println("1. Lend book");
                    System.out.println("2. Return book");
                    System.out.println("3. View Lending Information");
                    System.out.println("4. Display Overdue Books");
                    System.out.println("5. Back to menu");
                    System.out.println("==================================");
                    
                    System.out.print("Enter your choice: ");
                    innerChoice3 =scan.nextInt();

                    switch (innerChoice3) {
                    case 1:
                        System.out.println("1.Lend Book");
                        lib.addBook();
                        break; 
                    case 2:
                        System.out.println("2.Return Book");
                        lib.removeBook();
                        break;
                    case 3:
                        System.out.println("3.View Lending Information");
                        
                         if(lib.searchBook()) {
                            System.out.println("Book Found");
                         }else{
                             System.out.println("Book Not Found");
                         }
                         
                        break;
                        
                    case 4:
                        System.out.println("4.Display Overdue Books");
                            lib.displayBookNames();
                        break;
                    case 5:
                        System.out.println("4.Exit Book Section");
                 
                        break outerSwitch; // Exit the outer switch and continue after it
                    default:
                        System.out.println("Unknown inner choice.");
                        break;
                }
                    break;
                    
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);
        
        
        
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
        
        System.out.println("Book Added Successfully");
        
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
 //   int transactionId = ++transactionIDCounter;
    
    // Get current Date
  //  Date currentDate = new Date();
    
 //   Date dueDate = getDueDateFromUser();
    
    // Create a new transaction and add it to the list
   // Transaction transaction = new Transaction(transactionId, book, member, currentDate, dueDate);
 //   transactions.add(transaction);
    
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
        
        int diff = calculateDaysDifference(returnDate, transaction.getdueDate());
        
        if( diff == 0){
            
            System.out.print("Book return on the DueDate");
        }else if (diff < 0){
            
            System.out.print("Book return on before the DueDate");
            
        }else if (diff > 0){
            
            calculateFine(diff);
            
            
        }
        
        
        
        
    }
    
     private Transaction findTransactionByMemberAndBook(String nic, String title, String author) {
        for (Transaction transaction : transactions) {
            if (transaction.getMember().getNic().equals(nic) && transaction.getBook().getTitle().equals(title) && transaction.getBook().getAuthor().equals(author)) {
                return transaction;
            }
        }
        return null;
    }
     
      private long calculateDaysDifference(Date dueDate, Date checkoutDate) {
        long differenceInMillis = dueDate.getTime() - checkoutDate.getTime();
        long differenceInDays = differenceInMillis / (1000 * 60 * 60 * 24);
        
        
             return (int) differenceInDays;
        
    }
        
         
      
      
    public double calculateFine(long diff){
        
       
        
       if(diff <=7){
           
           return (diff * 50);
       }else{
       
           return  (7* 50 + (diff-7) *100);
       }
       
                
    }
    
    
}
