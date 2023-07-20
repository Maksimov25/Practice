package com.example.apppractic;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AnyToasts extends AppCompatActivity {
    public void toastOpslogin(){
        Toast toast = Toast.makeText(getApplicationContext(),
                "Empty login!", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void toastOpspassword(){
        Toast toast = Toast.makeText(getApplicationContext(),
                "Empty password!", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void toastOpspasswordshort(){
        Toast toast = Toast.makeText(getApplicationContext(),
                "Password smaller then 5 points!", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void toastOpsloginshort(){
        Toast toast = Toast.makeText(getApplicationContext(),
                "Login smaller then 5 points!", Toast.LENGTH_SHORT);
        toast.show();
    }
}
