package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText t1,t2;
    Button b1,b2,b3,b4;
    TextView t3;
    Integer i1,i2,i3;
    String s;
    Float f1,f2,f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(EditText)findViewById(R.id.t1);
        t2=(EditText)findViewById(R.id.t2);
        b1=(Button)findViewById(R.id.b1);

        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        t3=(TextView) findViewById(R.id.t3);
    }
    public void add(View view) {
        i1=Integer.parseInt(t1.getText().toString());
        i2=Integer.parseInt(t2.getText().toString());
        i3=i1+i2;
        s=String.valueOf(i3);
        t3.setText(s);
    }
    public void sub(View view) {
        i1=Integer.parseInt(t1.getText().toString());
        i2=Integer.parseInt(t2.getText().toString());
        i3=i1-i2;
        s=String.valueOf(i3);
        t3.setText(s);
    }
    public void mul(View view) {
        i1=Integer.parseInt(t1.getText().toString());
        i2=Integer.parseInt(t2.getText().toString());
        i3=i1*i2;
        s=String.valueOf(i3);
        t3.setText(s);
    }
    public void div(View view) {
        f1=Float.valueOf(t1.getText().toString());
        f2=Float.valueOf(t2.getText().toString());
        f=f1/f2;
        t3.setText(Float.toString(f));
    }
}

