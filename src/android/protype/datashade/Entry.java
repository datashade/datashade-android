package android.protype.datashade;

import java.util.Date;

class Entry
{
	// Constructors 
	Entry(boolean wasSuccessful)
	{
		this.m_dateOfEvent = new Date();
		this.m_wasSuccessful = wasSuccessful;
	}
	Entry(boolean wasSuccessful, Date dateOfEvent )
	{
		this.m_dateOfEvent = dateOfEvent;
		this.m_wasSuccessful = wasSuccessful;
	}
	
	// Gets
	boolean WasSuccessful(){ return m_wasSuccessful; }
	Date dateOfEntry(){ return m_dateOfEvent; }
	
	private Date m_dateOfEvent;
	private boolean m_wasSuccessful;
}