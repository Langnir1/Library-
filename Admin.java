import java.util.*;

public class Admin extends User{
	
	public Admin(){
		this.userName = "admin";
		this.PIN = "0000";
	}

	public static void main(String[] args){
		Admin admin = new Admin();
		System.out.println(admin.getReport());
	}

	public String menu(){
		Scanner input = new Scanner(System.in);

		System.out.println("\n-----Admin Menu-----");
		System.out.println("1) exit");
		System.out.println("2) View all books");
		System.out.println("3) View all Customers");
		System.out.println("4) View checked out books");

		String choice = input.nextLine();
		return choice;
	}

	public void adminStart(Library library){
		boolean keepGoing = true;

		while(keepGoing){
			String choice = menu();

			if(choice.equals("1")){
				System.out.println("Goodbye");
				keepGoing = false;
			}
			else if(choice.equals("2")){
				System.out.println("View all books");
				library.viewAllBooks();
			}
			else if(choice.equals("3")){
				System.out.println("View all customers");
				library.viewAllCustomers();
			}
			else if(choice.equals("4")){
				System.out.println("view checked out books");
				library.viewCheckedOutBooks();
			}
			else{
				System.out.println("Invalid");
			}
		}
	}

	public String getReport(){
		return "Admin: " + this.userName + ", PIN: " + this.PIN;
	}

}
