package com.capgemini.bookStore.Dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class DeleteBookDaoImpl implements DeleteBookDao {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Boolean deleteBook(String title) {
		// TODO Auto-generated method stub
		return null;
	}

}
