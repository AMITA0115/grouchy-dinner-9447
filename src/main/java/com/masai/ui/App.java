package com.masai.ui;

import java.util.Scanner;

public class App {
	static void displayAdminMenu() {
		System.out.println("1. See All Users");
		System.out.println("2. See all items to be sold");
		System.out.println("3. See all items already sold");
		System.out.println("4. See all items by category");
		System.out.println("5. View all transactions");
		System.out.println("6. View all transactions for a date range");
		System.out.println("7. View transaction by transaction id");
		System.out.println("8. See all refunded products for a date range");
		System.out.println("0. Logout");
	}
	static void adminMenu(Scanner sc) {
		int choice = 0;
		do {
			displayAdminMenu();
			System.out.print("Enter selection ");
			choice = sc.nextInt();
    		switch(choice) {
    			case 1:
    				AdminUi.viewAllUsers(sc);
    				break;
    			case 2:
    				AdminUi.viewAllItems(sc);
    				break;
    			case 3:
    				AdminUi.viewSoldItems(sc);
    				break;
    			case 4:
    				AdminUi.viewItemsByCategory(sc);
    				break;
    			case 5:
    				AdminUi.viewAllTransaction(sc);
    				break;
    			case 6:
    				AdminUi.viewTransactionByDateRange(sc);
    				break;
    			case 7:
    				AdminUi.viewTransactionById(sc);
    				break;
    			case 8:
    				AdminUi.viewAllRefundProductForDateRange(sc);
    				break;
    			
    			case 0:
    				System.out.println("Bye Bye Admin");
    				break;
    			default:
    				System.out.println("Invalid Selection, Please try again");
    		}
    	}while(choice != 0);	
	}
	
	
	
	
	static void adminLogin(Scanner sc) {
		System.out.print("Enter username ");
		String username = sc.next();
		System.out.print("Enter password ");
		String password = sc.next();
		if(username.equals("admin") && password.equals("admin")) {
			adminMenu(sc);
		}else {
			System.out.println("Invalid Credentials");
		}
	}
	
	
	
	 public static void main( String[] args ){
	    	Scanner sc = new Scanner(System.in);
	    	int choice = 0;
	    	do {
	    		System.out.println("1. Admin Login");
	    		System.out.println("2. User Login");
	    		System.out.println("0. Exit");
	    		System.out.print("Enter Selection ");
	    		choice = sc.nextInt();
	    		switch(choice) {
	    			case 1:
	    				adminLogin(sc);
	    				break;
	    			case 2:
	    				Userui.userLogin(sc);
	    				break;
	    			case 0:
	    				System.out.println("Thanks for using the services");
	    				break;
	    			default:
	    				System.out.println("Invalid Selection, try again");
	    		}
	    	}while(choice != 0);
	    	sc.close();
	    }
	

}
