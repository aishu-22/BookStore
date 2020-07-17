package com.capgemini.bookStore.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.bookStore.Exceptions.DeleteBookException;
import com.capgemini.bookStore.Service.DeleteBookService;

@RestController
public class DeleteBookController {
	
	@Autowired
	private DeleteBookService service;
	

	@DeleteMapping("/manageBook/delete/{bookId}")
	public String deleteBook(@PathVariable(name="bookId") int bookId) throws DeleteBookException {
		return service.deleteBook(bookId);
	}
	
}

	

