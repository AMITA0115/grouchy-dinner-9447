# Automated Auction System

An automated Auction System is an application software designed for the buying and selling of products in an auction setting. This system can be utilized by auction companies to facilitate their auctions. It enables registered buyers and sellers to participate in the auction process. The system has two main types of users: Administrators and Users (buyers and sellers).

## System Users

### Administrator

The administrator has the following privileges:

- Login and logout functionality
- View all users registered in the system
- Access a list of items to be sold
- Access a list of items that have already been sold
- View items categorized by their respective categories
- View all transactions made in the system
- Filter transactions based on a specific date range
- View transactions by transaction ID
- View all refunded products within a specific date range

Please note that the administrator's credentials are predefined and fixed as follows:
- Username: admin
- Password: admin

### User

A user, who can be both a buyer and a seller, has the following capabilities:

- Register by providing personal details such as username, first name, last name, address, mobile number, and password
- Login and logout functionality
- Update personal details
- Change password
- Add an item to sell by providing item ID, name, price, quantity, description, sold status (0 for unsold, 1 for sold), and category (Clothing, Electronics, Grocery, or Miscellaneous)
- Update the details of a product they wish to sell
- View all items available for sale
- Purchase an item (cannot purchase an item added by themselves)
- Return a purchased item within 5 days of purchase
- View transaction history of purchased items
- View transaction history of sold items
- View transaction history of returned items
- Delete their account

Please note that the system maintains relationships between transactions and users. Each transaction involves two users: the buyer and the seller. A user can have any number of transactions.

For further information or assistance, please refer to the documentation or contact the system administrators.

## Installation and Setup

1. Clone the repository to your local machine.
2. Install the necessary dependencies and libraries.
3. Set up a database to store user information, items, and transactions.
4. Configure the database connection in the system configuration file.
5. Run the application and access it through a web browser.

## Contributors

- Individual
