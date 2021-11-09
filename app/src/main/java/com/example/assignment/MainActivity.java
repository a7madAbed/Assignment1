package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private static final String Name ="NAME";
    private static final String Pass = "PASS";
    private static final String Flag = "FLAG";
    private CheckBox chk;
    private EditText edtName;
    private EditText edtPass;
    private SharedPreferences sharedPreference;
    private SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chk = findViewById(R.id.chkRemember);
        edtName = findViewById(R.id.edtName);
        edtPass = findViewById(R.id.edtPassword);
        sharedPreference = PreferenceManager.getDefaultSharedPreferences(this);
        editor = sharedPreference.edit();
        chechPref();
    }

    private void chechPref() {
        boolean flag = sharedPreference.getBoolean(Flag,false);

        if (flag) {
            String name = sharedPreference.getString(Name,"");
            String pass = sharedPreference.getString(Pass,"");
            edtName.setText(name);
            edtPass.setText(pass);
            chk.setChecked(true);
        }
    }

    public void btnOnClickLogin(View view) {
        String name = edtName.getText().toString();
        String pass= edtPass.getText().toString();
        if (chk.isChecked()) {
            editor.putString(Name,name);
            editor.putString(Pass,pass);
            editor.putBoolean(Flag,true);
            editor.commit();
        }
        Intent intent =new Intent(this,MainActivity2.class);
        startActivity(intent);
    }


}