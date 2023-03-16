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


public class bunsik extends Activity
{

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bunsik);
		
		{Button bunsik1 = (Button) findViewById(R.id.bunsik1);

			bunsik1.setOnClickListener(new OnClickListener(){ public void onClick(View v){
		Intent i=new Intent(bunsik.this,bunsik1.class);
		startActivity(i);}
		
					{Button bunsik2 = (Button) findViewById(R.id.bunsik2);

						bunsik2.setOnClickListener(new OnClickListener(){ public void onClick(View v){
									Intent i=new Intent(bunsik.this,bunsik2.class);
									startActivity(i);}
								
								{Button bunsik3 = (Button) findViewById(R.id.bunsik3);

									bunsik3.setOnClickListener(new OnClickListener(){ public void onClick(View v){
												Intent i=new Intent(bunsik.this,bunsik3.class);
												startActivity(i);}
											
											{Button bunsik4 = (Button) findViewById(R.id.bunsik4);

												bunsik4.setOnClickListener(new OnClickListener(){ public void onClick(View v){
															Intent i=new Intent(bunsik.this,bunsik4.class);
															startActivity(i);}
																
														{Button bunsik5 = (Button) findViewById(R.id.bunsik5);

															bunsik5.setOnClickListener(new OnClickListener(){ public void onClick(View v){
																		Intent i=new Intent(bunsik.this,bunsik5.class);
																		startActivity(i);}
																	
												
	});
}});}});}});}});}}}
