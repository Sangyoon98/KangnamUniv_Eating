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
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.view.Window;
import android.graphics.Bitmap;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebSettings;
import android.widget.Button;
import android.widget.EditText;
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
import android.provider.ContactsContract.
        CommonDataKinds.Im;
import android.util.Log;

public class bap extends Activity {
    private WebView webView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bap);

        ActionBar actionBar = getActionBar();
        actionBar.hide();


        {
            Button bt1 = (Button) findViewById(R.id.bt1);

            bt1.setOnClickListener(new OnClickListener() {
                public void onClick(View v) {
                    Intent i = new Intent(bap.this, dosirak.class);
                    startActivity(i);
                }

                {
                    Button bt2 = (Button) findViewById(R.id.bt2);

                    bt2.setOnClickListener(new OnClickListener() {
                        public void onClick(View v) {
                            Intent i = new Intent(bap.this, bunsik.class);
                            startActivity(i);
                        }

                        {
                            Button bt3 = (Button) findViewById(R.id.bt3);

                            bt3.setOnClickListener(new OnClickListener() {
                                public void onClick(View v) {
                                    Intent i = new Intent(bap.this, burrito.class);
                                    startActivity(i);
                                }

                                {
                                    Button bt4 = (Button) findViewById(R.id.bt4);

                                    bt4.setOnClickListener(new OnClickListener() {
                                        public void onClick(View v) {
                                            Intent i = new Intent(bap.this, chinese.class);
                                            startActivity(i);
                                        }

                                        {
                                            Button bt5 = (Button) findViewById(R.id.bt5);

                                            bt5.setOnClickListener(new OnClickListener() {
                                                public void onClick(View v) {
                                                    Intent i = new Intent(bap.this, chicken.class);
                                                    startActivity(i);
                                                }

                                                {
                                                    Button bt6 = (Button) findViewById(R.id.bt6);

                                                    bt6.setOnClickListener(new OnClickListener() {
                                                        public void onClick(View v) {
                                                            Intent i = new Intent(bap.this, pizza.class);
                                                            startActivity(i);
                                                        }

                                                        {
                                                            Button bt7 = (Button) findViewById(R.id.bt7);

                                                            bt7.setOnClickListener(new OnClickListener() {
                                                                public void onClick(View v) {
                                                                    Intent i = new Intent(bap.this, korean.class);
                                                                    startActivity(i);
                                                                }

                                                                {
                                                                    Button bt8 = (Button) findViewById(R.id.bt8);

                                                                    bt8.setOnClickListener(new OnClickListener() {
                                                                        public void onClick(View v) {
                                                                            Intent i = new Intent(bap.this, etc.class);
                                                                            startActivity(i);
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });
        }
    }
}
