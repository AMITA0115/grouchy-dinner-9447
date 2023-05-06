package com.masai.ui;

import java.util.Scanner;

public class Userui {
	
	static void userRegisteration(Scanner sc) {
		
	}
	
	static void userLogin(Scanner sc) {
		
	}
	
	static void updateUser(Scanner sc) {
		
	}
	
	static void changePassword(Scanner sc) {
		
	}
	
	static void addItem(Scanner sc) {
		
	}
	
	static void  updateItem(Scanner sc) {
		
	}
	
	static void viewAllItem(Scanner sc) {
		
	}
	
	static void purchaseItem(Scanner sc) {
		
	}
	
	static void   returnItemWithinFivedays(Scanner sc) {
		
	}
	
	static void viewtransactionHistoryPurchaseItem(Scanner sc) {
		
	}
	
	static void  viewtransactionHistorySoldItem(Scanner sc) {
		
	}
	
	static void viewtransactionHistoryreturnItem(Scanner sc) {
		
	}
	
	
	
	static void deleteAccount(Scanner sc) {
		
	}
	
	static void displayUserMenu() {
		System.out.println("1. All Users");
		System.out.println("2. Items To be Sold");
		System.out.println("3. Item already Sold");
		System.out.println("4. Item By Category");
		System.out.println("5. View all transactions");
		System.out.println("6. View all transactions for a date range");
		System.out.println("7. View transaction by transaction id");
		System.out.println("8. see all refunded products for a date range");
		System.out.println("0. Logout");
	}
	
	
	static void userMenu(Scanner sc) {
		int choice = 0;
		do {
			displayUserMenu();
			System.out.print("Enter selection ");
			choice = sc.nextInt();
    		switch(choice) {
    			case 1:
    				
    				addItem(sc);
    				break;
    			case 2:
    				updateItem(sc);
    				break;
    			case 3:
    				
    				viewAllItem(sc);
    				break;
    			case 4:
    				
    				purchaseItem(sc);
    				break;
    			case 5:
    				returnItemWithinFivedays(sc);
    				break;
    			case 6:
    				viewtransactionHistoryPurchaseItem(sc);
    				break;
    				
    			case 7:
    				viewtransactionHistorySoldItem(sc);
    				break;
    			case 8:
    				viewtransactionHistoryreturnItem(sc);
    				break; 				
    				
    			case 9:
    				changePassword(sc);
    				break;
    			case 10:
    				deleteAccount(sc);
    				System.out.println("Logging you out");
    				choice = 0;
    			case 0:
    				
    				System.out.println("Bye Bye User");
    				break;
    			default:
    				System.out.println("Invalid Selection, try again");
    		}
    		}while(choice != 0);
	}
	
	
	
	

}
