package com.capgemini.bookStore.Dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.capgemini.bookStore.Entities.BookInformation;

@Repository
public class DeleteBookDaoImpl implements DeleteBookDao {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Boolean deleteBook(int id) {
		// TODO Auto-generated method stub
		BookInformation book = entityManager.find(BookInformation.class, id);
		if(book != null) {
			entityManager.getTransaction().begin();
			entityManager.remove(book);
			entityManager.getTransaction().commit();
		}
		return null;
	}

}