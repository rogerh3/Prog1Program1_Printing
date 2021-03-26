//Project: Project 1 - Printing
//Author: Roger H Hayden III
//Desc: Using Identifiers
//Version: 1.1
//Last Updated: 9/3

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Here I will put my inputs for what I want to come out
		//My Favorite Number
		//My full name
		short age;
		age = 21;
		//Age and then using a variable
		System.out.println("I am" + " " + age + " " + "years old");
		
		byte favoriteNumber; 
		favoriteNumber = 7;
		//Favorite Number then labeling variable
		System.out.println("My favorite number is"+ " " + favoriteNumber);
		
		String firstName = "Roger";
		String lastName = "Hayden III";
		// First Name and Last Name inputted here
		System.out.println("My first name is" + " " + firstName);
		System.out.println("My last name is" + " " + lastName);
		
		String fullName = firstName + " " + lastName;
		//Full name in one variable
		System.out.println("Together my full name is" + " " + fullName);
		
		System.out.print("It is nice to meet you!");
	}

}
