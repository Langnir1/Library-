import java.util.*;

public class Library {
	//private ArrayList<Book> books = new ArrayList<>();
	//private ArrayList<Customer> customers = new ArrayList<>();
	private Admin admin = new Admin();

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
			}
			else{
				System.out.println("Invalid input");
			}
		}
	}

	public void viewAllBooks(){
		System.out.println("[Admin] View all books");
	}

	public void viewAllCustomers(){
		System.out.println("[Admin] View checked out books works!");
	}

	public void viewCheckedOutBooks(){
		System.out.println("[Admin] View checked out books works!");
	}
}
