package com.example.tema1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText nume;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initilizare();
       clickOnButton();
    }
    public void initilizare() {
       btn=findViewById(R.id.button);
       nume=findViewById(R.id.naiba);
        txt=findViewById(R.id.nume_text);

    }
    public void clickOnButton() {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    String naame=nume.getText().toString();
                    txt.setText("Hello "+naame);

            }
        });
    }

}