package com.masai.exception;

public class InvalidTransactionException extends Exception {
	
	public InvalidTransactionException() {
		super();
	}
    
	public InvalidTransactionException(String message) {
		super(message);
	}
    
}
