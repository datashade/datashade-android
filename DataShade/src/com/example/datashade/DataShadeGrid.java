package com.example.datashade;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class DataShadeGrid extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_data_shade_grid);
	}
	
		

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.data_shade_grid, menu);
		return true;
	}

}


class BlockOfShade extends View {
	
	public BlockOfShade(Context context, AttributeSet attrs) {
		super(context, attrs);
		TypedArray a = context.getTheme().obtainStyledAttributes(
		     attrs,
		     R.styleable.BlockOfShade,
		     0, 0);
		
		
		boolean isShaded = false;
	  
	
	}
	
	public boolean isShaded() {
	    return 
	}

	
	private void drawCell() {
		
		
		
	}
	
		
	public void onDraw(android.graphics.Canvas) {
	   drawCell();
	}
	
	

}