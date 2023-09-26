/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagementsystem;
        
import java.util.Date;
/**
 *
 * @author thari
 */
public class Transaction {
    
    private int id;
    private Book book;
    private Member member;
    private Date checkoutDate;
    private Date dueDate;
    private Date returnDate;
    private double fineAmount;

    public Transaction(int id, Book book, Member member, Date checkoutDate, Date dueDate) {
        this.id = id;
        this.book = book;
        this.member = member;
        this.checkoutDate = checkoutDate;
        this.dueDate = dueDate;
        this.returnDate = null;
        this.fineAmount = 0.0;
    }

    public int getId() {
        return id;
    }

    public Book getBook() {
        return book;
    }

    public Member getMember() {
        return member;
    }

    public Date getCheckOutDate() {
        return checkoutDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public double getFeeAmount() {
        return fineAmount;
    }

    public void setFeeAmount(double fineAmount) {
        this.fineAmount = fineAmount;
    }
}
    

