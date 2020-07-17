package com.capgemini.bookStore;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;



import com.capgemini.bookStore.Controller.DeleteBookController;
import com.capgemini.bookStore.Entities.BookInformation;
import com.capgemini.bookStore.Service.DeleteBookService;

@RunWith(SpringRunner.class)
@WebMvcTest(value = DeleteBookController.class)
public class DeleteBookTest {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private DeleteBookService service;
	
	@Test
	public void testDeleteBookNull() throws Exception {
		String booknameJson = "{\"bookName\":\"\"}";
		String expectedResult="Cannot delete empty book";
		Mockito.when(
				service.deleteBook(Mockito.any(BookInformation.class))).thenReturn(expectedResult);
		RequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/deleteBook").accept(MediaType.APPLICATION_JSON).content(booknameJson).contentType(MediaType.APPLICATION_JSON);
		
		mockMvc.perform(requestBuilder).andExpect(MockMvcResultMatchers.content()
                .string("Cannot delete empty book")).andDo(MockMvcResultHandlers.print());
	}
	
	@Test
	public void testDeleteBookReviewExist() throws Exception {
		String booknameJson = "{\"bookname\":\"The Host\"}";
		String expectedResult="Review for this book exists, can not delete";
		Mockito.when(
				service.deleteBook(Mockito.any(BookInformation.class))).thenReturn(expectedResult);
		RequestBuilder requestBuilder = MockMvcRequestBuilders.post("/deleteBook").accept(MediaType.APPLICATION_JSON).content(booknameJson).contentType(MediaType.APPLICATION_JSON);
		
		mockMvc.perform(requestBuilder).andExpect(MockMvcResultMatchers.content()
                .string("Review for this book exists, can not delete")).andDo(MockMvcResultHandlers.print());
	}
	
	@Test
	public void testDeleteBookOrderExist() throws Exception {
		String booknameJson = "{\"bookname\":\"The Host\"}";
		String expectedResult="Order for this book exists, can not delete";
		Mockito.when(
				service.deleteBook(Mockito.any(BookInformation.class))).thenReturn(expectedResult);
		RequestBuilder requestBuilder = MockMvcRequestBuilders.post("/deleteBook").accept(MediaType.APPLICATION_JSON).content(booknameJson).contentType(MediaType.APPLICATION_JSON);
		
		mockMvc.perform(requestBuilder).andExpect(MockMvcResultMatchers.content()
                .string("order for this book exists, can not delete")).andDo(MockMvcResultHandlers.print());
	}
	
	
	@Test
	public void testDeleteBook() throws Exception {
		String booknameJson = "{\"Bookname\":\"Help\"}";
		String expectedResult="Book deleted";
		Mockito.when(
				service.deleteBook(Mockito.any(BookCategory.class))).thenReturn(expectedResult);
		RequestBuilder requestBuilder = MockMvcRequestBuilders.post("/deleteBook").accept(MediaType.APPLICATION_JSON).content(booknameJson
				).contentType(MediaType.APPLICATION_JSON);
		
		mockMvc.perform(requestBuilder).andExpect(MockMvcResultMatchers.content()
                .string("Book deleted")).andDo(MockMvcResultHandlers.print());
	}

}