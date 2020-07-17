package com.capgemini.bookStore.Dao;

public interface DeleteBookDao {
	
	public boolean deleteBook(int bookId);

	public boolean bookExists(int bookId);
}
