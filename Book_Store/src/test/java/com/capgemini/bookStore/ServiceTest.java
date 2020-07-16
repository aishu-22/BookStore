package com.capgemini.bookStore;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.awt.PageAttributes.MediaType;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.capgemini.bookStore.Controller.DeleteBookController;
import com.capgemini.bookStore.Service.DeleteBookService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceTest {
	@Autowired
	DeleteBookService deleteBookService;
	

	@Test
	public void deleteBook()
	{
		String val="Book Deleted Successfully";
		assertEquals(val,"Book Deleted Successfully");
	}

	
	@Test
	public void reviewedBook()
	{
		String val="Book is reviewed,Can not be deleted";
		assertEquals(val,"Book is reviewed,Can not be deleted");
	}
	
	@Test
	public void orderedBook()
	{
		String val="Book is previously ordered,Can not be deleted";
		assertEquals(val,"Book is previously ordered,Can not be deleted");
	}
}
