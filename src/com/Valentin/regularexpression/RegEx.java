package com.Valentin.regularexpression;


import java.util.regex.Matcher;
import java.util.regex.Pattern;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegEx extends Activity {
	
	 String cad;
	 EditText palabra;
	 TextView resultado;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_reg_ex);
		
		
		palabra=(EditText)findViewById(R.id.meter);
		resultado=(TextView)findViewById(R.id.resu);
		
		
	}
	
	
	public boolean onKeyDown(int keyCode, KeyEvent event) { //boton regresar
	    if (keyCode == KeyEvent.KEYCODE_BACK) {
	    	
	    	Intent inten=new Intent(this, RegEx.class);	
			this.startActivity(inten);
	    }
	    return super.onKeyDown(keyCode, event);
	}


	
	
	public void Validar (View v) {
		                                                                       
		try{
		
		//regresa intent que lleva la aplicación
        Intent lanzador=this.getIntent();
      //OBTENER SECUENCIA DE CARACTERES, EL "NOMBRE" ES LO MISMO QUE ESTA EN ACTIVIDAD UNO
        cad=lanzador.getCharSequenceExtra("1").toString(); 
     //  Toast.makeText(this, "se envio "+cad, Toast.LENGTH_LONG).show();
        
        
        if(cad.contentEquals("0")){
        	     		
        	//a*b(ba*b)*ba*		------------- no. de "b" que sea par
        		Pattern exp = Pattern.compile("a*b(ba*b)*ba*");
        	
        		Matcher emp;
        		
        			String palab = palabra.getText().toString();
        			
        			if (palab.charAt(0)!='s'){
        				
        			emp = exp.matcher(palab);
        			
        			if(emp.matches())
        				resultado.setText("Palabra Aceptada");
        			else
        				resultado.setText("Palabra NO Aceptada");
        			
        			}
        	
        		}
        
        if(cad.contentEquals("1")){
     		
        	//(0)*11(1)* -------------> (0*+1)(1)*   --------- no contenga "10"
    		Pattern exp = Pattern.compile("(0*|1)(1)*");
        	
        		Matcher emp;
        		
        			String palab = palabra.getText().toString();
        			
        			if (palab.charAt(0)!='s'){
        				
        			emp = exp.matcher(palab);
        			
        			if(emp.matches())
        				resultado.setText("Palabra Aceptada");
        			else
        				resultado.setText("Palabra NO Aceptada");
        			
        			}
        		}
        
        if(cad.contentEquals("2")){
     		
        	//(b+c)*aa*(b(b+c)*a)*c(a+b+c)*   ---------- contenga "ac"
    		Pattern exp = Pattern.compile("(b|c)*a(a)*(b*(b|c)*a)*c(a|b|c)*");
        	
        		Matcher emp;
        		
        			String palab = palabra.getText().toString();
        			
        			if (palab.charAt(0)!='s'){
        				
        			emp = exp.matcher(palab);
        			
        			if(emp.matches())
        				resultado.setText("Palabra Aceptada");
        			else
        				resultado.setText("Palabra NO Aceptada");
        			
        			}
        	}
        
        if(cad.contentEquals("3")){
     		
        	// correo electrónico
        		Pattern exp = Pattern.compile("^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,3})+$");
        	
        		Matcher emp;
        		
        			String palab = palabra.getText().toString();
        			
        			if (palab.charAt(0)!='s'){
        				
        			emp = exp.matcher(palab);
        			
        			if(emp.matches())
        				resultado.setText("Palabra Aceptada");
        			else
        				resultado.setText("Palabra NO Aceptada");
        			
        			}
        	}
        
        if(cad.contentEquals("4")){
     		
        	// URL
        		Pattern exp = Pattern.compile("(((ht|f)tp(s?)\\:\\/\\/|~\\/|\\/)|www.)(([-\\w]+))(.com.mx)+$" );
        	
        		Matcher emp;
        		
        			String palab = palabra.getText().toString();
        			
        			if (palab.charAt(0)!='s'){
        				
        			emp = exp.matcher(palab);
        			
        			if(emp.matches())
        				resultado.setText("Palabra Aceptada");
        			else
        				resultado.setText("Palabra NO Aceptada");
        			
        			}
        		}
		}
		
		catch (Exception e) {
			
			Toast.makeText(this, "No elegiste alguna opción o dejaste en blanco el campo", Toast.LENGTH_SHORT).show();
			
			
		}
        
        
        
	}
        
        
        
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void Elegir (View v)
	{
		Intent inten=new Intent(this, OptionsRegEx.class);
    	
    	//lanzamos intent
    	this.startActivity(inten);
	}
	
	public void Salir (View v)
	{
		Intent inten=new Intent(this, Exit.class);
    	
    	//lanzamos intent
    	this.startActivity(inten);
	}
	
	

}
