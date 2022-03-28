

package com.bookApp.model.dao;

import java.util.List;

public interface BookDao {
	public List<Book> getAll();
	public void addBook(Book b);
}