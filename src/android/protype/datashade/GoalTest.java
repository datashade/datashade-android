package android.protype.datashade;

import java.util.Arrays;
import java.util.List;

class GoalTest extends Goal
{
	GoalTest()
	{
		List<String> temp = Arrays.asList(
				"Correctly Place Scissors in Hand",
				"Maintain proper hold with thumb facing upwards",
				"Make snips along the edge of paper",
				"Make consecutive cuts into paper",
				"Cut along 6 inch straight line",
				"Cut across entire length of paper",
				"Hold and rotate paper while cutting",
				"Cut out straight line shapes (square/triangle)",
				"Cut along curved/wavy lines",
				"Cut out curved line shapes (circle/oval)",
				"Deviates no more then 0.5 from guideline",
				"Deviates no more then 0.25 from guideline",
				"Cuts out complex pictures involving curved and straight lines"
				);
		for(String x : temp )
		{
			ListOfSteps.add( new Step( x ) );
		}
		
		this.LevelsOfIndependence.add("Hand over Hand");
		this.LevelsOfIndependence.add("Model");
		this.LevelsOfIndependence.add("Verbal");
		this.LevelsOfIndependence.add("Independent");
	}
}