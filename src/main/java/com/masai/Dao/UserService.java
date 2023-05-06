package com.masai.Dao;

import java.util.List;

import com.masai.entity.Item;
import com.masai.entity.Transaction;
import com.masai.exception.InsufficientQuantityException;
import com.masai.exception.InvalidCredentialsException;
import com.masai.exception.InvalidItemException;
import com.masai.exception.NoRecordFoundException;
import com.masai.exception.InvalidTransactionException;

public interface UserService {
	
	List<Object[]>getUserList() throws NoRecordFoundException,InvalidCredentialsException;
	
	List<Item> getAllItemsToBeSold() throws InsufficientQuantityException;
	
	List<Item> getSoldItems() ;
	List<Item> getItemByCategory() throws  NoRecordFoundException, InvalidItemException;;
	List<Transaction> getAllTransactions() throws InvalidTransactionException;
	List<Transaction> getAllTransactionByDate() throws InvalidTransactionException;
	

}
