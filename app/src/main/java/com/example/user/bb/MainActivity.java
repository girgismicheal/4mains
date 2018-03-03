package com.example.android.activity_main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.user.bb.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        final EditText txt;
        final EditText txt2;
        final EditText txt3;
        Button button;
        txt = (EditText) findViewById( R.id.editText3 );
        txt2 = (EditText) findViewById( R.id.editText4 );
        txt3 = (EditText) findViewById( R.id.editText6 );
        button=(Button)findViewById( R.id.button8 );
        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            int n1 =Integer.parseInt(txt.getText().toString());
            int n2 =Integer.parseInt( txt2.getText().toString() );
            int nr =n1 + n2;
            txt3.setText(String.valueOf( nr ) );

            }
        } );
    }
}
