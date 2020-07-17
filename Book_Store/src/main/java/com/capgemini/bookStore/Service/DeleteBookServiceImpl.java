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
	private DeleteBookDao deleteBookDao;
	
	
	public Boolean deleteBook(int id) throws DeleteBookException {
		if (deleteBookDao.deleteBook(id) == null) {
			throw new DeleteBookException("User does not exist");
		}
		return deleteBookDao.deleteBook(id);
	}
}
