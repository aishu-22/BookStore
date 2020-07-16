package com.capgemini.bookStore.Controller;

import org.omg.CORBA.UserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.bookStore.Service.DeleteBookService;

@RestController
public class DeleteBookController {
	
//	@Autowired
//	private DeleteBookService deleteBookService;
//	
//	@DeleteMapping("/deleteBook/{title}")
//	public ResponseEntity<String> deleteBookByTitle(@PathVariable("Title") String title) throws UserException {
//		DeleteBookService.deleteBook(title);
//		return new ResponseEntity<String>("Book Deleted", HttpStatus.OK);
//	}
//
}
