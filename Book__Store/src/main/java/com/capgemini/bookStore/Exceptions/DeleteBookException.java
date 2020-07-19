package com.capgemini.bookStore.Exceptions;

/**************************************************************************************
 *          @author         Aishwarya Srivastava                                      *
 *          Description      It is a exception class for Invalid Book entered         *
 *                          by user                                                   *
 *          Version          1.0                                                      *
 *          Created Date     16-july-2020                                             *
 **************************************************************************************/

public class DeleteBookException extends Exception{
	
	public DeleteBookException() {
		super();
	}
	
	public DeleteBookException(String s) {
		super(s);
	}
}