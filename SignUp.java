package com.example.amany.myapplication1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Amany on 2016-10-26.
 */

public class SignUp extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
    }
    public void onSignUpClick(View v){
        if(v.getId()== R.id.Bsignupbutton){
            EditText name = (EditText) findViewById(R.id.TFname);
            EditText email = (EditText) findViewById(R.id.TFemailaddress);
            EditText user = (EditText) findViewById(R.id.TFusername);
            EditText pass1 = (EditText) findViewById(R.id.TFpassword);
            EditText pass2 = (EditText) findViewById(R.id.TFconfirmpassword);

            String namestr = name.getText().toString();
            String emailstr = email.getText().toString();
            String userstr = user.getText().toString();
            String pass1str = pass1.getText().toString();
            String pass2str = pass2.getText().toString();

            if (!pass1str.equals(pass2str)){
                //pop message
                Toast pass = Toast.makeText(SignUp.this, "Passwords don't match!", Toast.LENGTH_SHORT);
                pass.show();
            }
        }
    }
}
