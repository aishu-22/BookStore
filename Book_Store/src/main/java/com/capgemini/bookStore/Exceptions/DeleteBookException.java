package com.capgemini.bookStore.Exceptions;

public class DeleteBookException extends Exception{
	
	public DeleteBookException() {
		super();
	}
	
	public DeleteBookException(String s) {
		super(s);
	}
}