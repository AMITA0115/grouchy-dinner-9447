package com.masai.Dao;

import java.util.List;

import com.masai.entity.Item;
import com.masai.entity.LoggedInUserId;
import com.masai.entity.Transaction;
import com.masai.entity.User;
import com.masai.exception.DuplicateUsernameException;
import com.masai.exception.InsufficientQuantityException;
import com.masai.exception.InvalidCredentialsException;
import com.masai.exception.InvalidItemException;
import com.masai.exception.InvalidTransactionException;
import com.masai.exception.NoRecordFoundException;
import com.masai.exception.UnauthorizedException;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.PersistenceException;
import jakarta.persistence.Query;

public class UserDaoImpl implements UserDao {

	@Override
	public void loginUser(String username, String password) throws InvalidCredentialsException {
		// TODO Auto-generated method stub
		EntityManager em= null;
		try {
			em=EMUtils.getEntityManager();
			Query query = em.createQuery("SELECT u.id FROM User u WHERE username = :username AND password = :password AND isDeleted = 0");
			query.setParameter("username", username);
			query.setParameter("password", password);
			List<Integer> listInt = (List<Integer>)query.getResultList();
			if(listInt.size() == 0) {
				//you are here means company with given name exists so throw exceptions
				throw new InvalidCredentialsException("The username or password is incorrect");
			}
			LoggedInUserId.loggedInUserId = listInt.get(0);
		}catch(PersistenceException ex) {
			throw new InvalidCredentialsException("Unable to process request, try again later");
		}finally{
			em.close();
		}
	}

	@Override
	public void changePassword(String oldPassword, String newPassword) throws InvalidCredentialsException {
		// TODO Auto-generated method stub
		EntityManager em= null;
		try {
			em=EMUtils.getEntityManager();
			Query query = em.createQuery("SELECT count(c) FROM User u WHERE password = :oldPassword AND id = :id");
			query.setParameter("oldPassword", oldPassword);
			query.setParameter("id", LoggedInUserId.loggedInUserId);
			Long userCount = (Long)query.getSingleResult();
			if(userCount == 0) {
				//you are here old password is incorrect for logged in user
				throw new InvalidCredentialsException("Invalid old password");
			}
				User user=em.find(User.class,LoggedInUserId.loggedInUserId);
				EntityTransaction et = em.getTransaction();
				et.begin();
				user.setPassword(newPassword);
				et.commit();
			}catch(PersistenceException ex) {
				throw new InvalidCredentialsException("Unable to process request, try again later");
			}finally{
				em.close();
			}
		}

	@Override
	public void updateUser(User user, String firstName, String lastName, String address, String mobileNo)
			throws DuplicateUsernameException {
		
		
	}

	@Override
	public List<Object[]> getUserList() throws NoRecordFoundException,InvalidCredentialsException {
		// TODO Auto-generated method stub
		EntityManager em = null;
		List<Object[]> userList = null;
		try {
			em = EMUtils.getEntityManager();
			Query query = em.createQuery("SELECT u FROM User u");
			userList=query.getResultList();
			if(userList.size()==0) 
				throw new NoRecordFoundException("No user found");
			
		}catch(PersistenceException ex) {
			throw new InvalidCredentialsException("Unable to processs Pkaease try again");
		}finally {
			em.close();
		}
		return userList;
	}


	@Override
	public List<Item> getAllItemsToBeSold() throws InsufficientQuantityException {
		// TODO Auto-generated method stub
		EntityManager em= EMUtils.getEntityManager();
		try{
			Query query= em.createQuery("SELECT i FROM item i i.soldStatus=1");
			List<Item> items= query.getResultList();
			return items;
		}catch(PersistenceException ex) {
			throw new InsufficientQuantityException("No Items Available For Sale");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally{
			em.close();
		}
		return null;
	}

	@Override
	public List<Item> getSoldItems() {
		// TODO Auto-generated method stub
		EntityManager em= EMUtils.getEntityManager();
		try {
			Query query= em.createQuery("SELECT i FROM item i i.soldStatus=0");
			
			List<Item> items= query.getResultList();
			return items;
		
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally{
			em.close();
		}
		return null;
	}

	@Override
	public List<Item> getItemByCategory() throws InvalidItemException {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public List<Transaction> getAllTransactions() throws InvalidTransactionException {
		// TODO Auto-generated method stub
		
		EntityManager em= EMUtils.getEntityManager();
		try {
			Query query= em.createQuery("SELECT i FROM item i i.soldStatus=0");
			List<Transaction> transaction=query.getResultList();
			return transaction;
			
		}catch(PersistenceException ex) {
			throw new InvalidTransactionException("No Transaction Found");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		return null;
	}

	@Override
	public List<Transaction> getAllTransactionByDate() throws InvalidTransactionException {
		// TODO Auto-generated method stub
		
		return null;
	}

	
}
