package com.masai.Dao;

import java.util.List;

import com.masai.entity.Item;
import com.masai.entity.Transaction;
import com.masai.exception.InsufficientQuantityException;
import com.masai.exception.InvalidCredentialsException;
import com.masai.exception.InvalidItemException;
import com.masai.exception.InvalidTransactionException;
import com.masai.exception.NoRecordFoundException;

public class UserServiceImpl implements UserService {

	@Override
	public List<Object[]> getUserList() throws NoRecordFoundException, InvalidCredentialsException {
		// TODO Auto-generated method stub
		UserDao userdao= new UserDaoImpl();
	
		return userdao.getUserList();
	}

	@Override
	public List<Item> getAllItemsToBeSold() throws InsufficientQuantityException {
		// TODO Auto-generated method stub
		UserDao userdao= new UserDaoImpl();
		return userdao.getAllItemsToBeSold();
	}

	@Override
	public List<Item> getSoldItems() {
		// TODO Auto-generated method stub
		UserDao userdao= new UserDaoImpl();
		return userdao.getSoldItems();
	}

	@Override
	public List<Item> getItemByCategory() throws NoRecordFoundException, InvalidItemException {
		// TODO Auto-generated method stub
		UserDao userdao= new UserDaoImpl();
		return userdao.getItemByCategory();
	}

	@Override
	public List<Transaction> getAllTransactions() throws InvalidTransactionException {
		// TODO Auto-generated method stub
		
		UserDao userdao= new UserDaoImpl();
		return userdao.getAllTransactions();
	}

	@Override
	public List<Transaction> getAllTransactionByDate() throws InvalidTransactionException {
		// TODO Auto-generated method stub
		UserDao userdao= new UserDaoImpl();
		return userdao.getAllTransactionByDate();
	}

}
