import java.util.*;

public class Customer extends User{
	private ArrayList<Book> checkedOutBooks = new ArrayList<>();

	public Customer(String userName, String PIN){
		this.userName = userName;
		this.PIN = PIN;
	}

	public String menu(){
		Scanner input = new Scanner(System.in);

		System.out.println("\n-----Customer-----");
		System.out.println("1) Exit");
		System.out.println("2) view all books");
		System.out.println("3) View your checked out books");
		System.out.println("4) Check out a book");
		System.out.println("5) Return a book");

		System.out.println("Enter Action: ");
		return input.nextLine();
	}
	public void customerStart(Library library){
		boolean keepGoing = true;

		while(keepGoing){
			String choice = menu();

			if(choice.equals("1")){
				System.out.println("Goodbye");
				keepGoing = false;
			}
			else if(choice.equals("2")){
				library.viewAllBooks();
			}
			else if(choice.equals("3")){
				viewCheckedOutBooks();
			}
			else if(choice.equals("4")){
				checkOutBook(library);
			}
			else if(choice.equals("5")){
				returnBook();
			}
			else{
				System.out.println("Invalid input");
			}
		}
	}
	public void viewCheckedOutBooks(){
		if (checkedOutBooks.isEmpty()){
			System.out.println("You have no books checked out");
		}
		else{
			System.out.println("Your Checked out Books are: ");
			for(Book b : checkedOutBooks){
				System.out.println(b);
			}
		}
	}
	public void checkOutBook(Library library){
		Scanner input = new Scanner(System.in);
		ArrayList<Book> allBooks = library.getBooks();

		System.out.println("Available Books: ");
		int index = 1;
		ArrayList<Book> availableBooks = new ArrayList<>();

		for(Book b : allBooks){
			if(!b.isCheckedOut()){
				System.out.println(index + ") " + b);
				availableBooks.add(b);
				index++;
			}
		}
		if(availableBooks.isEmpty()){
			System.out.println("No books are currently available.");
			return;
		}

		System.out.println("Enter book number to check out: ");
		int choice = input.nextInt();
		input.nextLine();
		
		if(choice < 1){
			System.out.println("Invalid");
			return;
		}
		if(choice > availableBooks.size()){
			System.out.println("Invalid");
			return;
		}
		Book selected = availableBooks.get(choice - 1);
		selected.isChecked();
		checkedOutBooks.add(selected);

		System.out.println("You checked out: " + selected.getTitle());
	}
	public void returnBook(){
		if(checkedOutBooks.isEmpty()){
			System.out.println("You have no books to return");
			return;
		}
		
		Scanner input = new Scanner(System.in);
		System.out.println("Your checked out books:");
		for(int i = 0; i < checkedOutBooks.size(); i++){
			System.out.println((i + 1) + ") " + checkedOutBooks.get(i));
		}

		System.out.print("Enter book number to return:  ");
		int choice = input.nextInt();
		input.nextLine();
		
		if(choice < 1){
			System.out.println("Invalid");
			return;
		}
		if(choice > checkedOutBooks.size()){
			System.out.println("Invalid");
			return;
		}

		Book toReturn = checkedOutBooks.remove(choice - 1);
		toReturn.returnBook();
		System.out.println("You returned: " + toReturn.getTitle());
	}
	public String getReport(){
		return "Customer: " + userName + " | Books borrowed: " + checkedOutBooks.size();
	}
}
