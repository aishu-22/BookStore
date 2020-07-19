package com.capgemini.bookStore.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.bookStore.Dao.DeleteBookDao;
import com.capgemini.bookStore.Exceptions.DeleteBookException;
import com.capgemini.bookStore.util.BookStoreConstants;

/**********************************************************************************************
 * @author:						Aishwarya Srivastava                                          *
 * Description:					It is a service class that provides the services for          * 
 *								deleting the book by checking if it exists or not             *
 * Version:						1.0                                                           * 
 * Created:						Date 16-JULY-2020                                              *
 **********************************************************************************************/
@Transactional
@Service
public class DeleteBookServiceImpl implements DeleteBookService{
	
	@Autowired
	private DeleteBookDao dao;

	@Override
	public String deleteBook(int bookId) throws DeleteBookException {
		if(dao.bookExists(bookId)) {
			dao.deleteBook(bookId);
			return BookStoreConstants.BOOK_DELETED;
		}
		throw new DeleteBookException(BookStoreConstants.BOOK_DOES_NOT_EXIST);
	}
}