package com.masai.Dao;

import java.util.List;

import com.masai.entity.Item;
import com.masai.entity.Transaction;
import com.masai.entity.User;
import com.masai.exception.DuplicateUsernameException;
import com.masai.exception.InvalidCredentialsException;
import com.masai.exception.InvalidItemException;
import com.masai.exception.UnauthorizedException;
import com.masai.exception.InsufficientQuantityException;
import com.masai.exception.InvalidTransactionException;


public interface UserDao {
    
    // User registration
    public User registerUser(String username, String firstName, String lastName, String address, String mobileNo, String password) throws DuplicateUsernameException;

    // User login and logout
    public User loginUser(String username, String password) throws InvalidCredentialsException;
    public void logoutUser(User user);
    
    // Update user details
    public User updateUser(User user, String firstName, String lastName, String address, String mobileNo) throws DuplicateUsernameException;
    public void changePassword(User user, String oldPassword, String newPassword) throws InvalidCredentialsException;
    
    // Add, update and delete products for sell
    public Item addItem(User user, String name, double price, int quantity, String description, String category) throws InvalidItemException;
    public Item updateItem(User user, int Item_id, String name, double price, int quantity, String description, String category) throws InvalidItemException, UnauthorizedException;
    public void deleteItem(User user, int Item_id) throws InvalidItemException, UnauthorizedException;
    
    // Get items available for sell
    public List<Item> getitemsForSale();
    public List<Item> getitemsByCategory(String category);
    
    // Purchase and return products
    public Transaction purchaseItem(User user, int transaction_id) throws InvalidItemException, InsufficientQuantityException;
    public Transaction returnItem(User user, int transactionId) throws InvalidTransactionException, UnauthorizedException;
    
    // Get transaction history
    public List<Transaction> getPurchaseHistory(User user);
    public List<Transaction> getSaleHistory(User user);
    public List<Transaction> getReturnHistory(User user);
    
    // Delete user account
    public void deleteUser(User user) throws UnauthorizedException;
    
}
