import java.util.*;
import java.io.Serializable;

public abstract class User implements Serializable{
	String userName;
	String PIN;
	
	public String getUserName(){
		return userName;
	}

	public void setUserName(String userName){
		this.userName = userName;
	}

	public String getPIN(){
		return PIN;
	}

	public void setPIN(String PIN){
		this.PIN = PIN;
	}

	public boolean login(String userName, String PIN){
		return this.userName.equals(userName) && this.PIN.equals(PIN);
	}

	public boolean login(){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a Username: ");
		String userInput = input.nextLine();

		System.out.println("Enter a PIN: ");
		String PINInput = input.nextLine();

		return login(userInput, PINInput);
	}

	public abstract String getReport();

	public static void main(String[] args){
		System.out.println("Hello World");
		//String a = "People";
		//System.out.println(a);
		//User.sayHi();
		//userName = "John";
		//getUserName();
	}
/*
	public static void sayHi(){
		System.out.println("Say Hi works");
		String a = "Testing a in sayHi";
		System.out.println(a);
		int f = 1900;
		int p = 100;
		int sum = f + p;
		System.out.println(sum);
	} */
}

