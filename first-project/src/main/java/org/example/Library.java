package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {

  private List<Book> books = new ArrayList<>();

  public void addBook(Book book) {
    books.add(book);
  }

  public Book searchByTitle(String title) {
    for (Book book : books) {
      if (book.getTitle().equals(title)) {
        return book;
      }
    }
    return null;
  }

  public List<Book> searchByAuthor(String author) {
    List<Book> result = new ArrayList<>();
    for (Book book : books) {
      if (book.getAuthor().equals(author)) {
        result.add(book);
      }
    }
    return result;
  }

  public Book searchByNumber(int number) {
    for (Book book : books) {
      if (book.getBookNumber() == number) {
        return book;
      }
    }
    return null;
  }

}
