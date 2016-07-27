package com.example.student.t072602;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.ContextMenu;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    final int OPTION_C = 3;

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tv = (TextView) findViewById(R.id.textView);
        registerForContextMenu(tv);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.add("AA");
        menu.add("BB");
        menu.add("CC");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        if (item.getTitle().equals("AA"))
        {
            Toast.makeText(MainActivity.this, "Context AA", Toast.LENGTH_SHORT).show();
        }

        return super.onContextItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        // getMenuInflater().inflate(R.menu.menu_main, menu);
        menu.add(0, 0, Menu.NONE,"AA");
        menu.add(0, 1, Menu.NONE,"BB");
        menu.add(0, OPTION_C, Menu.NONE,"CC");


        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        if (id == 1)
        {
            Toast.makeText(MainActivity.this, "BB", Toast.LENGTH_SHORT).show();
            return true;
        }

        if (id == OPTION_C)
        {
            Toast.makeText(MainActivity.this, "CC", Toast.LENGTH_SHORT).show();
            return true;
        }
        /*
        if (id == R.id.action_settings) {
            Toast.makeText(MainActivity.this, "Settings", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (id == R.id.action_about) {
            Toast.makeText(MainActivity.this, "About", Toast.LENGTH_SHORT).show();
            return true;
        }
*/
        return super.onOptionsItemSelected(item);
    }
}