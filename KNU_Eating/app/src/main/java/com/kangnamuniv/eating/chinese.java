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


public class chinese extends Activity
{

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chinese);
		
		{Button chinese1 = (Button) findViewById(R.id.chinese1);

			chinese1.setOnClickListener(new OnClickListener(){ public void onClick(View v){
		Intent i=new Intent(chinese.this,chinese1.class);
		startActivity(i);}
						
					{Button chinese2 = (Button) findViewById(R.id.chinese2);

						chinese2.setOnClickListener(new OnClickListener(){ public void onClick(View v){
									Intent i=new Intent(chinese.this,chinese2.class);
									startActivity(i);}
									
								{Button chinese3 = (Button) findViewById(R.id.chinese3);

									chinese3.setOnClickListener(new OnClickListener(){ public void onClick(View v){
												Intent i=new Intent(chinese.this,chinese3.class);
												startActivity(i);}
	});
}});}});}}}
