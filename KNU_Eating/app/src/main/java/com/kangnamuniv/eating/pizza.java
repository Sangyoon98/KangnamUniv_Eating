package com.kangnamuniv.eating;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.view.View.OnClickListener.*;
import android.widget.Button.*;
import android.content.*;
import android.net.*;
import android.app.Activity.*;
import android.media.MediaPlayer.*;
import android.os.Bundle.*;
import android.app.AlertDialog.*;
import android.content.DialogInterface.*;
import android.os.Bundle.*;
import android.view.View.*;
import android.webkit.*;
import android.media.*;
import android.widget.Toast.*;
import android.app.Activity;
import android.widget.EditText.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import android.app.Activity;
import android.content.Context;
import android.database.SQLException;
import android.os.Bundle;
import android.provider.ContactsContract.CommonDataKinds.Im;
import android.util.Log;


public class pizza extends Activity
{

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pizza);
		
		{Button pizza1 = (Button) findViewById(R.id.pizza1);

			pizza1.setOnClickListener(new OnClickListener(){ public void onClick(View v){
		Intent i=new Intent(pizza.this,pizza1.class);
		startActivity(i);}
		
					{Button pizza2 = (Button) findViewById(R.id.pizza2);

						pizza2.setOnClickListener(new OnClickListener(){ public void onClick(View v){
									Intent i=new Intent(pizza.this,pizza2.class);
									startActivity(i);}
									
								{Button pizza3 = (Button) findViewById(R.id.pizza3);

									pizza3.setOnClickListener(new OnClickListener(){ public void onClick(View v){
												Intent i=new Intent(pizza.this,pizza3.class);
												startActivity(i);}
												
											{Button pizza4 = (Button) findViewById(R.id.pizza4);

												pizza4.setOnClickListener(new OnClickListener(){ public void onClick(View v){
															Intent i=new Intent(pizza.this,pizza4.class);
															startActivity(i);}
															
														{Button pizza5 = (Button) findViewById(R.id.pizza5);

															pizza5.setOnClickListener(new OnClickListener(){ public void onClick(View v){
																		Intent i=new Intent(pizza.this,pizza5.class);
																		startActivity(i);}
	});
}});}});}});}});}}}
