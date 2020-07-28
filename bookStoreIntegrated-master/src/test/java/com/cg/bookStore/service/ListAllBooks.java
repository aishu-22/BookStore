package com.cg.bookStore.service;


import static org.junit.Assert.assertFalse;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.bookStore.entities.BookInformation;
import com.cg.bookStore.exceptions.BookException;



@RunWith(SpringRunner.class)
@SpringBootTest
public class ListAllBooks {

	@Autowired
	ManageBookService bookManagementService;

	@Test
	public void listAllBooks() throws BookException
	{
		List<BookInformation> bookInformation=bookManagementService.displayBooks();
		assertFalse(bookInformation.isEmpty());
	}
}