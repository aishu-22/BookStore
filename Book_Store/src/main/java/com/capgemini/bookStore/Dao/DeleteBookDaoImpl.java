package com.capgemini.bookStore.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.bookStore.Entities.BookInformation;

@Repository
public class DeleteBookDaoImpl implements DeleteBookDao {
	@PersistenceContext
	private EntityManager em;

	

	public boolean bookExists(int bookId) {
		String jpql = "from BookInformation b where b.bookId=:bId";
		TypedQuery<BookInformation> query = em.createQuery(jpql, BookInformation.class);
		query.setParameter("bId",bookId);
	    List<BookInformation> existingCat = query.getResultList();
	    if(existingCat.isEmpty()) {
	    	return false;
	    }
	    return true;
	}

	@Override
	public boolean deleteBook(int bookId) {
		BookInformation book = em.find(BookInformation.class,bookId);
		em.remove(book);
		return true;
	}
	

}