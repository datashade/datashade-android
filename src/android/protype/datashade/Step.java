package android.protype.datashade;

import java.util.List;

public class Step
{
	// Constructors 
	public Step( String Description )
	{
		m_Description = Description;
	}
	
	// Getters 
	public String Description()
	{
		return m_Description;
	}
	public void Description(String newDescription)
	{
		m_Description = newDescription;
	}
	
	// Setters
	public void AddAttempt(Entry attemptToTrack)
	{
		m_Attempts.add(attemptToTrack);
	}
	public List<Entry> GetAttempts()
	{
		return m_Attempts;
	}
	
	// Private Data
	private String m_Description;
	private List<Entry> m_Attempts;
}