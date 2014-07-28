package com.mycompany.myapp;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.graphics.drawable.*;
import android.view.View.*;

public class MainActivity extends Activity
{
	Button btn;
	ImageView img;
	AnimationDrawable frames;

    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

		img = (ImageView) findViewById(R.id.anim_view);
		img.setBackgroundResource(R.drawable.android_anim);

		frames = (AnimationDrawable) img.getBackground();
		// ну, а если программно назначать фреймы:
		// AnimationDrawable frames = new AnimationDrawable();
		//
		// и для каждого фрейма нужно написать такой код:
		// BitmapDrawable frame1 = (BitmapDrawable) getResourses()
		//     getDrawable(R.drawable.frame1);
		//
		//frames.addFrame(frame1, 100);

		btn = (Button)findViewById(R.id.btn);
		
    }

	public void onStartBtn(View v)
	{
		if (frames.isRunning())
		{
			frames.stop();
			btn.setText("Start");
		}
		else
		{
			frames.start();
			btn.setText("Stop");
		}
	}


	@Override
	public void onWindowFocusChanged(boolean hasFocus)
	{
		if (frames.isRunning())
		{
			frames.stop();
		}
		else
		{
			frames.start();
		}
		super.onWindowFocusChanged(hasFocus);
	}
	
	
	
	
}
