package com.capgemini.bookStore;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

public class ControllerTest extends BookStoreApplicationTests{

	
	@Autowired
	private WebApplicationContext webApplicationContext;

	
	
	
	private MockMvc mockMvc;
	
	
	@Before
	public void setup() throws Exception {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
		
	}
	
	//demo test
		@Test
		public void demoTest() throws Exception
		{
		
			MediaType contentType = null;
			mockMvc.perform((RequestBuilder) ((ResultActions) get("/DemoTest").contentType(contentType))
			.andExpect(status().isInternalServerError())
			.andExpect(content().string("Hello"))
			.andDo(print()));
		
		}
		

	// Delete BOOK.	
		@Test
		public void deleteBook() throws Exception
		{
		MediaType contentType = null;
			mockMvc.perform((RequestBuilder) ((ResultActions) get("/manageBook/delete/1").contentType(contentType))
			.andExpect(status().isInternalServerError())
			.andExpect(content().string("Book Deleted"))
			.andDo(print()));
			
		}
}
		
		