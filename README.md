# Library-

#Library book renter  

<ins>Summary</ins>  

 The idea for this project is to make so that there is a customer and Admin class in Java. The main attraction of this is when a customer rents a book, the book cannot be rented by someone else. ^^There will also be a search function where the Customer can choose to search for the book TITLE, AUTHOR, or GENRE. 
 The Admin class of this project will be able to see the status of all customers and books. Books will be in an arraylist where they will be kept for easy access and organized sorting.

^^Search function did not get completed in time :( 4/22/25.

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
<ins>Algorithm - explain version</ins>

#Users  

This is a very simple class that makes a basic blueprint and structure for the Admin and Customer class. May contain non-project specific code that has no effect on the final outcome.  

#Customer  

The Customer class focuses on the idea of customers viewing all books, checking out books, their OWN books, and returning said books. It will feature various arrayLists that help move books.
The best way to explain it is this: An ArrayList that contains all book will be accessed by the Customer (Who we shall for now refer to as John). John sees the current status of all the books. John decides to check out a book so he goes to the check out menu to select said book. 
That book then moves from available books into checked out books. When the admin or customer views all books, that book still appears but now says "checked out". Returning the book is the same as checking out but backwards.  

#Admin  

The Admin class is very simple. userName is "admin" and PIN is "0000". Admin can see all books, view all customers, and view all checked out books. That last one is great for long lists of books. Admin is very simple.  

#Library

The class that manages everything. Library creates the books and customers ArrayList. It also contains a sample number of books, maybe something like Narnia or LOTR. In the main method, it will also make sample customers named something like Jane and John Doe.
This class also contains a menu that lets the user choose between admin and customer logins. Once the run begins, if the correct login works, the user will be signed in. It will also contain methods that: allow the view of all books, viewing all customers (Admin), viewing checked books(admin), and somthing like bookGet or getBooks for getting books(something Customer will need).

<ins>Algorithm - code-ish version</ins>

abstract class User{
	String userName;  
	String PIN;  
	
	getUserName();  
	setUserName();  
	
	setPIN();  
	getPIN();  

	boolean login(String userName, String PIN){  
		return userName.equals(userName) && PIN.equals(PIN)  
	}  

	boolean login(){  
		Scanner input = new Scanner()  
		
		print("enter a username")  
		print("enter a pin")  

		return login(userName PIN)
	}  
	public abstract String getReport();  
}  
	
class Customer extends User{  
	private ArrayList<Books> checkedOutBooks;
	
	public Customer(){  
	userName;  
	PIN;  
	} 
	
	Menu(){  
		Scanner input

		-----Customer-----  
		1) Exit  
		2) View all Books  
		3) View Your checked out books  
		4) Check out a book  
		5) Return a book  

		return input
	}  
	customerStart(){  
		boolean keepGoing  
		while(keepGoing)  
			if choice equals 1, "goodbye" | keepGoing = false  
			if choice equals 2, viewAllBooks()    
			if choice equals 3, viewCheckedOutBooks()  
			if choice equals 4, checkOutBook()  
			if choice equals 5, returnBook()
			else, invalid
	}
	viewCheckedOutBooks(){  
		if checkedOutBooks is empty, "No books checked out"  
		else, "checked books are:" {  
			for Book b in checkedOutBooks, print(b)  
		}
	}  
	checkOutBook(Library library){  
		scanner input  
		ArrayList<Book> allBooks = library.getBooks()
		ArrayList<Book> availableBooks = newArrayList  

		print("available books")  
		int index = 1    
		
		for Book b in allBooks{  
			if b is not checkedOut, print(index + ")" + b)  
			availableBooks.add(b)  
			index++  
		}  
	
		if(availableBooks is empty){  
			print("No books available")  
		}	
		print("book number to check out:")  
		int choice = input.nextInt
	
		if choice is less then 1 or greater then the number of available books, print(invalid)  
	
		Book selected gets availableBooks(choice - 1)  //if choice = 1 then it returns index 0.  
		selected.isChecked()  
		add 'selected' to checkedOutBooks  

	}  

	returnBook(){  
		check if checkedOutBooks is empty.  
		
		for loop that loops through checkedOutBooks and prints each book.  

		int choice and invalid statements just like checkOutBook.  
		
		Book return gets checkedOutBooks(choice - 1) and runs the returnBook() method in Book.class 
	}  
	getReport(){  
		return Customer userName and # of books borrowed
	}
}

class Admin extends User{  
	public Admin(){  
		userName = "admin"  
		PIN = "0000"  
	}  

	main(){  
		new Admin called admin
	}

	menu(){  
		-----Admin Menu-----  
		1) Exit  
		2) View All Books  
		3) View all customers  
		4) checked out books  

		return choice  
	}  

	adminStart(){  
		if choice equals the menu numbers, call the methods from library  
	}  
	getReport(){  
		return admin information
	}
}

class Library{  
	private ArrayList for Book and Customer called books and customers respectivly  
	private Admin which is a new Admin called admin  

	public Library(){
		sample() //sample of books
	}  

	private sample{  
		book.add(new Book("",""))
	}  

	main(){  
		Library library = new Library()  
		library.customers.add(new Customer("John Doe", "1111"))
		library.start()
	}  

	menu(){  
		-----Library menu-----  
		1) Exit  
		2) Admin Login  
		3) Customer Login 
	}

	start(){  
		keepGoing = true  
		while(keepGoing){  
			choice = menu()  
			if choice equals 2{  
				if(admin.login()){  
					adminStart()
				}
			}
			if choice equals 3{  
				enter username and PIN of customer  
				Customer found = null  
				for Customer c in customers{  
					if c.login() = true{found = c}
				}  
				if found != null{found.customerStart()}
			}
		}
	}  
	viewAllBooks(){  
		for Book b in books{print(b)}
	}  
	viewAllCustomers(){  
		for Customer c in customers{print(c.getReport())}  
	}  
	viewCheckedOutBooks(){  
		for Book b in books{if b.isCheckedOut(), print(b)}
	}  
	ArrayList<Book> getBooks(){  
		return books
	}
}

class book{  
	private title, author  
	private boolean isCheckedOut

	Book(){  
		title = title  
		author = author  
		isCheckedOut = false  
	}  
	getTitle()  
	getAuthor()  
	isCheckedOut()  
	isChecked()  
	returnBook()  
	toString(){  
		return title \ author + is it checked out or available
	}
}  
