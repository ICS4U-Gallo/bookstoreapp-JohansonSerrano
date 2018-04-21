package controllers;
import models.Book;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Results;

/**
 * Created by johanson on 4/20/2018.
 */

import views.html.books.*;

import java.util.Set;

public class BooksController extends Controller{

    // for all books

    public Result index(){
        Set<Book> books = Book.allBooks();
        return ok(index.render(books));
    }

    // to create book

    public Result create(){
        return TODO;
    }

    // to save book

    public Result save(){
        return TODO;
    }

    public Result edit(Integer id){
        return TODO;
    }

    public Result update(){
        return TODO;
    }

    public Result destroy(Integer id){
        return TODO;
    }

    // for book details

    public Result show(Integer id){
        return TODO;

    }

}