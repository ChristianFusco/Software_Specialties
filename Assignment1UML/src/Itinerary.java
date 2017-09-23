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

public class Itinerary {
	String firstName, lastName, departurePlace,
		   destinationPlace, departureTime, 
		   departureDate, seatType;

	public Itinerary(Customer c, Booking b) {
		Flight f = b.getFlight();
		firstName = c.getFirstName();
		lastName = c.getLastName();
		departurePlace = f.getDeparturePlace();
		destinationPlace = f.getDestinationPlace();
		departureTime = f.getDepartureTime();
		departureDate = f.getDepartureDate();
		seatType = b.getSeat().toString();
	}

	public String toString(){
		return "------------------------------\n"
			   +"First Name: " + firstName + "\n"
			   + "Last Name: " + lastName + "\n"
			   + "From: " + departurePlace + "\n"
			   + "To: " + destinationPlace + "\n"
			   + "Time: " + departureTime + "\n"
			   + "Date: " + departureDate + "\n"
			   + "Seat Type: " + seatType + "\n"
			   + "------------------------------\n\n";
	}
}
