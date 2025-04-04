# Library-

#Library book renter
<ins>Summary</ins>
 The idea for this project is to make so that there is a customer and Admin class in Java. The main attraction of this is when a customer rents a book, the book cannot be rented by someone else. There will also be a search function where the Customer can choose to search for the book TITLE, AUTHOR, or GENRE. 
 The Admin class of this project will be able to see the status of all customers and books. Books will be in an arraylist where they will be kept for easy access and organized sorting.

<ins>Data</ins>
 This programs handles 3 main systems  
1. Users:  
	- Admin  
	- Customer  
2. Books:  
	- Title, author, genre, checked out or not, customer name of who borrowed it  
3. Records:  
	- Which customer has which book  
	- Which book is available or not  

ArrayList<Book> holds all books  
ArrayList<Customer> holds all customers

At the moment, the data will not be persistent. Ergo, the data will reset once program closes. A CSV file could be used but this is not the current target.  
Data will be focused into the Library class where most things are placed and ran. 

<ins>Algorithm</ins>

abstract class User{
	String userName;  
	String PIN;  

	boolean login(String userName, String PIN)
}  
	
class Customer extends User  

class Admin extends User  

class Library  

class book  
