package com.example.myapplication01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View view){
        System.out.println("this is view:"+view);
        Intent intent=new Intent(this,DisplayMessageActivity.class);
        System.out.println(((EditText)findViewById(R.id.editText)).getText().toString());
        //
        startActivity(intent);
    }
}
