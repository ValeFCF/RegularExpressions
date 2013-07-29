package com.Valentin.regularexpression;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;

public class Exit extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_exit);
	}

	 public void Exit(View v) 
	    {
	    	//Salir de toda la aplicación
	    	
	    	Intent oIntent;
	    	oIntent = new Intent();
	        oIntent.setAction(Intent.ACTION_MAIN);
	        oIntent.addCategory(Intent.CATEGORY_HOME);
	        oIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	        startActivity(oIntent); 
	        android.os.Process.killProcess(android.os.Process.myPid());
	    	
	    }

}
