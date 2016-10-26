package com.example.amany.myapplication1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate (R.menu.main_menu, menu);
        return true;
    }*/
    public void onButtonClick(View v) {
        if (v.getId() == R.id.BLogin) {
            EditText a = (EditText) findViewById(R.id.TFusername);
            String str = a.getText().toString();
            Intent i = new Intent(MainActivity.this, display.class);
            i.putExtra("Username", str);
            startActivity(i);
        }
        if (v.getId() == R.id.Bsignup) {
            Intent i = new Intent(MainActivity.this, SignUp.class);
            startActivity(i);
    }

    /*@Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if (id == R.id.action_settings){
            return true;
        }
            return super.onOptionsItemSelected(item);
    }*/

}
