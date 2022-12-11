package com.anilkumar.ak;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class Home extends AppCompatActivity {
//    TextView emailhome,uidhome;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

//        emailhome=(TextView)findViewById(R.id.email_home);
//        uidhome=(TextView)findViewById(R.id.uidhome);
//
//        emailhome.setText(getIntent().getStringExtra("email").toString());
//        uidhome.setText("UID :"+getIntent().getStringExtra("uid").toString());

//    }
//
//    public void logoutprocess(View view)
//    {
//        FirebaseAuth.getInstance().signOut();
//        startActivity(new Intent(Home.this,MainActivity.class));
    }
}
