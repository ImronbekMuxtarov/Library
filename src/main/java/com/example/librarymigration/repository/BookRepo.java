package com.example.librarymigration.repository;

import com.example.librarymigration.model.Book;
import com.example.librarymigration.repository.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookRepo {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Book> getBooks(){
        return jdbcTemplate.query(
                "select * from books",
                new BookMapper()
        );
    }

    public Book getBook(int id){
        return jdbcTemplate.queryForObject(
                "select * from books where id = ?",
                new Object[]{id},
                new BookMapper()
        );
    }

    public void addBook(Book book){
        jdbcTemplate.update(
                "insert into books(title, author_id, category_id, year, language) values (?, ?, ?, ?, ?)",
                book.getTitle(),
                book.getAuthorId(),
                book.getCategoryId(),
                book.getYear(),
                book.getLanguage()
        );
    }

    public void updateBook(int id, Book book){
        jdbcTemplate.update(
                "update books set title = ?, author_id = ?, category_id = ?, year = ?, language = ? where id = ?",
                book.getTitle(),
                book.getAuthorId(),
                book.getCategoryId(),
                book.getYear(),
                book.getLanguage(),
                id
        );
    }

    public void deleteBook(int id){
        jdbcTemplate.update(
                "delete from books where id = ?",
                id
        );
    }
}
