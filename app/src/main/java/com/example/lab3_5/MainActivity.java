package com.example.lab3_5;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    Button bt1, bt2;
    LinearLayout lay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1 = (Button) findViewById(R.id.button1);
        bt2 = (Button) findViewById(R.id.button2);
        registerForContextMenu(bt1);
        registerForContextMenu(bt2);
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater mInflater = getMenuInflater();
        if (v == bt1) {
            menu.setHeaderTitle("Changing the background color");
            mInflater.inflate(R.menu.menu1, menu);
        }
        if (v == bt2) {
            mInflater.inflate(R.menu.menu2, menu);
        }
    }
        @Override
        public boolean onContextItemSelected(MenuItem item){
            switch (item.getItemId()) {
                case R.id.menu1_red:
                    lay.setBackgroundColor(Color.RED);
                    return true;
                case R.id.menu1_green:
                    lay.setBackgroundColor(Color.GREEN);
                    return true;
                case R.id.menu1_blue:
                    lay.setBackgroundColor(Color.BLUE);
                    return true;
                case R.id.menu2_gray:
                    lay.setBackgroundColor(Color.GRAY);
                    return true;
                case R.id.menu2_yellow:
                    lay.setBackgroundColor(Color.YELLOW);
                    return true;
            }
            return false;
        }
    }
