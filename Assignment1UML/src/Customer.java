/*Author: Brian Zhang and Christian Fusco
Class: CSI-480-01/02
Assignment: Lab 1
Date Assigned: 9/12/2017
Due Date: 9/19/2017

Description:
UML design doc with matching java code.  A program for managing flights and iternaries.

Certification of Authenticity: 
I certify that this is entirely my own work, except where I have given 
fully-documented references to the work of others. I understand the definition 
and consequences of plagiarism and acknowledge that the assessor of this 
assignment may, for the purpose of assessing this assignment:
- Reproduce this assignment and provide a copy to another member of academic
- staff; and/or Communicate a copy of this assignment to a plagiarism checking
- service (which may then retain a copy of this assignment on its database for
- the purpose of future plagiarism checking)
*/
import java.util.ArrayList;

public class Customer {
	ArrayList<Booking> bookings;
	String firstName, lastName;

	public String toString() {
		String output = "Bookings for " + firstName + " " + lastName + "\n\n";
		for (Booking booking : bookings){
			Itinerary i = new Itinerary(this, booking);
			output += i.toString();
		}
		return output;
	}

	void addFlight(Booking booking) {
		bookings.add(booking);
	}
	
	public ArrayList<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(ArrayList<Booking> bookings) {
		this.bookings = bookings;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Customer(String firstName, String lastName) {
		super();
		bookings = new ArrayList<Booking>();
		this.firstName = firstName;
		this.lastName = lastName;
	}
}
