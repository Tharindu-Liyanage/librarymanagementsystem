/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.librarymanagementsystem;

/**
 *
 * @author thari
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

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
             
        LibraryManagementSystem LibNew = new LibraryManagementSystem();
        
      
        
         System.out.println("====== Lend Book======");
         
         
        LibNew.searchMember();
        LibNew.searchBook();
        
    }
    
    public void returnBook(){
        
    }
    
    
}
