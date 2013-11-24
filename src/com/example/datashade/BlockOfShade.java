package com.example.datashade;


import java.util.ArrayList;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
//import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;


public class BlockOfShade extends View {

	Paint mWhite;
	Paint mRed;
	Paint mGreen;
	Paint mShade;
	Paint mBlack;
	float h;
	public float tempX;
	public float tempY;
	
	int count = 0; 
	
	boolean mShowText;
	int mTextPos;
	boolean mIsShaded = false;
	
	public BlockOfShade(Context context, AttributeSet attrs) {
		   super(context, attrs);

		   TypedArray a = context.getTheme().obtainStyledAttributes(
		        attrs,
		        R.styleable.BlockOfShade,
		        0, 0);

		   try {
		       mShowText = a.getBoolean(R.styleable.BlockOfShade_showText, true);
		       mTextPos = a.getInteger(R.styleable.BlockOfShade_labelPosition, 0);
		       //mIsShaded = a.getBoolean(R.styleable.BlockOfShade_isShaded, false);
		   } finally {
		       a.recycle();
	       }
		   
	
		  
		  // bp.setLayoutParams(new LayoutParams(LayourParams.WRAP_CONTENT,
			//	             LayourParams.WRAP_CONTENT))

		   //bm.setLayoutParams(new LayoutParams(LayourParams.WRAP_CONTENT,
			//	             LayoutParams.WRAP_CONTENT))

		   
		    mWhite = new Paint();
		    this.mWhite.setColor(0xff000000);
			
		    mBlack = new Paint();
		    this.mBlack.setColor(0xff000000);
			
			mRed = new Paint();
			this.mRed.setColor(0xffff0000);
			
			mGreen = new Paint();
			this.mGreen.setColor(0xff00ff00);
			
			mShade = new Paint();
			this.mShade.setColor(0xff005500);
	
			ArrayList<View> test = new ArrayList<View>();
			test.add(this);
			this.addTouchables( test );
    }
	
	@Override 
	protected void onDraw(Canvas canvas)
	{  
		float w = this.getWidth();
    	h = this.getHeight();
    	float c = w/28;
		
    	
    	canvas.drawRect(0, 0, w, h/2,  this.mGreen);
	    canvas.drawRect(0, h/2, w, h, this.mRed );
	
	    canvas.drawRect((3*w)/8, h/4 - c, (5*w)/8, h/4 + c, this.mWhite);
	    canvas.drawRect(w/2 - c, h/4 - w/8, w/2 + c, h/4 + w/8, this.mWhite);
	    canvas.drawRect((3*w)/8, (3*h)/4 - c, (5*w)/8, (3*h)/4 + c, this.mWhite);
	    
	
		
		// Draw borders
		canvas.drawRect(0, 0, c, h, this.mBlack);
		canvas.drawRect(0, 0, w, c, this.mBlack);
		canvas.drawRect(0, h - c, w, h, this.mBlack);
		canvas.drawRect(w - c, 0, w, h, this.mBlack);
		
		if (this.mIsShaded) {
			canvas.drawRect(0, 0, w, h, this.mShade);
		}

		//canvas.drawText("Micro Dick", 50, 50, new Paint(0xffffff) );
		

		
		this.setOnTouchListener( new View.OnTouchListener() {
			public boolean onTouch(View v, MotionEvent event)
			{
				tempX = event.getX();
				tempY = event.getY();
				return false;
			}
		});
		
		this.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				if( (v.getHeight() / 2 ) > tempY )
				{
					// Top click
					count++;
				}
				else
				{
					// Bottom click
					count--;
				}
				if( count > 4 ) mIsShaded = true;
				v.invalidate();
				
				
			}
		});
	
	}
}