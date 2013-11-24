package android.protype.datashade;

import java.util.List;

class Student
{
	// Constructors
	public Student(String FirstName, String LastName)
	{
		m_firstName = FirstName;
		m_lastName  = LastName;
	}
		
	// Setters 
	void FirstName(String newFirstName) 
	{
		m_firstName = newFirstName;
	}
	void LastName(String newLastName)
	{
		m_lastName = newLastName;
	}
	void Name(String newFirstName, String newLastName)
	{
		FirstName(newFirstName);
		LastName(newLastName);
	}
	void AddGoal(Goal goalToAdd)
	{
		m_ListOfGoals.add(goalToAdd);
	}
	
	// Getters
	String FirstName() { return m_firstName; }
	String LastName() { return m_lastName; }
	List<Goal> GetListOfGoals(){ return m_ListOfGoals; }
	
	
	private List<Goal> m_ListOfGoals;
	private String m_firstName;
	private String m_lastName;
}			