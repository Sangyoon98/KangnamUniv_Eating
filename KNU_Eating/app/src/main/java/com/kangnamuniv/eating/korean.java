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


public class korean extends Activity
{

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.korean);

		{Button korean1 = (Button) findViewById(R.id.korean1);

			korean1.setOnClickListener(new OnClickListener(){ public void onClick(View v){
		Intent i=new Intent(korean.this,korean1.class);
		startActivity(i);}
						
					{Button korean2 = (Button) findViewById(R.id.korean2);

						korean2.setOnClickListener(new OnClickListener(){ public void onClick(View v){
									Intent i=new Intent(korean.this,korean2.class);
									startActivity(i);}
									
								{Button korean3 = (Button) findViewById(R.id.korean3);

									korean3.setOnClickListener(new OnClickListener(){ public void onClick(View v){
												Intent i=new Intent(korean.this,korean3.class);
												startActivity(i);}
												
											{Button korean4 = (Button) findViewById(R.id.korean4);

												korean4.setOnClickListener(new OnClickListener(){ public void onClick(View v){
															Intent i=new Intent(korean.this,korean4.class);
															startActivity(i);}
	});
}});}});}});}}}
