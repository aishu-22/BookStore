package com.capgemini.bookStore.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.bookStore.Exceptions.DeleteBookException;
import com.capgemini.bookStore.Service.DeleteBookService;

@RestController
public class DeleteBookController {
	
	@Autowired
	private DeleteBookService service;
	
	@DeleteMapping("/deleteBook/{id}")
	public ResponseEntity<String> deleteBookById(@PathVariable("id") int id) throws DeleteBookException {
	    DeleteBookService.deleteBook(id);
		return new ResponseEntity<String>("Book Deleted", HttpStatus.OK);
	}
}
	

	