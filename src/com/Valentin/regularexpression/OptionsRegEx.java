package com.Valentin.regularexpression;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class OptionsRegEx extends Activity {
	
	
	RadioButton radio, radio1, radio2, radio3, radio4;
	RadioGroup radiogrupo;
	Boolean presione=false ,presione1=false,presione2=false,presione3=false, presione4=false;
		

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_options_reg_ex);
		
		
		radio=(RadioButton)findViewById(R.id.radio0);
        radio1=(RadioButton)findViewById(R.id.radio1);
        radio2=(RadioButton)findViewById(R.id.radio2);
        radio3=(RadioButton)findViewById(R.id.radio3);
        radio4=(RadioButton)findViewById(R.id.radio4);
        radiogrupo=(RadioGroup)findViewById(R.id.radioGroup1);
      
        radiogrupo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				
				if(radio.getId()==checkedId){
					presione=true;
					presione1=false;
					presione2=false;
					presione3=false;
					presione4=false;
				
				}
				
				if(radio1.getId()==checkedId){
					presione=false;
					presione1=true;
					presione2=false;
					presione3=false;
					presione4=false;
				
				}
				
				if(radio2.getId()==checkedId){
					presione=false;
					presione1=false;
					presione2=true;
					presione3=false;
					presione4=false;
				
				}
				
				if(radio3.getId()==checkedId){
					presione=false;
					presione1=false;
					presione2=false;
					presione3=true;
					presione4=false;
				
				}
				
				if(radio4.getId()==checkedId){
					presione=false;
					presione1=false;
					presione2=false;
					presione3=false;
					presione4=true;
				
				}
				
			}
		});
		
		
		
	}
	
	public void Aceptar (View v){
		if(presione==true){

			Intent inten=new Intent(this, RegEx.class);	
			inten.putExtra("1","0");
	    	this.startActivity(inten);
	    	
	    	 Toast.makeText(this, "Sólo se puede utilizar el L {a,b} ", Toast.LENGTH_LONG).show();
	
    	}
		
		if(presione1==true){

			Intent inten=new Intent(this, RegEx.class);	
			inten.putExtra("1","1");
	    	this.startActivity(inten);
	    	
	    	Toast.makeText(this, "Sólo se puede utilizar el L {0,1} ", Toast.LENGTH_LONG).show();
	
    	}
		
		if(presione2==true){

			Intent inten=new Intent(this, RegEx.class);	
			inten.putExtra("1","2");
	    	this.startActivity(inten);
	    	
	    	Toast.makeText(this, "Sólo se puede utilizar el L {a,b,c} ", Toast.LENGTH_LONG).show();
	
    	}
		
		if(presione3==true){

			Intent inten=new Intent(this, RegEx.class);	
			inten.putExtra("1","3");
	    	this.startActivity(inten);
	
	    	Toast.makeText(this, "Correo electrónico", Toast.LENGTH_LONG).show();
    	}
		
		if(presione4==true){

			Intent inten=new Intent(this, RegEx.class);	
			inten.putExtra("1","4");
	    	this.startActivity(inten);
	
	    	Toast.makeText(this, "(http(s)://,ftp(s)://,www.)", Toast.LENGTH_LONG).show();
    	}
		
	}

	

}
