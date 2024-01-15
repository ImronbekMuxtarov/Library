package com.example.librarymigration.repository.mapper;

import com.example.librarymigration.model.Author;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AuthorMapper implements RowMapper<Author> {
    @Override
    public Author mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Author(
                rs.getInt(1),
                rs.getString(2),
                rs.getString(3)
        );
    }
}
