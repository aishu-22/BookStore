package com.capgemini.bookStore.Service;

import com.capgemini.bookStore.Exceptions.DeleteBookException;

public interface DeleteBookService {

	public String deleteBook(int bookId) throws DeleteBookException;
	}

