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
import java.util.Calendar;
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

         String choice;
         String innerChoice1;
         String innerChoice2;
         String innerChoice3;

        do {
            
            System.out.println("==================================");
            
            System.out.println("          Menu:");
            System.out.println("1. Member section");
            System.out.println("2. Book section");
            System.out.println("3. Lend section");
            System.out.println("4. Exit");
            
            System.out.println("==================================");

            System.out.print("Enter your choice: ");
            choice = scan.nextLine();
            
            outerSwitch:
            switch (choice) {
                case "1":
                    System.out.println("==================================");
                    System.out.println("           Member Section:");
                    System.out.println("1. Add member");
                    System.out.println("2. Remove member");
                    System.out.println("3. Search member");
                    System.out.println("4. Display Member Names");
                    System.out.println("5. Back to menu");
                    System.out.println("==================================");
                    
                    System.out.print("Enter your choice: ");
                    innerChoice1 =scan.nextLine();

                    switch (innerChoice1) {
                    case "1":
                       // System.out.println("1.Add member");
                        lib.addMember();
                        break; 
                    case "2":
                        //System.out.println("2.Remove member");
                        lib.removeMember();
                        break;
                    case "3":
                      //  System.out.println("3.Search member");
                        
                            lib.searchMember();
                            
                         
                        break;
                        
                    case "4":
                      //  System.out.println("4.Display Member Names");
                            lib.displayMemberNames();
                        break;
                    case "5":
                        System.out.println("4.Exit Member Section");
                 
                        break outerSwitch; // Exit the outer switch and continue after it
                    default:
                        System.out.println("Unknown choice.");
                        break;
                }
                    break;
                   
                case "2":
                    
                    System.out.println("==================================");
                    System.out.println("           Book Section:");
                    System.out.println("1. Add book");
                    System.out.println("2. Remove book");
                    System.out.println("3. Search book");
                    System.out.println("4. Display Book Names");
                    System.out.println("5. Back to menu");
                    System.out.println("==================================");
                    
                    System.out.print("Enter your choice: ");
                    innerChoice2 =scan.nextLine();

                    switch (innerChoice2) {
                    case "1":
                      //  System.out.println("1.Book Add");
                        lib.addBook();
                        break; 
                    case "2":
                       // System.out.println("2.Remove Book");
                        lib.removeBook();
                        break;
                    case "3":
                        //System.out.println("3.Search Book");
                        
                         lib.searchBook();
                           
                         
                        break;
                        
                    case "4":
                        //System.out.println("4.Display Book Names");
                            lib.displayBookNames();
                        break;
                    case "5":
                        System.out.println("4.Exit Book Section");
                 
                        break outerSwitch; // Exit the outer switch and continue after it
                    default:
                        System.out.println("Unknown choice.");
                        break;
                }
                    break;
                case "3":
                     
                    System.out.println("==================================");
                    System.out.println("           Lend Section:");
                    System.out.println("1. Lend book");
                    System.out.println("2. Return book");
                    System.out.println("3. View Lending Information");
                    System.out.println("4. Display Overdue Books");
                    System.out.println("5. Back to menu");
                    System.out.println("==================================");
                    
                    System.out.print("Enter your choice: ");
                    innerChoice3 =scan.nextLine();

                    switch (innerChoice3) {
                    case "1":
                     //   System.out.println("1.Lend Book");
                        lib.lendBook();
                        break; 
                    case "2":
                      //  System.out.println("2.Return Book");
                        lib.returnBook();
                        break;
                    case "3":
                      //  System.out.println("3.View Lending Information");
                        
                         lib.displayLendingInformation();
                         
                        break;
                        
                    case "4":
                      //  System.out.println("4.Display Overdue Books");
                            lib.displayOverdueBooks();
                        break;
                    case "5":
                        System.out.println("4.Exit Lending Section");
                 
                        break outerSwitch; // Exit the outer switch and continue after it
                    default:
                        System.out.println("Unknown choice.");
                        break;
                }
                    break;
                    
                case "4":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (!choice.equals("4")); 
        
        
        
    }
    
    
    
    /*============================== book section ======================================================*/
    
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
        
         //initializes an iterator for the bookslist. It sets up a loop to iterate through the list of books. 
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
    
    public void searchBook(){
        
            Scanner scanner = new Scanner(System.in);
        
            System.out.println("====== Search Book======");
        
            System.out.print("Enter Book Title: ");
            String title = scanner.nextLine();
        
            System.out.print("Enter Book Author: ");
            String author = scanner.nextLine();
    
           
            for(Book book : books){

                if(book.getTitle().equals(title) && book.getAuthor().equals(author)){
               
                    System.out.println("Book with title : " + title + " by author : " + author + " Found" );
                    return;
                    }
            
                }

            
            System.out.println("Book with title : " + title + "by author : " + author + " Not Found" );
    }
    
    
    public void displayBookNames(){
        
        int id=1;
        
         System.out.println("====== Book Details======");
         
         if (books.isEmpty()) {
            System.out.println("No books found in the library.");
         } else {
             
            for (Book book : books) {
                
                System.out.println("<<<<Book " + id + " >>>>");
                ++id;
                System.out.println("Book ID : " + book.getId());
                System.out.println("Book Title : " + book.getTitle());
                System.out.println("Book Author : " + book.getAuthor());
                System.out.println();
        }
        }
         
        
        
    }
    
    /*============================== book section over =================================================*/
    
    
    
    
    
   
    /*============================== member section  =======================================================*/
    
    public void addMember(){
        
         Scanner scanner = new Scanner(System.in);
        
         System.out.println("====== Add Member======");

        System.out.print("Enter Member Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Member Mobile: ");
        String mobile = scanner.nextLine();
        
        System.out.print("Enter Member Address: ");
        String address = scanner.nextLine();
        
        System.out.print("Enter Member NIC: ");
        String nic = scanner.nextLine();

        
        int memberId = ++this.memberIDCounter;

         // Create a new member and add it to the list
        Member newMember = new Member(memberId,name,mobile,address,nic);
        members.add(newMember);
        
        System.out.println("Member Added Successfully");
        
        
     
    
    }
    
    public void removeMember(){
        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("====== Remove Member ======");
        
        System.out.print("Enter Member NIC: ");
        String nic = scanner.nextLine();
        
        
        //initializes an iterator for the members list. It sets up a loop to iterate through the list of members.
         
    for (Iterator<Member> iterator = members.iterator(); iterator.hasNext();) {
        Member member = iterator.next();
        if (member.getNic().equals(nic)) {
            
            System.out.println("Member name: " + member.getName() + " removed successfully!");
            iterator.remove();
            
            return;
        }
        
        System.out.println("Member Not Found");
        
        
    
    }
        
        
    }
        
    
    
    public void searchMember(){
        
        Scanner scanner = new Scanner(System.in);
        
         System.out.println("====== Search Member======");
        
        System.out.print("Enter Member NIC: ");
        String nic = scanner.nextLine();
        
        
        
        for(Member member : members){

            if(member.getNic().equals(nic)){
               
                System.out.println("Member name: " + member.getName() + " found");
                return;
            }
            
        }

            
        System.out.println("Member Nic: " + nic + " not found");
    }
    
    
    public void displayMemberNames(){
        
        
        System.out.println("====== Member Details======");
         
        int id =1;
        
         if (members.isEmpty()) {
            System.out.println("No Members found in the library.");
         } else {
             
            for (Member member : members) {
                
                System.out.println("<<<<Member " + id + " >>>>");
                ++id;
                
                System.out.println("Member Name : " + member.getName());
                System.out.println("Member Phone number : " + member.getPhoneNumber());
                System.out.println("Member Address : " + member.getAddress());
                System.out.println("Member Nic : " + member.getNic());
                System.out.println();
 
        }
        }
        
        
    
    }
    
     /*======================================   member section over =======================================================*/
    
    
    
    
    
    
    
    /*============================================lend section  ===========================================================*/
    
    
    
    
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
    Date currentDate = new Date(); // checkout date
    
        Calendar calendar = Calendar.getInstance(); // Get the current date and time
        calendar.add(Calendar.DAY_OF_MONTH, 7); // Add 7 days to the current date
        Date dueDate = calendar.getTime(); // Convert the calendar object to a Date
    
 
    
    // Create a new transaction and add it to the list
   Transaction transaction = new Transaction(transactionId, book, member, currentDate, dueDate);
   transactions.add(transaction);
   
   
   
   //for testing overdue dates and fees
 
         
         
   Book book1 = new Book(200,"World","John Cave");
   Book book2 = new Book(201,"Sri Lanka","Mark Leon");
   books.add(book1);
    books.add(book2);
   Member mem1 = new Member(1000,"Ana marie","077111111","Colombo","201");
   Member mem2 = new Member(1001,"Kathy Carpenter","07722222","Kurunegala","202");
   members.add(mem1);
    members.add(mem2);
  
   
     try {
            // Create a SimpleDateFormat to parse the date string
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");

            // Parse the date string "2023/09/18" into a Date object
            Date specificDate1 = dateFormat.parse("2023/09/28");  // today 10/05  , 7 days ago 09/27 || (7*50)  = 350
            
            // Parse the date string "2023/09/11" into a Date object
            Date specificDate2 = dateFormat.parse("2023/09/20"); // today 10/05  , 15 days ago 09/19 || (7*50) + (15-7)*100 = 1150
            
             Transaction transaction1 = new Transaction(500, book1, mem1, currentDate, specificDate1);
               Transaction transaction2 = new Transaction(501, book2, mem2, currentDate, specificDate2);
               
               transactions.add(transaction1);
               transactions.add(transaction2);

        } catch (ParseException e) {
            System.err.println("Invalid date format. Please use yyyy/MM/dd.");
        }
   
   
    //for testing overdue dates and fees *** code over
   
   
    
    // Update the book's availability
    book.setAvailable(false);
    
    
    System.out.println();
    System.out.println("Lending a book to " + member.getName());
    System.out.println("Book title :" + book.getTitle());
    System.out.println("Due Date :" + dueDate);
    System.out.println();
    
    
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
        
        
                
        
        
        Date returnDate = new Date();
        transaction.setReturnDate(returnDate);
        
        // Update the book's availability
        book.setAvailable(true);
        
        long diff = calculateDaysDifference(returnDate, transaction.getDueDate());
        
        if( diff == 0){
            
            System.out.println(transaction.getMember().getName() + "  return the book on Due Date");
            
        }else if (diff < 0){
            if(diff<0) diff = -1* diff;
            
            System.out.println(transaction.getMember().getName() + "  return the book  " +diff+ " days before Due Date");
            
        }else if (diff > 0){
            
            System.out.println(transaction.getMember().getName() + "  return the book  " +diff+ " days after Due Date");
            System.out.println("Amount to Pay : Rs. " + calculateFee(diff)); 
            transaction.setFeeAmount(calculateFee(diff));
            
            
        }
        
    }
        
        
        
    public void displayLendingInformation(){
           System.out.println("=========Lending Information===========");
           
           int id =1;
           Date currentDate = new Date();
           
           if (transactions.isEmpty()) {
                    System.out.println("No transactions found.");
           } else {
               
                for (Transaction transaction : transactions) {
                    
                     System.out.println("<<<<Transaction #" + id + ">>>>");
                     
                     ++id;
                    
                    System.out.println("Transaction ID: " + transaction.getId());
                    System.out.println("Member Name: " + transaction.getMember().getName());
                    System.out.println("Member NIC: " + transaction.getMember().getNic());
                    System.out.println("Check out date: " + transaction.getCheckOutDate());
                    System.out.println("Due Date: " + transaction.getDueDate());

                        if (transaction.getReturnDate() == null) {
                            System.out.println("Return Date: Not Returned");
                         } else {
                            System.out.println("Return Date: " + transaction.getReturnDate());
                         }
                        
                        //check is book overdue
                        if (transaction.getDueDate().before(currentDate)) {
                            
                            long diff = calculateDaysDifference(currentDate, transaction.getDueDate());
                            System.out.println("Book is Overdue Amount to Pay : Rs. " + calculateFee(diff));

                        }else{
                            
                            System.out.println("Book not overdue Fee Amount: " + transaction.getFeeAmount());
                        
                        }
 
                        System.out.println();
   
                }
                    }
    }
    
    
    public void displayOverdueBooks(){
           System.out.println("=========Display Overdue Books===========");
           
           int id =1;
           
           if (transactions.isEmpty()) {
                    System.out.println("No transactions found.");
            } else {
               
                for (Transaction transaction : transactions) {
                Date currentDate = new Date();

                            if (transaction.getDueDate().before(currentDate)) {
                                
                                System.out.println("<<< Overdue Book : " + id + ">>>");
                                ++id;
                                
                                
                            System.out.println("Book Id: " + transaction.getBook().getId());
                            System.out.println("Book Name: " + transaction.getBook().getTitle());
                            System.out.println("Book Author " + transaction.getBook().getAuthor());
                            System.out.println("Member Name: " + transaction.getMember().getName());
                            System.out.println("Member NIC: " + transaction.getMember().getNic());
                            System.out.println("Check out date: " + transaction.getCheckOutDate());
                            System.out.println("Due Date: " + transaction.getDueDate());
                             System.out.println();
                            
        }
    }
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
        
         
      
      
    public double calculateFee(long diff){
        
       
        
       if(diff <=7){
           
           return (diff * 50);
       }else{
       
           return  (7* 50 + (diff-7) *100);
       }
       
                
    }
     /*============================================lend section over  ===========================================================*/
    
}
