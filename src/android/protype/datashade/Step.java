package android.protype.datashade;

import java.util.List;

public class Step
{
	public Step( String Description )
	{
		m_Description = Description;
	}
	
	public String GetDescription()
	{
		return m_Description;
	}
	
	public String m_Description;
	public List<Entry> m_Attempts;
}