package com.masai.exception;

public class InvalidItemException extends Exception {
   public InvalidItemException() {
	   super();
   }
   
   public InvalidItemException(String message) {
	   super(message);
   }
}
