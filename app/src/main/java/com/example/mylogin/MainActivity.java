package com.example.mylogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


   public Button button;
    public EditText id_edit;
    public EditText pw_edit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id_edit =(EditText) findViewById(R.id.id_edit);
                pw_edit = (EditText)findViewById(R.id.pw_edit);

                if(id_edit.getText().toString().equals("1") && pw_edit.getText().toString().equals("1")){
                    Intent intent = new Intent(getApplicationContext(),FirstActivity.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(getApplicationContext(),"로그인 실패",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}