package com.capgemini.bookStore;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.capgemini.bookStore.Exceptions.DeleteBookException;
import com.capgemini.bookStore.Service.DeleteBookService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceTest {
	@Autowired
	DeleteBookService service;
	
	
	@Test
	public void deleteBook() throws DeleteBookException
	{
		String expectedValue = "Book Deleted";
		String actualValue= service.deleteBook(1);
		assertEquals(expectedValue,actualValue);
	}
	@Test
	public void deleteBook1() throws DeleteBookException
	{
		String expectedValue = "Book does not exist!";
		String actualValue= service.deleteBook(2);
		assertEquals(expectedValue,actualValue);
	}

}
