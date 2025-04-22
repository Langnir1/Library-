import java.util.*;

public class Library {
	private ArrayList<Book> books = new ArrayList<>();
	private ArrayList<Customer> customers = new ArrayList<>();
	private Admin admin = new Admin();
	
	public Library(){
		sample();
	}

	private void sample(){
		books.add(new Book("The Hobbit", "J.R.R Tolkien"));
		books.add(new Book("Lord of the Rings", "J.R.R Tolkien"));
	}
	
	public static void main(String[] args){
		Library library = new Library();
		library.start();
	}

	public String menu(){
		Scanner input = new Scanner(System.in);

		System.out.println("\n-----Library-----");
		System.out.println("1) Exit");
		System.out.println("2) Admin Login");
		System.out.println("3) Customer Login");
		System.out.println("Enter Action: ");

		String choice = input.nextLine();
		return choice;
	}
	public void start(){
		boolean keepGoing = true;
		customers.add(new Customer("Joshua", "1111"));
		while(keepGoing){
			String choice = menu();

			if(choice.equals("1")){
				System.out.println("Goodbye");
				keepGoing = false;
			}
			else if(choice.equals("2")){
				System.out.println("You have selected Admin");
				if(admin.login()){
					admin.adminStart(this);
				}
				else{
					System.out.println("Invalid Login");
				}
			}
			else if(choice.equals("3")){
				System.out.println("You have seleced Customer");
				Scanner input = new Scanner(System.in);
				System.out.println("Enter username: ");
				String name = input.nextLine();
				System.out.println("Enter PIN: ");
				String PIN = input.nextLine();

				Customer found = null;
				for(Customer c : customers){
					if(c.login(name, PIN)){
						found = c;
					}
				}

				if(found != null){
					found.customerStart(this);
				}
				else{
					System.out.println("Invalid");
				}
			}
			else{
				System.out.println("Invalid input");
			}
		}
	}

	public void viewAllBooks(){
		System.out.println("[Admin] View all books");
		for(Book b : books){
			System.out.println(b);
		}
	}

	public void viewAllCustomers(){
		System.out.println("[Admin] View all Customers  works!");
		for(Customer c : customers){
			System.out.println(c.getReport());
		}
	}

	public void viewCheckedOutBooks(){
		System.out.println("[Admin] View checked out books works!");
		for(Book b : books){
			if(b.isCheckedOut()){
				System.out.println(b);
			}
		}
	}
	public ArrayList<Book> getBooks(){
		return books;
	}
}
