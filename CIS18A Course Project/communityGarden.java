// CIS-18A COURSE PROJECT
// COMMUNITY GARDEN

import java.util.Scanner;

class Person 
{
	// public member variables to use in receipt
	public String name; // contact's name
	public String phoneNumber; // contact's phone number
	public String emailAddress; // contact's email address

	public Person(String name, String phoneNumber, String emailAddress) // constructor to return multiple values with getContactInfo function
	{
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}
}

class communityGarden {
	public static void main(String[] args) {
	
	Scanner scan = new Scanner (System.in); //implements scanner for main

	int apptChoice, donoChoice, dayChoice, itemChoice; // declarations for future switch statements
	String timeChoice; //declaration for specific appointment time
	Person contact = new Person("", "", ""); // declares null object of type person to edit in later switch statement
	String gTimeChoice = ""; // declares null time for appointment to insert in later switch statement
	int gDayChoice = 0; // declares null day of the week for appointment to change in later switch statement
	String fDayChoice = ""; // will be filled in for order summary
	
	System.out.print("\nHello and welcome to the Moreno Valley community garden."); //introduction message
	System.out.print("\nWe are open Monday-Friday 8:00 AM - 8:00 PM, and Saturday 8:00 AM - 5:00 PM. Closed on Sunday."); //introduction message part 2

	do {
	apptChoice = apptSelection(); //declares choice from selection function
		switch(apptChoice) { //creates cases for each choice 
		case 1: // user chooses yes for appointment
			contact.name = getContactName();
			contact.phoneNumber = getContactPhoneNumber();
			contact.emailAddress = getContactEmail();
			dayChoice = daySelection(); //finds what day the user wants an appointment on
			gDayChoice = dayChoice; //changes null variable from outside the scope of the switch statement that was declared earlier
			if (dayChoice == 6) //if the day of the week for appt is saturday, open hours are 8:00am to 5:00pm
			{
				System.out.println("\nPlease enter a time from 8:00 AM - 5:00 PM");
				timeChoice = scan.nextLine();
				gTimeChoice = timeChoice; // changes null variable from outside the scope of the switch statement that was declared earlier
			}
			else //if the day of the week for appt is mon-fri, open hours are 8:00am to 8:00pm
			{
				System.out.println("\nPlease enter a time from 8:00 AM - 8:00 PM");
				timeChoice = scan.nextLine();
				gTimeChoice = timeChoice; // changes null variable from outside the scope of the switch statement that was declared earlier
			}
			break;
		case 2: //user chooses no for appointment
			break; //continues to code after switch statement since user chose no.
		default: //if user doesn't choose a given option
			System.out.println("\nInvalid choice. Please enter one of the given options.");
			break;
		}
	} while(apptChoice > 2 || apptChoice < 1); //input validation 
	
	do {
	donoChoice = donoSelection(); //declares choice from selection function
		switch(donoChoice) { //creates cases for each choice
		case 1: //user chooses yes to donate
			itemChoice = itemSelection(); //finds what specific item the user wants to donate
			break;
		case 2: // user chooses no to donate
			break;  //continues to code after switch statement since user chose no.
		default: //if user doesn't choose a given option
			System.out.println("\nInvalid choice. Please enter one of the given options.");
			break;
		}
	} while (donoChoice > 2 || donoChoice < 1); // input validation
	
	//converts day choice from int to string
	if (gDayChoice == 1)
	{
		fDayChoice = "Monday";
	}
	else if (gDayChoice == 2)
	{
		fDayChoice = "Tuesday";
	}
	else if (gDayChoice == 3)
	{
		fDayChoice = "Wednesday";
	}
	else if (gDayChoice == 4)
	{
		fDayChoice = "Thursday";
	}
	else if (gDayChoice == 5)
	{
		fDayChoice = "Friday";
	}
	else if (gDayChoice == 6)
	{
		fDayChoice = "Saturday";
	}

	System.out.println("\nOrder Summary"); //Displays order summary/appointment as a receipt
	System.out.println("\n--------------------------------------------------------------------------------------\n");
	if (apptChoice == 1) //if the user chose yes to make an appointment
	{
		System.out.println("Name: " + contact.name  + ", Phone Number: " + contact.phoneNumber + ", E-mail Address: " + contact.emailAddress);
		System.out.println("Appointment Date: " + fDayChoice + " at " + gTimeChoice); 
	}
	else //user chose not to make an appointment
	{
		System.out.println("Appointment Date: None");
	}
	if (donoChoice == 1) //if the user chose yes to donate
	{
		System.out.println("Donated? Yes"); 
	
	}
	else //user chose no to donate
	{
		System.out.println("Donated? No"); 
	}

	System.out.println("Have a great day! Thank you for visiting Moreno Valley community garden.");

}
			
public static int apptSelection()
{
	int selection;

	Scanner scan = new Scanner (System.in);
	System.out.println("\nWould you like to set an appointment?");
	System.out.println("1 - Yes");
	System.out.println("2 - No");
	System.out.print("\n");
	selection = scan.nextInt();
	return selection;
}

public static int donoSelection()
{
	int selection;
	
	Scanner scan = new Scanner (System.in);
	System.out.println("\nWould you like to donate?");
	System.out.println("1 - Yes");
	System.out.println("2 - No");
	System.out.print("\n");
	selection = scan.nextInt();
	return selection;
}

/*public static Person getContactInfo()
{
	String contactName, contactPhoneNumber, contactEmail;

	Scanner scan = new Scanner (System.in);
	System.out.println("\nPlease enter your name.");
	contact.name = scan.nextLine();
	System.out.println("Please enter your phone number.");
	contact.phoneNumber = scan.nextLine();
	System.out.println("Please enter your e-mail address.");
	contact.emailAddress = scan.nextLine();

	return new Person(contactName, contactPhoneNumber, contactEmail);
}*/

public static String getContactName()
{
	String contactName;

	Scanner scan = new Scanner (System.in);
	System.out.println("\nPlease enter your name.");
	contactName = scan.nextLine();
	return contactName;
}

public static String getContactPhoneNumber()
{
	String contactPhoneNum;

	Scanner scan = new Scanner (System.in);
	System.out.println("Please enter your phone number.");
	contactPhoneNum = scan.nextLine();
	return contactPhoneNum;
}

public static String getContactEmail()
{
	String contactEmail;

	Scanner scan = new Scanner (System.in);
	System.out.println("Please enter your e-mail address.");
	contactEmail = scan.nextLine();
	return contactEmail;
}

public static int daySelection()
{
	int selection;

	Scanner scan = new Scanner (System.in);
	System.out.println("\nWhat day would you like to book an appointment?");
	System.out.println("1 - Monday");
	System.out.println("2 - Tuesday");
	System.out.println("3 - Wednesday");
	System.out.println("4 - Thursday");
	System.out.println("5 - Friday");
	System.out.println("6 - Saturday");
	System.out.print("\n");
	selection = scan.nextInt();
	while (selection < 1 || selection > 6) //input validation
	{
		System.out.println("\nInvalid choice. Please enter one of the given options."); 
		selection = scan.nextInt();
	}
	return selection;
}

public static int itemSelection()
{
	int selection;

	Scanner scan = new Scanner (System.in);
	System.out.println("\nPlease select the category your donation falls under");
	System.out.println("1 - Seeds");
	System.out.println("2 - Soil");
	System.out.println("3 - Fertilizer");
	System.out.println("4 - Gardening tools");
	System.out.println("5 - Voluntary labor");
	System.out.print("\n");
	selection = scan.nextInt();
	while (selection < 1 || selection > 5) //input validation
	{
		System.out.println("\nInvalid choice. Please enter one of the given options."); 
		selection = scan.nextInt();
	}
	return selection;
}
	
}	

	
