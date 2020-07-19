package com.capgemini.bookStore.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.capgemini.bookStore.Exceptions.DeleteBookException;


@ControllerAdvice
public class BookStoreExceptionAdvice {
	
		@ExceptionHandler(value= { DeleteBookException.class})
		@ResponseStatus(code=HttpStatus.NOT_FOUND)
		public Map<String,String> handleException(Exception ex) {
			Map<String, String> map = new HashMap<>();
			map.put("message", ex.getMessage());
			return map;
		}
	}
