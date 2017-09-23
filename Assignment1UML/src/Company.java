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

public class Company {
	String name;
	ArrayList<Plane> planes;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Company(String name) {
		super();
		this.name = name;
		planes = new ArrayList<Plane>();
	}
	public Company() {
		super();
		planes = new ArrayList<Plane>();
	}
	public void addAircraft(Plane plane) {
		planes.add(plane);
	}
}
