import java.util.*;
import java.io.Serializable;

public class User{
	String userName;
	String PIN;
	
	public String getUserName(){
		return userName;
	}

	public void setUserName(String userName){
		this.userName = userName;
	}

	public static void main(String[] args){
		System.out.println("Hello World");
		String a = "People";
		System.out.println(a);
		User.sayHi();
	}

	public static void sayHi(){
		System.out.println("Say Hi works");
		String a = "Testing a in sayHi";
		System.out.println(a);
		int f = 1900;
		int p = 100;
		int sum = f + p;
		System.out.println(sum);
	}
}

