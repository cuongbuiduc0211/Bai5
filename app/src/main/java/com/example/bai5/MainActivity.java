package com.example.bai5;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnAdd;
    private EditText numberA;
    private EditText numberB;
    private int a, b, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        numberA = (EditText) findViewById(R.id.numberA);
        numberB = (EditText) findViewById(R.id.numberB);
        btnAdd.setOnClickListener(this);
//        btnAdd.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    a = Integer.parseInt(numberA.getText().toString());
//                    b = Integer.parseInt(numberB.getText().toString());
//                    result = a + b;
//                    Toast.makeText(MainActivity.this, "Result: " + result, Toast.LENGTH_SHORT).show();
//                } catch (Exception e) {
//                    Toast.makeText(MainActivity.this, "Please input a number", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
        btnAdd.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(MainActivity.this, "This is onlonglicklistener", Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnAdd:
                try {
                    a = Integer.parseInt(numberA.getText().toString());
                    b = Integer.parseInt(numberB.getText().toString());
                    result = a + b;
                    Toast.makeText(MainActivity.this, "Result: " + result, Toast.LENGTH_SHORT).show();
                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "Please input a number", Toast.LENGTH_SHORT).show();
                }
                break;
            default:
                break;
        }
    }
}