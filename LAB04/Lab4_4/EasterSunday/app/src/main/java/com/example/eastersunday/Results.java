package com.example.eastersunday;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Results extends AppCompatActivity {

    String year;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        year = getIntent().getExtras().getString("Year");
        EasterSunday easter = new EasterSunday(year);

        TextView result = findViewById(R.id.output);
        String resultDate = easter.getEasterDay();
        result.setText(resultDate);

        Button back = (Button) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onBackPressed();
            }
        });
    }
}
