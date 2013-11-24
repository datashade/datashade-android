package android.protype.datashade;

import java.util.List;

class Goal
{
	// Constructors
	public Goal() 
	{	
	}
	
	// Getters
	public List<Step> getListOfSteps() {
		return ListOfSteps;
	}
	public List<String> getLevelsOfIndependence() {
		return LevelsOfIndependence;
	}
	
	// Setters
	public void AddStep( Step StepToAdd )
	{
		ListOfSteps.add(StepToAdd);
	}
	public void AddLevelOfIndependence( String LevelToAdd )
	{
		LevelsOfIndependence.add( LevelToAdd );
	}
	
	private List<Step> ListOfSteps;
	private List<String> LevelsOfIndependence;
}