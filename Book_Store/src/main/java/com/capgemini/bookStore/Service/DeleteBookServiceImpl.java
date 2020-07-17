package com.capgemini.bookStore.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.bookStore.Dao.DeleteBookDao;
import com.capgemini.bookStore.Exceptions.DeleteBookException;

@Transactional
@Service
public class DeleteBookServiceImpl implements DeleteBookService{
	@Autowired
	private DeleteBookDao dao;

	@Override
	public String deleteBook(int bookId) throws DeleteBookException {
	
		if(dao.bookExists(bookId)) {
			dao.deleteBook(bookId);
			return "Book deleted";
		
		}
		throw new DeleteBookException("Book does not exist!");
	}
	
}