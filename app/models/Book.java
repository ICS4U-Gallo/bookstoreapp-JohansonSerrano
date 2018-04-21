package models;

import scala.Int;

/**
 * Created by johanson on 4/21/2018.
 */

public class Book {

    public Integer id;
    public String title;
    public Integer price;
    public String author;

    public Book(Integer id , String title , Integer price , String author){
        this.id = id;
        this.title = title;
        this.price = price;
        this.author = author;
    }

    private static Set<Book> books;

    static {
        books = new HashSet<>();
        books.add(new Book(id: 1, title: "C++", price: 20, author: "ABC"));
        books.add(new Book(id: 2, title: "Java", price: 30, author: "XYZ"));
    }


    public static Set<Book> allBooks(){
        return books;
    }

    public static Book findById(Integer id){
        for (Book book : books){
            if(id.equals(book.id)){
                return book;
            }
        }

        return null;
    }

    public static void add(Book book){
        books.add(book);
    }

    public static boolean remove(Book book){
        return books.remove(book);
    }

}
