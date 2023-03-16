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
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        ActionBar actionBar = getActionBar();
        actionBar.hide();

        AlertDialog.Builder builder = new
                AlertDialog.Builder(this);
        builder.setTitle("강남대 뭐먹지?");
        builder.setMessage("이 어플은 강남대학교 주변의 맛집을 소개해주는 어플입니다.\n이 어플은 상업적 용도로 쓰이지 않으며 학술제 신재복팀의 결과물입니다.");
        builder.setPositiveButton("확인", new
                DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
        builder.show();

        startActivity(new Intent(this, splash.class));


        {
            Button Button1 = (Button) findViewById(R.id.Button1);

            Button1.setOnClickListener(new OnClickListener() {
                public void onClick(View v) {
                    Intent i = new Intent(MainActivity.this, bap.class);
                    startActivity(i);
                }


                {
                    Button Button2 = (Button) findViewById(R.id.Button2);

                    Button2.setOnClickListener(new OnClickListener() {
                        public void onClick(View v) {
                            Intent i = new Intent(MainActivity.this, game.class);
                            startActivity(i);
                        }
                    });
                }
            });
        }
    }
}
